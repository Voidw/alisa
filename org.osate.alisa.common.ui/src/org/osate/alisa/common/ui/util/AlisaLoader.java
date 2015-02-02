package org.osate.alisa.common.ui.util;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.osate.alisa.common.ui.internal.CommonActivator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class AlisaLoader {

	public static boolean isWindows() {
		return System.getProperty("os.name").startsWith("Windows");
	}

	public static boolean alisaInvoke(String className, String methodName, Object[] args) {

		try {
			// see
			// http://stackoverflow.com/questions/12714368/load-a-class-to-java-classpath-dynamically-using-eclipse-and-osgi

			/**
			 * List of the files referenced in the classpath
			 */
			List<String> classPathFiles;
			classPathFiles = new ArrayList<String>();

			/**
			 * Try to list all the projects and see where there are class files
			 * to load (typically, in the bin/ directory).
			 */
//			String cp = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
//			cp = cp + "/testresourcebudget/bin/";
//			System.out.println("test=" + cp);
//			classPathFiles.add(cp);
			for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
				String path;
				path = project.getLocation().toString();
				path = path + "/bin";
//				System.out.println("test=" + path);
				classPathFiles.add(path);

			}

			/**
			 * Add all the paths from the current system class loader.
			 */
			ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

			URL[] systemLoaderurls = ((URLClassLoader) systemClassLoader).getURLs();

			for (URL url : systemLoaderurls) {
				System.out.println("url=" + url.getFile());
				File mainFile = new File(url.getFile());
				File parent = new File(mainFile.getParent());
				for (File f : parent.listFiles()) {
					classPathFiles.add(f.getAbsolutePath());
//					System.out.println("file=" + f.getAbsolutePath());
				}
			}

			/**
			 * Get all bundles and add them to the classpath as well.
			 */
			BundleContext bundleContext = CommonActivator.getInstance().getBundle().getBundleContext();
			Bundle[] allBundles = bundleContext.getBundles();
			for (Bundle bundle : allBundles) {
				String bundleLocation = bundle.getLocation();
				if (bundleLocation.endsWith("jar")) {
					continue;
				}

				// remove the prefix to find the file
				// and adapt to the OS naming scheme
				bundleLocation = bundleLocation.replaceAll("reference:file:/", "");
//				System.out.println("loc1=" + loc);
				if (isWindows()) {
					if (bundleLocation.contains("/")) {
						bundleLocation = bundleLocation.replace('/', '\\');
					}
					bundleLocation = bundleLocation + "bin\\";
				} else {
					bundleLocation = "/" + bundleLocation + "bin/";
				}

//				System.out.println("bundleLocation=" + bundleLocation);
				classPathFiles.add(bundleLocation);

			}

			/**
			 * Now, build the URL list of all classpaths
			 * and put each of them in an array.
			 */
			URL[] urllist = new URL[classPathFiles.size()];
			for (int i = 0; i < classPathFiles.size(); i++) {
				urllist[i] = new File(classPathFiles.get(i)).toURL();
			}

			/**
			 * Finally build the classloader and invoke the method.
			 */
			ClassLoader parentClassLoader;

			if ((args == null) || (args.length == 0)) {
				parentClassLoader = Thread.currentThread().getContextClassLoader();
			} else {
				parentClassLoader = args[0].getClass().getClassLoader();
			}

			URLClassLoader urlClassLoader = new URLClassLoader(urllist, parentClassLoader);
			Thread.currentThread().setContextClassLoader(urlClassLoader);
			Class c = Class.forName(className, true, urlClassLoader);

			Method method;
			method = null;
//			for (Method m : c.getMethods()) {
//
//				if (m.getName().equalsIgnoreCase(methodName)) {
//					System.out.println("method m=" + m.getName());
//					for (Class paramType : m.getParameterTypes()) {
//						System.out.println("   param p=" + paramType.getCanonicalName());
//						System.out.println("   param p=" + paramType.getClassLoader());
//
//					}
//					method = m;
//				}
//			}
			Object o = c.newInstance();
			Class[] parametersTypes;
			parametersTypes = null;
			if (args != null) {
				parametersTypes = new Class[args.length];
				for (int i = 0; i < args.length; i++) {
					parametersTypes[i] = args[i].getClass();
//					System.out.println("   args[" + i + "]=" + args[i].getClass().getCanonicalName());
//					System.out.println("   args[" + i + "]=" + args[i].getClass().getClassLoader());

				}
			}
			method = c.getMethod(methodName, parametersTypes);
			Object obj = method.invoke(o, args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
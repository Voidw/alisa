package org.osate.alisa.common.ui.handlers;

import java.io.ByteArrayInputStream
import java.text.SimpleDateFormat
import java.util.Calendar
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IAdaptable
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.osate.aadl2.instance.ComponentInstance
import org.osate.aadl2.instance.InstanceObject
import org.osate.aadl2.instance.SystemInstance

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension org.osate.aadl2.modelsupport.resources.OsateResourceUtil.*

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see IHandler
 * @see AbstractHandler
 */
class SpotlightExportHandler extends AbstractHandler {
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	override Object execute(ExecutionEvent event) throws ExecutionException {
		val window = HandlerUtil.getActiveWorkbenchWindowChecked(event)
		if (window != null){
			val selection = window.getSelectionService().getSelection() as IStructuredSelection
			val firstElement = selection.getFirstElement()
			var SystemInstance systemInstance = null
			
			if (firstElement instanceof IAdaptable){
				val project = 
					switch firstElement{
						SystemInstance : {
							systemInstance = ((firstElement as IAdaptable).getAdapter(SystemInstance)) as SystemInstance
							(systemInstance.eResource.convertToIResource as IFile).project
						}
						IFile : {
							val potentialFile = (firstElement as IAdaptable).getAdapter(IFile) as IFile
							if (potentialFile.name.endsWith(".aaxl2")){
								systemInstance = potentialFile.resource.contents.head as SystemInstance
								potentialFile.project
							}
						}
						InstanceObject : {
							val instanceObject = ((firstElement as IAdaptable).getAdapter(InstanceObject)) as InstanceObject
							systemInstance =  instanceObject.getContainerOfType(SystemInstance)
							(systemInstance.eResource.convertToIResource as IFile).project
						}
					}
				if (systemInstance == null){
					return null
				}
				
				val spotlightFolder = project.getSpotlightFolder();


				val spotlightComponentFile = spotlightFolder.getFile(systemInstance.name + "_components" + ".csv")
				if (spotlightComponentFile.exists){
					spotlightComponentFile.delete(true,null)
				}
				val newSpotlightComponentFile = spotlightFolder.getFile(systemInstance.name  + "_components" + ".csv")
				newSpotlightComponentFile.create(new ByteArrayInputStream(systemInstance.generateComponentList.bytes), false, null)

				val spotlightRequirementsFile = spotlightFolder.getFile(systemInstance.name + "_requirements" + ".csv")
				if (spotlightRequirementsFile.exists){
					spotlightRequirementsFile.delete(true,null)
				}
				val newSpotlightRequirementsFile = spotlightFolder.getFile(systemInstance.name  + "_requirements" + ".csv")
				newSpotlightRequirementsFile.create(new ByteArrayInputStream(systemInstance.generateRequirementsList.bytes), false, null)

				project.refreshLocal(IResource.DEPTH_ONE, null)
			}
		}
		null
	}
	
	def String generateComponentList(SystemInstance systemInstance){
		//systemInstance.getAllContents(true).filter(ComponentInstance).toList.join(System.getProperty("line.separator"), [name + "," + "1"])
		systemInstance.getAllContents(true).filter(ComponentInstance).toList.join(System.getProperty("line.separator"), [fullName])
//		systemInstance.getAllContents(true).filter(NamedElement).toList.join(System.getProperty("line.separator"), [name])
		//systemInstance.getAllContents(true).filter(ComponentInstance).filter[getAllComponentInstances().empty].toList.join(System.getProperty("line.separator"), [name])
		//systemInstance.getAllContentsOfType(ComponentInstance).join(System.getProperty("line.separator"), [name + "," + "1"])
		//systemInstance.getAllComponentInstances().join(System.getProperty("line.separator"), [name + "," + "1"])
	}
	
	def String generateRequirementsList(SystemInstance systemInstance){
		systemInstance.getAllContents(true).filter(ComponentInstance).toList.forEach[compInstance |
			// code to get requirements and scores
			
				
		]// code to build string.join(System.getProperty("line.separator"), [fullName])
		"To do: create comma separated list of requirements and scores"
	}
	
	def IFolder getSpotlightFolder(IProject project){
		if (project.exists() && !project.isOpen()) {
			project.open(null)
		}	
		val spotlightFolder = project.getFolder("spotlight");
		if (!spotlightFolder.exists()) {
			spotlightFolder.create(true,false,null)
		}
		spotlightFolder
	}
	
	def ByteArrayInputStream getSpotlightComponentStream(String comp){

		var cal = Calendar.getInstance()
		val sdf = new SimpleDateFormat("HH:mm:ss")
		var ts =  sdf.format(cal.getTime())	
		val content = "test: " + ts
		new ByteArrayInputStream(content.bytes) 	
	}
}

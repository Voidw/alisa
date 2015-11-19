/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

package org.osate.assure.ui.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

	public abstract class AlisaHandler extends AbstractHandler {
	    protected static final String TERMINATE_ID = "org.osate.alisa.commands.terminate";
	    protected static final String TERMINATE_ALL_ID = "org.osate.alisa.commands.terminateAll";
	    protected IWorkbenchWindow window;
		protected ExecutionEvent executionEvent;

	    public ExecutionEvent getExecutionEvent() {
			return executionEvent;
		}
		public void setExecutionEvent(ExecutionEvent executionEvent) {
			this.executionEvent = executionEvent;
		}
		abstract protected IStatus runJob(EObject sel, IProgressMonitor monitor);
	    abstract protected String getJobName();

	    @Override
	    public Object execute(ExecutionEvent event) {

	    	ISelection selection = HandlerUtil.getCurrentSelection(event);
	    	if(!(selection instanceof IStructuredSelection)||((IStructuredSelection)selection).size() != 1){
	    		return null;
	    	}
	    	Object selectedObj = ((IStructuredSelection)selection).getFirstElement();
	    	URI uri = null;
	    	if (selectedObj instanceof EObjectNode){
	    		uri = ((EObjectNode)selectedObj).getEObjectURI();
	    	} else if (selectedObj instanceof EObject) {
	    		uri = EcoreUtil.getURI((EObject)selectedObj);
	    	} else {
	    		return null;
	    	}
	        window = HandlerUtil.getActiveWorkbenchWindow(event);
	        if (window == null) {
	            return null;
	        }

	        return executeURI(uri);
	    }

	    public Object executeURI(final URI uri) {
	        final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
	        if (xtextEditor == null) {
	            return null;
	        }
	        if (!saveChanges(window.getActivePage().getDirtyEditors())) {
	            return null;
	        }
	        WorkspaceJob job = getWorkspaceJob(getJobName(), xtextEditor, uri); 
	        scheduleJob(job);
	        return null;
	    }
	    
	    protected Object scheduleJob(WorkspaceJob job){
	        job.setRule(ResourcesPlugin.getWorkspace().getRoot());
	        job.schedule();
	        return null;
	    }
	    
	    protected WorkspaceJob getWorkspaceJob(String jobName, final XtextEditor xtextEditor, final URI uri){
	        WorkspaceJob job = new WorkspaceJob(getJobName()) {
	            @Override
	            public IStatus runInWorkspace(final IProgressMonitor monitor) {
	                return xtextEditor.getDocument().readOnly(new IUnitOfWork<IStatus, XtextResource>() {
	                    @Override
	                    public IStatus exec(XtextResource resource) throws Exception {
	                        EObject eobj = resource.getResourceSet().getEObject(uri, true);
	                            return runJob(eobj, monitor);
	                    }
	                });
	            }
	        };
	        return job;
	    }
	    
	    protected boolean saveChanges(IEditorPart[] dirtyEditors) {
	        if (dirtyEditors.length == 0) {
	            return true;
	        }

	        if (MessageDialog.openConfirm(window.getShell(), "Save editors", "Save editors and continue?")) {
	            NullProgressMonitor monitor = new NullProgressMonitor();
	            for (IEditorPart e : dirtyEditors) {
	                e.doSave(monitor);
	            }
	            return true;
	        } else {
	            return false;
	        }
	    }

//	    protected EObjectNode getEObjectNode(ISelection currentSelection) {
//	        if (currentSelection instanceof IStructuredSelection) {
//	            IStructuredSelection iss = (IStructuredSelection) currentSelection;
//	            if (iss.size() == 1) {
//	                return (EObjectNode) iss.getFirstElement();
//	            }
//	        }
//	        return null;
//	    }

	    protected IWorkbenchWindow getWindow() {
	        return window;
	    }
	}

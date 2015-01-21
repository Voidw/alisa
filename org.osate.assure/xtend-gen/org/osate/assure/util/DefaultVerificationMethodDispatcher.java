package org.osate.assure.util;

import com.google.common.base.Objects;
import junit.framework.AssertionFailedError;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.assure.assure.VerificationActivityResult;
import org.osate.assure.util.AssureUtilExtension;
import org.osate.assure.util.IVerificationMethodDispatcher;
import org.osate.verify.verify.SupportedTypes;
import org.osate.verify.verify.VerificationActivity;
import org.osate.verify.verify.VerificationMethod;

@SuppressWarnings("all")
public class DefaultVerificationMethodDispatcher implements IVerificationMethodDispatcher {
  @Extension
  private AssureUtilExtension aue = new AssureUtilExtension();
  
  public void runVerificationMethod(final VerificationActivityResult verificationActivityResult) {
    try {
      VerificationActivity _target = verificationActivityResult.getTarget();
      final VerificationMethod method = _target.getMethod();
      SupportedTypes _methodType = method.getMethodType();
      boolean _equals = Objects.equal(_methodType, SupportedTypes.SINGLEPREDICATE);
      if (_equals) {
        final String methodpath = method.getMethodPath();
        try {
          String _name = verificationActivityResult.getName();
          String _plus = ((methodpath + "@@") + _name);
          InstanceObject _caseSubject = this.aue.getCaseSubject(verificationActivityResult);
          this.dispatchVerificationMethod(_plus, _caseSubject);
          this.aue.addSuccess(verificationActivityResult);
        } catch (final Throwable _t) {
          if (_t instanceof AssertionFailedError) {
            final AssertionFailedError e = (AssertionFailedError)_t;
            this.aue.addFailure(verificationActivityResult, e);
          } else if (_t instanceof ThreadDeath) {
            final ThreadDeath e_1 = (ThreadDeath)_t;
            throw e_1;
          } else if (_t instanceof Throwable) {
            final Throwable e_2 = (Throwable)_t;
            this.aue.addError(verificationActivityResult, e_2);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void dispatchVerificationMethod(final String methodPath, final InstanceObject target) {
    String _qualifiedName = target.getQualifiedName();
    String _plus = ((("Dispatching " + methodPath) + " on ") + _qualifiedName);
    InputOutput.<String>println(_plus);
  }
}

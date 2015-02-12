package org.osate.assure.analysis;

import com.google.common.base.Objects;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.assure.analysis.AnalysisPluginInterface;
import org.osate.assure.assure.VerificationActivityResult;
import org.osate.assure.util.AssureUtilExtension;
import org.osate.assure.util.DefaultVerificationMethodDispatcher;
import org.osate.assure.util.IVerificationMethodDispatcher;

@SuppressWarnings("all")
public class AnalysisPluginDispatcher extends DefaultVerificationMethodDispatcher implements IVerificationMethodDispatcher {
  /**
   * normal constructor
   */
  public AnalysisPluginDispatcher() {
    super();
  }
  
  public Object dispatchVerificationMethod(final String methodPath, final VerificationActivityResult vr) {
    final InstanceObject target = AssureUtilExtension.getClaimSubject(vr);
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.flowLatencyAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.flowLatencyAnalysis(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.A429Consistency")) {
        _matched=true;
        return AnalysisPluginInterface.A429Consistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.ConnectionBindingConsistency")) {
        _matched=true;
        return AnalysisPluginInterface.ConnectionBindingConsistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.PowerAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.PowerAnalysis(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.PortDataConsistency")) {
        _matched=true;
        return AnalysisPluginInterface.PortDataConsistency(target);
      }
    }
    if (!_matched) {
      if (Objects.equal(methodPath, "org.osate.assure.util.PlatformResourceBudgets.MassAnalysis")) {
        _matched=true;
        return AnalysisPluginInterface.MassAnalysis(target);
      }
    }
    return null;
  }
}

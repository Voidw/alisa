package org.osate.assure.ui.labeling

import org.eclipse.jface.viewers.ColumnLabelProvider
import org.osate.assure.assure.ClaimResult
import org.osate.assure.assure.ElseResult
import org.osate.assure.assure.ThenResult
import org.osate.assure.assure.VerificationActivityResult
import static extension org.osate.assure.util.AssureUtilExtension.*
import org.osate.assure.assure.AssuranceCaseResult
import org.osate.alisa.common.common.ResultIssue
import org.osate.assure.assure.ModelResult
import org.osate.assure.assure.SubsystemResult

class AssureDescriptionColumnLabelProvider extends ColumnLabelProvider{
	
	override getText(Object ele){
		switch ele {
			ClaimResult : ele.constructMessage
			VerificationActivityResult :  ele.constructMessage + ele.resultState.toTextLabel
			AssuranceCaseResult : ele.constructMessage
			ModelResult : ele.constructMessage
			SubsystemResult : ele.constructMessage
			ResultIssue : ele.constructMessage
			ElseResult : 'else'
			ThenResult : 'then'
			default : ''
			
		}
	}

//	def text(ClaimResult ele) {
//		"Claim"+ele.name +": "+ele.constructMessage
//		+ ele.assureResultCounts
//	}
//	
//	def text(VerificationActivityResult ele) {
//		"Evidence "+ele.name +": "+ ele.constructMessage + ele.resultState.toTextLabel
//		+ ele.assureResultCounts
//
//	}
	
//	def text(AssuranceCase ele) {
//		"System "+ele.name +": "+ele.constructMessage		
//		+ ele.assureResultCounts
//	}
//	
//	def text(ResultIssue ele) {
//		if (ele.name == null) return (ele.target?.constructLabel?:"")+ ele.constructMessage
//		ele.name + ": " + ele.constructMessage
//	}
	
//	def text(ElseResult ele) {
//		'else'
//	}
//	def text(ThenResult ele) {
//		'then'
//	}
	
	
}
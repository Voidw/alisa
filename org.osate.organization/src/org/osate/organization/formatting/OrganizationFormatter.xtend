/*
 * generated by Xtext
 */
package org.osate.organization.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
 import com.google.inject.Inject;
 import org.osate.organization.services.OrganizationGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class OrganizationFormatter extends AbstractDeclarativeFormatter {

	@Inject extension OrganizationGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
		c.setAutoLinewrap(120);
		c.setWrappedLineIndentation(2);
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	    for ( pair : _organizationGrammarAccess.findKeywordPairs("[", "]")) {
		      c.setIndentationIncrement().after(pair.first);
		      c.setLinewrap().after(pair.first);
		      c.setIndentationDecrement().before(pair.second);
		      c.setLinewrap().around(pair.second);
		    }
		for (annex : _organizationGrammarAccess.findKeywords("stakeholder")) {
			c.setLinewrap().before(annex);
		}
	}
}

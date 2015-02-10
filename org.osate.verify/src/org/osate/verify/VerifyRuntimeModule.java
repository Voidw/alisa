/*
 * generated by Xtext
 */
package org.osate.verify;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.osate.alisa.common.scoping.AlisaAbstractDeclarativeScopeProvider;
import org.osate.verify.scoping.VerifyScopeProvider;

import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class VerifyRuntimeModule extends org.osate.verify.AbstractVerifyRuntimeModule {

	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.osate.alisa.common.naming.CommonQualifiedNameConverter.class;
	}

	public void configureIScopeProviderDelegate2(com.google.inject.Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(VerifyScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	@SuppressWarnings({ "restriction", "deprecation" })
	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(Names.named(AlisaAbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(org.eclipse.xtext.xbase.scoping.XImportSectionNamespaceScopeProvider.class);// XbaseImportedNamespaceScopeProvider.class);
	}
}

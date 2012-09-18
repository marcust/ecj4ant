/*
 * $ Id $
 * (c) Copyright 2009 Marcus Thiesen (marcus@thiesen.org)
 *
 *  This file is part of ecj4ant.
 *
 *  ecj4ant is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  ecj4ant is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with ecj4ant.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.thiesen.ecj4ant;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;


public class Options {

    public static Map<String,String> defaultOptions() {
        return new HashMap<String,String>() {
            private static final long serialVersionUID = 1L;

            {
                put( CompilerOptions.OPTION_Process_Annotations, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_SuppressWarnings, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_DocCommentSupport, CompilerOptions.ENABLED );
            }

        };
    }

    public static Map<String,String> warnAllOptions() {
        return new HashMap<String, String>() {

            private static final long serialVersionUID = 1L;

            {
                put( CompilerOptions.OPTION_Process_Annotations, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_SuppressWarnings, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_DocCommentSupport, CompilerOptions.ENABLED );

                put( CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_LineNumberAttribute, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_SourceFileAttribute, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_PreserveUnusedLocal, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMethodWithConstructorName, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportOverridingPackageDefaultMethod, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDeprecation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDeprecationInDeprecatedCode, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDeprecationWhenOverridingDeprecatedMethod, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportHiddenCatchBlock, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedLocal, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameter, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameterWhenImplementingAbstract, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameterWhenOverridingConcrete, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameterIncludeDocCommentReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedImport, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportSyntheticAccessEmulation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNoEffectAssignment, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportLocalVariableHiding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportSpecialParameterHidingField, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportFieldHiding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportTypeParameterHiding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportPossibleAccidentalBooleanAssignment, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNonExternalizedStringLiteral, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportIncompatibleNonInheritedInterfaceMethod, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedPrivateMember, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNoImplicitStringConversion, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportAssertIdentifier, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportEnumIdentifier, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNonStaticAccessToStatic, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportIndirectStaticAccess, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportEmptyStatement, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnnecessaryTypeCheck, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnnecessaryElse, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUndocumentedEmptyBlock, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportInvalidJavadoc, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTags, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsDeprecatedRef, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsNotVisibleRef, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsVisibility, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocTags, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagsVisibility, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagsOverriding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocComments, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagDescription, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocCommentsVisibility, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingJavadocCommentsOverriding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportFinallyBlockNotCompletingNormally, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownException, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionWhenOverriding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionIncludeDocCommentReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionExemptExceptionAndThrowable, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnqualifiedFieldAccess, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUncheckedTypeOperation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportRawTypeReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportFinalParameterBound, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingSerialVersion, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportVarargsArgumentNeedCast, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedTypeArgumentsForMethodInvocation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNullReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportPotentialNullReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportRedundantNullCheck, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportAutoboxing, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportAnnotationSuperInterface, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingOverrideAnnotation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingDeprecatedAnnotation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportIncompleteEnumSwitch, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportForbiddenReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDiscouragedReference, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnhandledWarningToken, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedWarningToken, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedLabel, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportParameterAssignment, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportFallthroughCase, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportOverridingMethodWithoutSuperInvocation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportRedundantSuperinterface, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportComparingIdentical, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingSynchronizedOnInheritedMethod, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportMissingHashCodeMethod, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDeadCode, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportDeadCodeInTrivialIfStatement, CompilerOptions.WARNING );

            }

        };


    }


    public static Map<String,String> saneOptions() {
        return new HashMap<String, String>() {

            private static final long serialVersionUID = 1L;

            {
                put( CompilerOptions.OPTION_Process_Annotations, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_SuppressWarnings, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_DocCommentSupport, CompilerOptions.ENABLED );

                put( CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_LocalVariableAttribute, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_LineNumberAttribute, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_SourceFileAttribute, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_PreserveUnusedLocal, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMethodWithConstructorName, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportOverridingPackageDefaultMethod, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportDeprecation, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportDeprecationInDeprecatedCode, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportDeprecationWhenOverridingDeprecatedMethod, CompilerOptions.DISABLED );
                put( CompilerOptions.OPTION_ReportHiddenCatchBlock, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedLocal, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameter, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportUnusedParameterWhenImplementingAbstract, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportUnusedParameterWhenOverridingConcrete, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportUnusedParameterIncludeDocCommentReference, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportUnusedImport, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportSyntheticAccessEmulation, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportNoEffectAssignment, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportLocalVariableHiding, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportSpecialParameterHidingField, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportFieldHiding, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportTypeParameterHiding, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportPossibleAccidentalBooleanAssignment, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportNonExternalizedStringLiteral, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportIncompatibleNonInheritedInterfaceMethod, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedPrivateMember, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportNoImplicitStringConversion, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportAssertIdentifier, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportEnumIdentifier, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportNonStaticAccessToStatic, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportIndirectStaticAccess, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportEmptyStatement, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnnecessaryTypeCheck, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnnecessaryElse, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUndocumentedEmptyBlock, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportInvalidJavadoc, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTags, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsDeprecatedRef, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsNotVisibleRef, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportInvalidJavadocTagsVisibility, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingJavadocTags, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagsVisibility, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagsOverriding, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocComments, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocTagDescription, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocCommentsVisibility, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportMissingJavadocCommentsOverriding, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportFinallyBlockNotCompletingNormally, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownException, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionWhenOverriding, CompilerOptions.ENABLED );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionIncludeDocCommentReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedDeclaredThrownExceptionExemptExceptionAndThrowable, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnqualifiedFieldAccess, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportUncheckedTypeOperation, CompilerOptions.WARNING );
                put( CompilerOptions.OPTION_ReportRawTypeReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportFinalParameterBound, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingSerialVersion, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportVarargsArgumentNeedCast, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedTypeArgumentsForMethodInvocation, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportNullReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportPotentialNullReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportRedundantNullCheck, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportAutoboxing, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportAnnotationSuperInterface, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingOverrideAnnotation, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingDeprecatedAnnotation, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportIncompleteEnumSwitch, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportForbiddenReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportDiscouragedReference, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnhandledWarningToken, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedWarningToken, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportUnusedLabel, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportParameterAssignment, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportFallthroughCase, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportOverridingMethodWithoutSuperInvocation, CompilerOptions.IGNORE );
                put( CompilerOptions.OPTION_ReportRedundantSuperinterface, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportComparingIdentical, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingSynchronizedOnInheritedMethod, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportMissingHashCodeMethod, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportDeadCode, CompilerOptions.ERROR );
                put( CompilerOptions.OPTION_ReportDeadCodeInTrivialIfStatement, CompilerOptions.ERROR );
            }

        };


    }

}

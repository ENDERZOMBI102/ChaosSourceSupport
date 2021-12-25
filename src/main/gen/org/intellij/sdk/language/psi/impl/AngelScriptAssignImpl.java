// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.AngelScriptElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class AngelScriptAssignImpl extends ASTWrapperPsiElement implements AngelScriptAssign {

  public AngelScriptAssignImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AngelScriptVisitor visitor) {
    visitor.visitAssign(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AngelScriptVisitor) accept((AngelScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AngelScriptAssign getAssign() {
    return findChildByClass(AngelScriptAssign.class);
  }

  @Override
  @Nullable
  public AngelScriptAssignop getAssignop() {
    return findChildByClass(AngelScriptAssignop.class);
  }

  @Override
  @NotNull
  public AngelScriptCondition getCondition() {
    return findNotNullChildByClass(AngelScriptCondition.class);
  }

}

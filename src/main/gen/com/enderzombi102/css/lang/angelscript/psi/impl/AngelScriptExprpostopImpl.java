// This is a generated file. Not intended for manual editing.
package com.enderzombi102.css.lang.angelscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.enderzombi102.css.lang.angelscript.psi.AngelScriptElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.enderzombi102.css.lang.angelscript.psi.*;

public class AngelScriptExprpostopImpl extends ASTWrapperPsiElement implements AngelScriptExprpostop {

  public AngelScriptExprpostopImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AngelScriptVisitor visitor) {
    visitor.visitExprpostop(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AngelScriptVisitor) accept((AngelScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AngelScriptArglist getArglist() {
    return findChildByClass(AngelScriptArglist.class);
  }

  @Override
  @Nullable
  public AngelScriptAssign getAssign() {
    return findChildByClass(AngelScriptAssign.class);
  }

  @Override
  @Nullable
  public AngelScriptFunccall getFunccall() {
    return findChildByClass(AngelScriptFunccall.class);
  }

  @Override
  @Nullable
  public AngelScriptIdentifier getIdentifier() {
    return findChildByClass(AngelScriptIdentifier.class);
  }

}

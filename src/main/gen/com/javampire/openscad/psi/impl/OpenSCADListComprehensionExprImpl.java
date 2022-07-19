// This is a generated file. Not intended for manual editing.
package com.javampire.openscad.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.javampire.openscad.psi.OpenSCADTypes.*;
import com.javampire.openscad.psi.*;

public class OpenSCADListComprehensionExprImpl extends OpenSCADExprImpl implements OpenSCADListComprehensionExpr {

  public OpenSCADListComprehensionExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull OpenSCADVisitor visitor) {
    visitor.visitListComprehensionExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenSCADVisitor) accept((OpenSCADVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<OpenSCADAssertElement> getAssertElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADAssertElement.class);
  }

  @Override
  @NotNull
  public List<OpenSCADEchoElement> getEchoElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADEchoElement.class);
  }

  @Override
  @Nullable
  public OpenSCADExpr getExpr() {
    return findChildByClass(OpenSCADExpr.class);
  }

  @Override
  @NotNull
  public List<OpenSCADForElement> getForElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADForElement.class);
  }

  @Override
  @NotNull
  public List<OpenSCADIfElement> getIfElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADIfElement.class);
  }

  @Override
  @NotNull
  public List<OpenSCADLetElement> getLetElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADLetElement.class);
  }

}

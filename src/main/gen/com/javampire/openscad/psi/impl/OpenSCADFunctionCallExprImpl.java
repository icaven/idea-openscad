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

public class OpenSCADFunctionCallExprImpl extends OpenSCADExprImpl implements OpenSCADFunctionCallExpr {

  public OpenSCADFunctionCallExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull OpenSCADVisitor visitor) {
    visitor.visitFunctionCallExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenSCADVisitor) accept((OpenSCADVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<OpenSCADArgAssignmentList> getArgAssignmentListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADArgAssignmentList.class);
  }

  @Override
  @NotNull
  public OpenSCADFunctionNameRef getFunctionNameRef() {
    return findNotNullChildByClass(OpenSCADFunctionNameRef.class);
  }

}

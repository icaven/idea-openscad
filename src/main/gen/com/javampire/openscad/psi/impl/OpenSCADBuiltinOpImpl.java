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

public class OpenSCADBuiltinOpImpl extends OpenSCADOperatorImpl implements OpenSCADBuiltinOp {

  public OpenSCADBuiltinOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull OpenSCADVisitor visitor) {
    visitor.visitBuiltinOp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenSCADVisitor) accept((OpenSCADVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public OpenSCADArgAssignmentList getArgAssignmentList() {
    return findNotNullChildByClass(OpenSCADArgAssignmentList.class);
  }

  @Override
  @Nullable
  public OpenSCADBuiltinOverridableOpAsFunctionRef getBuiltinOverridableOpAsFunctionRef() {
    return findChildByClass(OpenSCADBuiltinOverridableOpAsFunctionRef.class);
  }

  @Override
  @Nullable
  public OpenSCADBuiltinOverridableOpRef getBuiltinOverridableOpRef() {
    return findChildByClass(OpenSCADBuiltinOverridableOpRef.class);
  }

  @Override
  @Nullable
  public OpenSCADCommonOpRef getCommonOpRef() {
    return findChildByClass(OpenSCADCommonOpRef.class);
  }

}

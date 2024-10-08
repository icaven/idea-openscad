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

public class OpenSCADBuiltinObjImpl extends OpenSCADObjectImpl implements OpenSCADBuiltinObj {

  public OpenSCADBuiltinObjImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull OpenSCADVisitor visitor) {
    visitor.visitBuiltinObj(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenSCADVisitor) accept((OpenSCADVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenSCADArgAssignmentList getArgAssignmentList() {
    return findChildByClass(OpenSCADArgAssignmentList.class);
  }

  @Override
  @NotNull
  public List<OpenSCADAssertElement> getAssertElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADAssertElement.class);
  }

  @Override
  @Nullable
  public OpenSCADBuiltinObjRef getBuiltinObjRef() {
    return findChildByClass(OpenSCADBuiltinObjRef.class);
  }

  @Override
  @Nullable
  public OpenSCADBuiltinOp getBuiltinOp() {
    return findChildByClass(OpenSCADBuiltinOp.class);
  }

  @Override
  @Nullable
  public OpenSCADBuiltinOverridableObjRef getBuiltinOverridableObjRef() {
    return findChildByClass(OpenSCADBuiltinOverridableObjRef.class);
  }

  @Override
  @NotNull
  public List<OpenSCADEchoElement> getEchoElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OpenSCADEchoElement.class);
  }

  @Override
  @Nullable
  public OpenSCADFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(OpenSCADFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public OpenSCADImport getImport() {
    return findChildByClass(OpenSCADImport.class);
  }

  @Override
  @Nullable
  public OpenSCADModuleDeclaration getModuleDeclaration() {
    return findChildByClass(OpenSCADModuleDeclaration.class);
  }

  @Override
  @Nullable
  public OpenSCADVariableDeclaration getVariableDeclaration() {
    return findChildByClass(OpenSCADVariableDeclaration.class);
  }

}

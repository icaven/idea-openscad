// This is a generated file. Not intended for manual editing.
package com.javampire.openscad.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenSCADBuiltinOp extends OpenSCADOperator {

  @NotNull
  OpenSCADArgAssignmentList getArgAssignmentList();

  @Nullable
  OpenSCADBuiltinOverridableOpAsFunctionRef getBuiltinOverridableOpAsFunctionRef();

  @Nullable
  OpenSCADBuiltinOverridableOpRef getBuiltinOverridableOpRef();

  @Nullable
  OpenSCADCommonOpRef getCommonOpRef();

}

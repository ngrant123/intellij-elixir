// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ElixirMatchedExpressionMultiplicationExpressionOperation extends ElixirMatchedExpressionAdditionExpressionOperation {

  @NotNull
  List<ElixirCaptureExpressionOperation> getCaptureExpressionOperationList();

  @Nullable
  ElixirCaptureExpressionPrefixOperation getCaptureExpressionPrefixOperation();

  @Nullable
  ElixirMultiplicationInfixOperator getMultiplicationInfixOperator();

}

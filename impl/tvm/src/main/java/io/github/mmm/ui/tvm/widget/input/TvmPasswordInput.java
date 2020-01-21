/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.tvm.widget.input;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.widget.input.UiPasswordInput;
import io.github.mmm.ui.widget.input.UiTextInput;

/**
 * Implementation of {@link UiTextInput} using TeaVM.
 *
 * @since 1.0.0
 */
public class TvmPasswordInput extends TvmTextualInput implements UiPasswordInput {

  /**
   * The constructor.
   *
   * @param context the {@link #getContext() context}.
   */
  public TvmPasswordInput(UiContext context) {

    super(context, "password");
  }

}

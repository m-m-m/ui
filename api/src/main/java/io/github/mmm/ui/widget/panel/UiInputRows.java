/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.widget.panel;

import io.github.mmm.ui.widget.UiNativeWidget;
import io.github.mmm.ui.widget.input.UiInput;

/**
 * {@link UiCompositeInput} that represents multiple rows of {@link UiInput}s. It is similar to a {@link UiFormGroup}
 * but without any visual border or semantic structure. Instead it is just a list of {@link UiInput}s so if it is added
 * to a {@link io.github.mmm.ui.widget.panel.UiFormGroup} or {@link io.github.mmm.ui.widget.panel.UiFormPanel} it behaves as
 * if all its {@link #getChild(int) children} would have been added instead.
 *
 * @since 1.0.0
 */
public interface UiInputRows extends UiCompositeInput, UiNativeWidget {

}

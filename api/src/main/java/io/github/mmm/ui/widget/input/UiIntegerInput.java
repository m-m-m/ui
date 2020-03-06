/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.widget.input;

import java.time.LocalTime;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.widget.UiNativeWidget;

/**
 * {@link UiInput} for a {@link LocalTime}. Will allow to enter the time as text similar to {@link UiTextInput} but more
 * structured. It may even support picking the time from a clock popup.<br>
 * Example:
 *
 * <pre>
 * <input type="number" placeholder="placeholder">
 * </pre>
 *
 */
public interface UiIntegerInput extends UiTextualInput<Integer>, UiNativeWidget {

  /**
   * @param context the {@link UiContext}.
   * @param name the {@link #getName() name} (label).
   * @return the new {@link UiIntegerInput}.
   */
  static UiIntegerInput of(UiContext context, String name) {

    UiIntegerInput widget = context.create(UiIntegerInput.class);
    widget.setName(name);
    return widget;
  }

}

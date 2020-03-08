/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.widget.input;

import io.github.mmm.base.range.WritableRange;

/**
 * {@link UiInput} for a {@link Number} {@link #getValue() value}.
 *
 * @param <V> type of the {@link #getValue() value}. Typically {@link String}.
 * @since 1.0.0
 */
public abstract interface UiNumericInput<V extends Number> extends UiInput<V> {

  /**
   * @return the {@link WritableRange} defining {@link WritableRange#getMin() minimum} and {@link WritableRange#getMax()
   *         maximum} bound of the {@link #getValue() value}.
   */
  WritableRange<V> getRange();

}

/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.widget;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.widget.attribute.UiWidgetWithLabel;

/**
 * {@link UiRegularWidget} that represents a label. A label is a very simple widget that displays some static text.
 *
 * @since 1.0.0
 */
public interface UiLabel extends UiAtomicWidget, UiWidgetWithLabel, UiNativeWidget {

  /**
   * @param context the {@link UiContext}.
   * @param label the {@link UiLabel#getLabel() label text}.
   * @return the new {@link UiLabel}.
   */
  static UiLabel of(UiContext context, String label) {

    UiLabel widget = context.create(UiLabel.class);
    widget.setLabel(label);
    return widget;
  }

}

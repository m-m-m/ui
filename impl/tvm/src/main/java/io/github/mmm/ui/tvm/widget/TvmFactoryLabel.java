/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.tvm.widget;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.widget.UiLabel;

/**
 * {@link UiSingleWidgetFactoryNative} for {@link UiLabel}.
 *
 * @since 1.0.0
 */
public class TvmFactoryLabel implements UiSingleWidgetFactoryNative<UiLabel> {

  @Override
  public Class<UiLabel> getType() {

    return UiLabel.class;
  }

  @Override
  public UiLabel create(UiContext context) {

    return new TvmLabel(context);
  }

}

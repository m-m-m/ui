/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.factory.datatype;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.factory.UiSingleWidgetFactoryDatatype;
import io.github.mmm.ui.widget.input.UiInput;
import io.github.mmm.ui.widget.input.UiIntegerInput;

/**
 * Implementation of {@link UiSingleWidgetFactoryDatatype} for type {@link Integer}.
 *
 * @since 1.0.0
 */
public class UiFactoryDatatypeInteger implements UiSingleWidgetFactoryDatatype<Integer> {

  @Override
  public Class<Integer> getType() {

    return Integer.class;
  }

  @Override
  public UiInput<Integer> create(UiContext context) {

    return context.create(UiIntegerInput.class);
  }

}

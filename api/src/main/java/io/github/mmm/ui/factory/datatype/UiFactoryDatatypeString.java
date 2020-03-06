/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.factory.datatype;

import io.github.mmm.ui.UiContext;
import io.github.mmm.ui.factory.UiSingleWidgetFactoryDatatype;
import io.github.mmm.ui.widget.input.UiInput;
import io.github.mmm.ui.widget.input.UiTextInput;

/**
 * Implementation of {@link UiSingleWidgetFactoryDatatype} for type {@link String}.
 *
 * @since 1.0.0
 */
public class UiFactoryDatatypeString implements UiSingleWidgetFactoryDatatype<String> {

  @Override
  public Class<String> getType() {

    return String.class;
  }

  @Override
  public UiInput<String> create(UiContext context) {

    return context.create(UiTextInput.class);
  }

}

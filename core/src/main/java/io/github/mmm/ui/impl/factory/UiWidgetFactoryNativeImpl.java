/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.impl.factory;

import io.github.mmm.ui.api.factory.AbstractUiWidgetFactory;
import io.github.mmm.ui.api.factory.UiSingleWidgetFactoryNative;
import io.github.mmm.ui.api.factory.UiWidgetFactoryNative;
import io.github.mmm.ui.api.widget.UiNativeWidget;

/**
 * Implementation of {@link UiWidgetFactoryNative}.
 *
 * @since 1.0.0
 */
public class UiWidgetFactoryNativeImpl extends AbstractUiWidgetFactory<UiSingleWidgetFactoryNative<?>>
    implements UiWidgetFactoryNative {

  /** The singleton instance. */
  public static final UiWidgetFactoryNativeImpl INSTANCE = new UiWidgetFactoryNativeImpl();

  /**
   * The constructor.
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public UiWidgetFactoryNativeImpl() {

    super((Class) UiSingleWidgetFactoryNative.class);
  }

  @Override
  public <W extends UiNativeWidget> W create(Class<W> widgetInterface, boolean required) {

    return createForType(widgetInterface, required);
  }

}

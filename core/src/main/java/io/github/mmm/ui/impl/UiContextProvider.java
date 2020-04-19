/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.impl;

import java.util.ServiceLoader;

import io.github.mmm.base.config.ServiceHelper;
import io.github.mmm.ui.api.UiContext;

/**
 * Provides the {@link UiContext}.
 *
 * @since 1.0.0
 */
public final class UiContextProvider {

  /** The {@link UiContext#get() singleton instance} of {@link UiContext}. */
  public static final UiContext CONTEXT = ServiceHelper.singleton(ServiceLoader.load(UiContext.class));

  private UiContextProvider() {

    super();
  }

}

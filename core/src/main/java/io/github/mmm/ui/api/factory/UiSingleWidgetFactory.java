/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.api.factory;

import io.github.mmm.ui.api.widget.UiWidget;

/**
 * Factory for {@link io.github.mmm.ui.api.widget.UiWidget}s of a single type.
 *
 * @since 1.0.0
 * @param <W> the generic type of the {@link UiWidget} that is {@link #create() created} by this factory.
 */
public interface UiSingleWidgetFactory<W extends UiWidget> {

  /**
   * This method creates a new {@link UiWidget} instance of the particular {@link UiWidget}-type managed by this
   * factory.
   *
   * @return the new {@link UiWidget}.
   */
  W create();

  /**
   * @return the {@link Class} this factory is responsible for.
   */
  Class<?> getType();

}

/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.api.event;

import io.github.mmm.ui.api.attribute.AttributeReadEnabled;
import io.github.mmm.ui.api.widget.UiWidget;

/**
 * {@link UiEvent} for a change of the enabled status.
 *
 * @see UiWidget#setEnabled(boolean)
 * @since 1.0.0
 */
public abstract class UiEnablingEvent extends UiEvent implements AttributeReadEnabled {

  /**
   * The constructor.
   *
   * @param source the {@link #getSource() source widget}.
   * @param programmatic the {@link #isProgrammatic() programmatic flag}.
   */
  public UiEnablingEvent(UiWidget source, boolean programmatic) {

    super(source, programmatic);
  }

}

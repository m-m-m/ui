/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.ui.api.widget.panel;

import io.github.mmm.ui.api.factory.UiWidgetFactoryNative;
import io.github.mmm.ui.api.widget.UiNativeWidget;
import io.github.mmm.ui.api.widget.UiRegularWidget;
import io.github.mmm.ui.api.widget.composite.UiSwitchComposite;
import io.github.mmm.ui.api.widget.composite.UiTab;

/**
 * {@link UiSwitchComposite} representing a <em>tab panel</em>. It contains a number of {@link #getChild(int) children}
 * but only shows one of them at a time. It shows a tab bar (typically at the top as a header) with the
 * {@link UiTab#getText() labels} of its {@link #getChild(int) children}. The user can click on one of these tabs in
 * order to see the actual {@link UiTab#getChild() content} of the according tab. <br>
 * This design might look a little complicated but gives a lot more flexibility for setting and changing attributes of
 * the {@link UiTab tab}. For convenience usage there is also {@link #addChild(UiRegularWidget, String)}.
 *
 * @since 1.0.0
 */
public interface UiTabPanel extends UiSwitchComposite<UiTab>, UiRegularWidget, UiNativeWidget {

  /**
   * Adds the given {@link UiRegularWidget} as new tab (and the end of all existing tabs).<br>
   * <b>IMPORTANT:</b> In case you {@link UiTab#setClosable(boolean) make} the {@link UiTab} {@link UiTab#isClosable()
   * closable}, it will remove itself as {@link #getChild(int) child} from this {@link UiTabPanel} when the end-user
   * closes it.
   *
   * @param child is the {@link UiRegularWidget} to add.
   * @param text is the label that will be displayed to identify the tab.
   * @return the {@link UiTab} for this tab. It allows to change the title, set tooltip or image (icon), etc.
   */
  default UiTab addChild(UiRegularWidget child, String text) {

    UiTab tab = UiTab.of(text, child);
    addChild(tab);
    return tab;
  }

  /**
   * @return the new {@link UiTabPanel}.
   */
  static UiTabPanel of() {

    return UiWidgetFactoryNative.get().create(UiTabPanel.class);
  }

  /**
   * @param children the {@link UiRegularWidget}s to add as children.
   * @return the new {@link UiTabPanel}.
   */
  static UiTabPanel of(UiTab... children) {

    UiTabPanel widget = of();
    for (UiTab child : children) {
      widget.addChild(child);
    }
    return widget;
  }

}
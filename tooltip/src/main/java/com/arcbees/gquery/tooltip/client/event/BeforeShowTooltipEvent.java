/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.gquery.tooltip.client.event;

import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.query.client.GQuery;

public class BeforeShowTooltipEvent extends AbstractTooltipEvent<BeforeShowTooltipEventHandler> {
    public static Type<BeforeShowTooltipEventHandler> TYPE = new Type<BeforeShowTooltipEventHandler>();

    public static void fire(GQuery tooltip, GQuery triggerElement, HasHandlers source) {
        source.fireEvent(new BeforeShowTooltipEvent(tooltip, triggerElement));
    }

    private BeforeShowTooltipEvent(GQuery tooltip, GQuery triggerElement) {
        super(tooltip, triggerElement);
    }

    public Type<BeforeShowTooltipEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(BeforeShowTooltipEventHandler handler) {
        handler.onBeforeShow(this);
    }
}

package com.ebricks.script.model;

import com.ebricks.script.model.event.Event;

public class Step {

    private UIElement element;
    private Event event;

    public UIElement getElement() {
        return element;
    }

    public void setElement(UIElement element) {
        this.element = element;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}

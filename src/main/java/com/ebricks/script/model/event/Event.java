package com.ebricks.script.model.event;

import com.ebricks.script.model.UIElement;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        visible = true,
        property = "type"
)
@JsonSubTypes({

        @JsonSubTypes.Type(value = Tap.class, name = "tap"),
        @JsonSubTypes.Type(value = Back.class, name = "back"),
        @JsonSubTypes.Type(value = Lock.class, name = "lock"),
        @JsonSubTypes.Type(value = Unlock.class, name = "unlock"),
        @JsonSubTypes.Type(value = Home.class, name = "home"),
        @JsonSubTypes.Type(value = Launch.class, name = "launch"),
        @JsonSubTypes.Type(value = Input.class, name = "inputText"),
        @JsonSubTypes.Type(value = Swipe.class, name = "Swipe"),


})
public class Event {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void execute(UIElement uiElement) {

    }

    public void execute() {
    }
}

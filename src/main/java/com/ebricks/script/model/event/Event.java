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
        @JsonSubTypes.Type(value = BackButton.class, name = "back")

})
public class Event {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void execute(UIElement uiElement){

    }
    public void execute(){}
}

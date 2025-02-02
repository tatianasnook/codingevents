package org.launchcode.codingevents.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO () {}

    public @NotNull Event getEvent() {
        return event;
    }

    public void setEvent( Event event) {
        this.event = event;
    }

    public @NotNull Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}

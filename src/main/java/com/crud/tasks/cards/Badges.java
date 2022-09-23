package com.crud.tasks.cards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Badges {
    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachments")
    private AttachmentByType attachmentByType;

}

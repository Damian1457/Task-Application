package com.crud.tasks.cards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Trello {

    @JsonProperty("board")
    private int board;

    @JsonProperty("card")
    private int card;

}

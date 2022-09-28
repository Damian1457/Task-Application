package com.crud.tasks.cards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Trello {

    @JsonProperty("board")
    private int board;

    @JsonProperty("card")
    private int card;

}

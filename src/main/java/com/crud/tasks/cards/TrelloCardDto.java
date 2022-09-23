package com.crud.tasks.cards;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Data
public class TrelloCardDto {

    private String name;
    private String description;
    private String pos;
    private String listId;

}

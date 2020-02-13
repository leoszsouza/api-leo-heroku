package com.example.apileo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Player")
public class Player {

    @Indexed(unique = true)
    private Long idSofifa;
    @JsonProperty
    String nome;
    @JsonProperty
    Integer idade;
}

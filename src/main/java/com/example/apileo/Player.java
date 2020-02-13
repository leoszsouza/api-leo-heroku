package com.example.apileo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {

    @JsonProperty
    Long idSofifa;
    @JsonProperty
    String nome;
    @JsonProperty
    Integer idade;
}

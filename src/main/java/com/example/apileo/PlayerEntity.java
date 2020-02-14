package com.example.apileo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Integer idade;

    private Long idSofifa;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getIdSofifa() {
        return idSofifa;
    }

    public void setIdSofifa(Long idSofifa) {
        this.idSofifa = idSofifa;
    }

    public PlayerEntity(String nome, Integer idade, Long idSofifa) {
        this.nome = nome;
        this.idade = idade;
        this.idSofifa = idSofifa;
    }
}

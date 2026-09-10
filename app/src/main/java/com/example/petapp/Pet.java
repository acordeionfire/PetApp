package com.example.petapp;

public class Pet {
    public String nome;
    public String idade;




    public Pet (String nome, String idade) {
        this.nome = nome;
        this.idade = idade;

    }
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade;
    }
}

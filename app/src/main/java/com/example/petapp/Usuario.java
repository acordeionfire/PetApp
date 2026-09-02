package com.example.petapp;

public class Usuario {
    private String usuario;
    private String senha;

    // 🔴 ESSE É O CONSTRUTOR QUE ESTÁ FALTANDO:
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    // Construtor vazio (opcional, mas bom ter):
    public Usuario() {
    }

    // Getters e Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
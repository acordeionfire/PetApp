package com.example.petapp;

import java.util.ArrayList;
import java.util.List; // 👈 Adicione este import aqui!

public class DadosCompartilhados {
    public static List<Usuario> listaUsuario = new ArrayList<>();

    public static Usuario usuarioLogado;

    static {
        listaUsuario.add(new Usuario("admin", "123"));
        listaUsuario.add(new Usuario("aluno", "123"));
        listaUsuario.add(new Usuario("nicolas", "asdf"));
    }
}
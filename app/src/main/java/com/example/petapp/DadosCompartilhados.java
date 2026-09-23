package com.example.petapp;

import java.util.ArrayList;
import java.util.List; // 👈 Adicione este import aqui!

public class DadosCompartilhados {
    public static List<Usuario> listaUsuario = new ArrayList<>();
    public static List<Pet> listaPets = new ArrayList<>();
    public static Usuario usuarioLogado;

    public static boolean salvarPet(String nome, String idade){
        Pet pet = new Pet(nome, idade);
        return listaPets.add(pet);
    }

    public static boolean atualizarIdadePet (String nome, String novaIdade) {
        for (Pet pet : listaPets) {
            if (pet.nome.equalsIgnoreCase(nome)) {
                pet.idade = novaIdade;
                return true;
            }
        }
        return false;
    }

    public static boolean removerPetPorNome (String nome) {
        return listaPets.removeIf(pet -> pet.nome.equalsIgnoreCase(nome));
    }

    static {
        listaUsuario.add(new Usuario("admin", "123"));
        listaUsuario.add(new Usuario("aluno", "123"));
        listaUsuario.add(new Usuario("nicolas", "asdf"));
    }
}
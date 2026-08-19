package aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instanciar, dar vida a classe
		//Tipo classe, variável, comando new, Pet()
		Pet pet1 = new Pet();
		pet1.nome = "Tobias";
		pet1.idade = 12;
		pet1.peso = 38;
		pet1.raca = "SRD";
		pet1.sexo = "M";
		pet1.tipo = "Cachorro";
		
		
		Cliente cliente = new Cliente();
		cliente.CPF = "12345678902";
		cliente.nome = "Lucas Santos";
		cliente.pet = pet1;
		cliente.Telefone = "999917040";
		
		System.out.println("Nome do Pet: " + pet1.nome);
		System.out.println("Nome do Dono: " + cliente.nome);
		
		//criar uma lista
		ArrayList<Pet> lista = new ArrayList<Pet>();
		Scanner teclado = new Scanner (System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Digite o nome do pet: ");
			String nomePet = teclado.next();
			System.out.println("Digite a idade do pet: ");
			int idadePet = teclado.nextInt();
			Pet pet3 = new Pet();
			pet3.nome = nomePet;
			pet3.idade = idadePet;
			lista.add(pet3);
		}
		//imprimir a lista
		System.out.println ("RELATÓRIO");
		for(Pet p: lista) {
			System.out.println("Nome: " + p.nome);
			System.out.println("Idade: " + p.idade);
		}
		
	}

}

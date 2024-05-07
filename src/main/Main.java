package main;

import java.util.Scanner;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String name = sc.nextLine();
		
		Cliente cliente = new Cliente();
		cliente.setNome(name);
		
		System.out.println("Olá, " + name + " é muito bom te ver por aqui!");
		
		System.out.println("Digite o que deseja fazer: "
				+ "\n 1) Criar uma conta poupanca."
				+ "\n 2) Criar uma conta corrente.");
		int opcao = Integer.parseInt(sc.nextLine());
		
		ContaCorrente cc = null;
		ContaPoupanca cp = null;
		
		switch(opcao) {
		case 1:
			cc = new ContaCorrente(cliente);
			System.out.println("Conta corrente criada com sucesso!");
			break;
		case 2:
			cp = new ContaPoupanca(cliente);
			System.out.println("Conta poupança criada com sucesso!");
			break;
		default:
			System.out.println("Opção Inválida.");
			break;
		}
		
		
		
		
	}

}

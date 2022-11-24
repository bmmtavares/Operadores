package com.java.leituradados;

import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		int idade = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = sc.nextLine(); //sc.next();

		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		sc.close();

		if (idade < 0)
			System.out.println("Idade invalida");

		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70) {
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenária");
			}
		} else {
			System.out.println("Menor idade");
		}
	}
}

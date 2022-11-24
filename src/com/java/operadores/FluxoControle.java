package com.java.operadores;

public class FluxoControle {
	public static void main(String[] args) {

		int idade = 101;

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

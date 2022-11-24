package com.java.operadores;

public class OperadorLogico {
	public static void main(String[] args) {

		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);

		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);

		int x = 11, y = 11;
		boolean teste = x > 10 ^ y > 10; //xor - ou exclusivo
		System.out.println(teste);
		
		boolean maioridade = !(idade>=18);
		System.out.println(maioridade);
	}
}

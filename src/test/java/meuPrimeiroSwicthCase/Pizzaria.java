package meuPrimeiroSwicthCase;

import java.util.Scanner;

public class Pizzaria {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		System.out.println("Bem vindo a pizzaria Flashcode");
		System.out.println("Aqui algumas opções de Pizzas Grandes");
		System.out.println(" opição 1 - à moda da casa");
		System.out.println("Opção 2 - Á moda do pizaiolo");
		System.out.println(" opção 3 - abobrinha");
		System.out.println(" opção 4 - Alemã");
		
		int escolha = escrever.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println(" você escolheu a pizza  à moda da casa o valor é de R$ 68,00");
				
			break;
		case 2:
			System.out.println(" você escolheu a pizza  à moda do pizzaiolo é de R$ 69,00");
				
			break;
		case 3:
			System.out.println(" você escolheu a pizza  abobrinha o valor é de R$ 64,00");
				
			break;
		case 4:
			System.out.println(" você escolheu a pizza  Alemã o valor é de R$ 68,00");
				
			break;
			

		default:
			System.out.println("Você seleciolou a opção invalida, por favor escolha aopção de 1 a 4");
			break;
		}
		

	}

}

package meuPrimeiroSwicthCase;



import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner escrever = new Scanner(System.in);
			
			//dados do cliente como parametro
			double saldo = 900.00;
			String senhaCorreta = "1234";
			
			//saudacao ao cliente e informaçoes
			
			System.out.println("Bem vindo a Tênis Store");
			System.out.println("Escolha o seu tenis");
			System.out.println("Tênis 1 Jordan Retro 4 valor R$ 1000,00");		
			System.out.println("Tênis 2 Air Jordan Low valor R$ 835,00");
			System.out.println("Tênis 3 Quix Chorão Pro  valor R$ 399,,00");
			System.out.println("Tênis 4 Vans Rowley  valor  R$ 749,00 ");
			
			int escolha = escrever.nextInt();
			double valorTenis = 0;
			
			switch (escolha) {
			case 1:
				valorTenis = 1000.00;
				System.out.println("Jordan Retro 4");
				
				break;
			case 2:
				valorTenis = 835.00;
				System.out.println("Air Jordan Low ");
				
				break;
			case 3:
				valorTenis = 399.00;
				System.out.println("Quix Chorão Pro ");
				
				break;
			case 4:
				valorTenis = 749.00;
				System.out.println("Vans Rowley");
				
				break;
				
			default:
				System.out.println("Opção invalida selecione a opção de 1 a 4");
				break;
			}
			if (saldo >=valorTenis) {
				System.out.println("Saldo disponível : R$ " + saldo);
				System.out.println("Digite sua senha:");
				String senha = escrever.next();
				
				if (senha.equals(senhaCorreta)) {
					saldo-= valorTenis;
					System.out.println("Compra realizada com sucesso, parabéns ótima esolha");
					System.out.println("Seu saldo é R$" + saldo);
				}else {
					System.out.println("Senha incorreta");
				}
				
			}else {
				System.out.println(" seu saldo é insuficiente");
			}
			
			
				}
		

	


	}



package estruturaDecisao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a opção desejada: "
				+ "\n 1- PALMEIRAS "
				+ "\n 2- INTERNACIONAL "
				+ "\n 3- FLUMINENSE "
				+ "\n 4- FLAMENGO "
				+ "\n 5- CORINTHIANS "
	             );
				
		int opcao = ler.nextInt();
		
			
			
			switch(opcao){
				case 1:
					System.out.println("Você selecionou Palmeiras!");
				break;
				case 2:
					System.out.println("Você selecionou Internacional!");
				break;
				case 3:
					System.out.println("Você selecionou Fluminense!");
				break;
				case 4:
					System.out.println("Você selecionou Flamengo");
				break;
				case 5:
					System.out.println("Você selecionou Corinthians!");
				break;
				default:
				
					System.out.println("Você selecionou uma opção inexistente!");
					
			}
			
		}

	}

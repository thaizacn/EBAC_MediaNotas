package br.com.notas;

import java.util.Scanner;

public class CalculoDeMedias {
	
	
	public static void main(String[] args) {

		Scanner notas = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int nota1 = notas.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = notas.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota3 = notas.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota4 = notas.nextInt();
		
		int media = nota1 + nota2 + nota3 + nota4;
		int mediaFinal = media / 4;
		
		System.out.println("Sua m�dia final �: " + mediaFinal);

		if(mediaFinal >= 7) {
			System.out.println("Parab�ns, voc� foi aprovado!");
		} else if(mediaFinal >= 5) {
			System.out.println("Tente novamente, voc� ficou de recupera��o!");
		} else {
			System.out.println("Infelizmente, voc� foi reprovado!");
		}
	}
	

}

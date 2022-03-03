package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu palpite: ");

//		Forma mais prática e consome menos linha de código.
		int palpite = teclado.nextInt();
		String msg;
		while(palpite!=10000) {
			
			msg = palpite<10000?"Um pouco mais...": "Um pouco menos...";
		
//      Forma mais longa mas também funciona.			
		/*
		int palpite = teclado.nextInt();
		
		while(palpite!=10000) {
			
			if(palpite <10000) {
				System.out.print("Um pouco mais...");
			}
			else {
				System.out.println("Um pouco menos...");
			}
			*/
			System.out.println("Digite seu próximo palpite");
			palpite = teclado.nextInt();
		}
		System.out.println("Esta correto!!");
	}

}

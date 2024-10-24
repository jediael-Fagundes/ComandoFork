/*Contagem de Palavras: Peça uma frase ao usuário e conte quantas palavras ela contém.
 * 
 */

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String Frase;

		System.out.println("Escreva uma frase: ");
		Frase = scanner.nextLine();
		
		
		 Frase = Frase.replaceAll("[^a-zA-Z0-9\\s]", "");

		
		 String[] palavras = Frase.split("\\s+");
		 
		int contagemdepalavras = palavras.length;
		
		System.out.println("A frase tem "+ contagemdepalavras + " palavras");
scanner.close();
	}

}

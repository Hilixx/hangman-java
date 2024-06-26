package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Hangman;
import entities.Words;

public class App {

	public static void main(String[] args) {		int life = 6;
		int i = 0;
		List<Character> letters = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String wordPlay = null;
		
		System.out.println("Bem-vindo ao jogo da forca do condado, o jogador 1 vai definir uma palavra em um tema e o jogador 2 vai tentar adivinhar");
		System.out.println();
		System.out.println("Digite a palavra: ");
		String word = sc.next();
		System.out.println("Digite uma dica: ");
		word = word.toLowerCase();
		String tema = sc.next();
		Words wordGame = new Words(word);
		
		while(life != 0) {
			for (int y = 0; y < 50; y++) {  
	            System.out.println();
	        }
			System.out.println("Letras que ja foram: " + letters);
			System.out.println("Dica: " + tema.toUpperCase());
			Hangman.drawStickman(life);
			if(i == 0) {
				wordPlay = wordGame.compareWord1('.');
				i++;
			}
			else {
				
				System.out.println(wordPlay);
				System.out.println("Digite uma letra:");
				
				char letter = sc.next().charAt(0);
				letters.add(letter);
				String newValue = wordGame.compareWord2(letter, wordPlay);
				
				
				if(wordPlay.equals(newValue)) {
					
					life -= 1;
				}
				wordPlay = wordGame.compareWord2(letter,wordPlay);
				
				
				
			}
		String[] wordArray = wordPlay.split(" ");
		String wordCompare = String.join("", wordArray);
		
		if(word.equals(wordCompare)) {
			break;
		}
		
			
		}
		
		if(life == 0) {
			for (int y = 0; y < 50; y++) {  
	            System.out.println();
	        }
			Hangman.drawStickman(life);
			System.out.println("Jogador 1 Venceu");
			System.out.println("A palavra era: " + word);
		}
		else {
			for (int y = 0; y < 50; y++) {  
	            System.out.println();
	        }
			Hangman.drawStickman(20);
			System.out.println("Jogador 2 Venceu");
			System.out.println("A palavra era: " + word);
		}
		
		sc.close();
		
	}

}

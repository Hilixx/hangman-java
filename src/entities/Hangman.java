package entities;

public class Hangman {
	
	
	
	
	
	
	public static void drawStickman(int life) {
		if(life == 20) {
			System.out.println("        Muito Obrigado!");
			System.out.println("       ,");
			System.out.println("     O");
			System.out.println("    -|-");
			System.out.println("    //");
			System.out.println();
			System.out.println();
			
		}
		if(life == 6) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   ");
			System.out.println("|   ");
			System.out.println("|  ");
			System.out.println("|");
		}
		if(life == 5) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|   ");
			System.out.println("|  ");
			System.out.println("|");
		}
		if(life == 4) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|   | ");
			System.out.println("|  ");
			System.out.println("|");
		}
		if(life == 3) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|  -| ");
			System.out.println("|  ");
			System.out.println("|");
		}
		if(life == 2) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|  -|- ");
			System.out.println("|  ");
			System.out.println("|");
		}
		if(life == 1) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|  -|- ");
			System.out.println("|  /");
			System.out.println("|");
		}
		if(life == 0) {
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.print('_');
			System.out.println('_');
			System.out.println("|   l");
			System.out.println("|   O");
			System.out.println("|  -|- ");
			System.out.println("|  //");
			System.out.println("|");
	
		}
		
	}
}

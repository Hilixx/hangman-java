package entities;

public class Words {
	
	private String words;
	
	
	public Words(String words) {
		
		this.words = words;
		
	}
	
	
	
	
	public String getWords() {
		return words;
	}




	public void setWords(String words) {
		this.words = words;
	}









	



	public String compareWord1(char letter) {
		String[] wordArray = words.split("");
		String[] emptyWord = new String[wordArray.length];
		int sum = 0;
		
		int i = 0;
		
		for(String letters : wordArray) {
			
			if(Character.toString(letter).equals(letters)) {
				emptyWord[i] = letters;
				
				
			}else {
				emptyWord[i] = "_ ";
			}
			
			i++;
			 
			 
			
		}
		String word = String.join("", emptyWord);
		System.out.println(word);
		return word;
		
	}
	public String compareWord2(char letter, String word) {
		String[] wordArray = words.split("");
		String[] wordArrayP = word.split(" ");
		int i = 0;
		
		for(String letters : wordArray) {
			
			if(Character.toString(letter).equals(letters)) {
				wordArrayP[i] = letters;
				
			}
			
			i++;
			 
			 
		
		}
		word = String.join(" ", wordArrayP);
		System.out.println(word);
		return word;
	}
	
	
	
	
	
	
	
	
	
	
}

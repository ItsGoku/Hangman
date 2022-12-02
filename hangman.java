package bos;

import java.util.Scanner;

public class hangman {
	
	public static boolean check(String word,char ch) {
		
		for (int i=0; i<word.length(); i++) {
			
			if (word.charAt(i) == ch) {
				
				return true;
				
			}
		
	}
		return false;

	}
	public static void main(String[] args) {
		
		System.out.println("Please enter a word to start playing game:");
		
		Scanner sc= new Scanner(System.in);
		String word = sc.nextLine();
		
		String hdnw="";
		
		for (int i=0; i<word.length(); i++) {
			
			hdnw += '-';
			
		}
		String hdnw2 = "";
		
		while (hdnw.compareTo(word) != 0) {
			
			System.out.println("Please enter a character to guess the word:");
			Scanner a = new Scanner(System.in);
			char ch = a.next().charAt(0);
			
			if (check(word,ch)) {
				
				for (int i=0; i<word.length(); i++) {
					
					if (word.charAt(i) == ch) {
						
						hdnw2 +=ch ;
					}
					else {
						
						if (hdnw.charAt(i) != '-') {
							
							hdnw2 += hdnw.charAt(i);
							
						}
						
						else hdnw2 +='-';
					}
				}
				
				hdnw = hdnw2;
				hdnw2 = "";
			}
			
			System.out.println("hidden word:"+hdnw);
			
			
		}
		
		System.out.println("You finished the game!!!");
	}
}
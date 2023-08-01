package com.lumen.scan;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String[] array=string.split(" ");
		String longWord=" ";
		for(String word:array) {
			if (word.length()>longWord.length())
				longWord=word;
		}
		System.out.println("Longest word: "+longWord);
		scanner.close();
	}

}



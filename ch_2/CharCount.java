package ch_2;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		System.out.println(word +" has " + word.length() + " letters.");

	}

}

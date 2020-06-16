package _01_Lambda_Methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			String back = "";
			for(int i = s.length() - 1; i >= 0; i--) {
				back += s.charAt(i);
			}
			System.out.println(back);
		}, "Hello");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String mix = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					mix += Character.toLowerCase(s.charAt(i));
				}
				if(i % 2 == 1) {
					mix += Character.toUpperCase(s.charAt(i));
				}
			}
			System.out.println(mix);
		}, "Hello");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			String period = "";
			for(int i = 0; i < s.length(); i++) {
				period += s.charAt(i);
				period += ".";
			}
			System.out.println(period);
		}, "Hello");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			String consonants = "";
			for(int i = 0; i < s.length(); i++) {
				if(!Arrays.asList('a', 'e', 'i', 'o', 'u', 'y').contains(s.charAt(i))) {
					consonants += s.charAt(i);
				}
			}
			System.out.println(consonants);
		}, "Hello");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

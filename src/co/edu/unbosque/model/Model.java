package co.edu.unbosque.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Model {


	public void kmp(String text, String patron) {

		int cont = 0;
		if (patron == null || patron.length() == 0) {
			System.out.println("The pattern occurs with shift 0");
			cont++;
			return;
		}

		if (text == null || patron.length() > text.length()) {
			System.out.println("Pattern not found");
			System.out.println("cont " + cont);
			return;
		}

		char[] chars = patron.toCharArray();

		int[] next = new int[patron.length() + 1];
		for (int i = 1; i < patron.length(); i++) {
			int j = next[i + 1];

			while (j > 0 && chars[j] != chars[i]) {
				j = next[j];
			}

			if (j > 0 || chars[j] == chars[i]) {
				next[i + 1] = j + 1;
			}
		}

		for (int i = 0, j = 0; i < text.length(); i++) {
			if (j < patron.length() && text.charAt(i) == patron.charAt(j)) {
				if (++j == patron.length()) {
					System.out.println("The pattern occurs with shift " + (i - j + 1));
					cont++;
				}
			} else if (j > 0) {
				j = next[j];
				i--;
			}
		}

		System.out.println("cont es " + cont);
	}

	public HashMap<Character, Integer> patron(String patron) {

		String p="*";
		HashMap<Character, Integer> guardar = new HashMap<Character, Integer>();
		guardar.put(p.charAt(0),patron.length());

		for (int i = 0; i < patron.length(); i++) {
			int max =Math.max(1, patron.length()-i-1);
			if (!guardar.containsKey(guardar.get(i))) {
				guardar.put(patron.charAt(i), max);
			} else {
				guardar.replace(patron.charAt(i), max);
			}
		}




		return guardar;
	}


	public void boyerMoore(String text , String patron) {
		
		
		
		

	}



}





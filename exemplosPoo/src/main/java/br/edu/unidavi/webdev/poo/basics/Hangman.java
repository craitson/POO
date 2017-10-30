package br.edu.unidavi.webdev.poo.basics;

import java.util.Scanner;

public class Hangman {

	private String palavra;
	private String placeholder;
	private int wrongAttempts;
	private int wrongAttemptsLimit = 6;

	public Hangman(String palavra) {
		this.palavra = palavra;
		setPlaceholder();
	}

	private void setPlaceholder(char letra){
		char[] letrasPalavra = palavra.toCharArray();
		char[] letrasPlaceholder = placeholder.toCharArray();
		boolean achou = false;

		for (int i = 0; i < letrasPalavra.length; i++){

			if (letrasPalavra[i] == letra){
				letrasPlaceholder[i] = letra;
				achou = true;
			}
		}
		if (!achou) wrongAttempts ++;

		placeholder = String.valueOf(letrasPlaceholder);
	}

	private void setPlaceholder(){
		placeholder = "";
		for (char a: palavra.toCharArray()) {
			placeholder += "*";
		}
	}

	public String play(char letra) {
		setPlaceholder(letra);
		return placeholder;
	}

	public boolean won() {
		return (placeholder.equals(palavra) && wrongAttempts < wrongAttemptsLimit);
	}

	public int getWrongAttempts() {
		return wrongAttempts;
	}
}

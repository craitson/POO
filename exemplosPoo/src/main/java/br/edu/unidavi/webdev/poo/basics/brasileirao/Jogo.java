package br.edu.unidavi.webdev.poo.basics.brasileirao;

import java.util.Random;

public class Jogo {

	private final Time timeA;
	private final Time timeB;
	private int golsTimeA;
	private int golsTimeB;
	
	
	public Jogo(Time timeA, Time timeB) {
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	/**
	 * Disputa o jogo. Atribui a quantidade de gols de
	 * cada time
	 */
	public void jogar() {
		Random random = new Random();
		golsTimeA = random.nextInt(7);
		golsTimeB = random.nextInt(7);
	}
	
	/**
	 * Retorna o time vitorioso depois de jogado o jogo.
	 * Caso haja empate, retorna null;
	 * @return Time or Null
	 */
	public Time vitorioso() {
		if (golsTimeA > golsTimeB) {
			return timeA;
		} else if (golsTimeB > golsTimeA) {
			return timeB;
		}
		return null;
	}
	
	public boolean empatou() {
		return golsTimeA == golsTimeB;
	}
	
	public int getGolsTimeA() {
		return golsTimeA;
	}
	
	public int getGolsTimeB() {
		return golsTimeB;
	}
	
	public Time getTimeA() {
		return timeA;
	}
	
	public Time getTimeB() {
		return timeB;
	}
	
}

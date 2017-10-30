package br.edu.unidavi.webdev.poo.basics.brasileirao;

public class Pontos {
	
	private int pontos;
	private int jogos;
	private int empates;
	private int vitorias;
	private int derrotas;
	
	public void incrementarPontos(int pontos){
		this.pontos += pontos;
	}
	
	public void incrementarJogos(){
		jogos++;
	}
	
	public int getJogos() {
		return jogos;
	}
	
	public int getPontos() {
		return pontos;
	}

}

package br.edu.unidavi.webdev.poo.basics.encapsulamento.urna;

public class Candidato {
	
	private String nome;
	private int votos;
	
	public Candidato(String nome) {
		this.nome = nome;
	}
	
	public void votar() {
		votos++;
	}
	
	public int getVotos(){
		return votos;
	}
	
	public String getNome() {
		return nome;
	}

}

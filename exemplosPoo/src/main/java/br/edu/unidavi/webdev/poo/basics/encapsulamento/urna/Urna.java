package br.edu.unidavi.webdev.poo.basics.encapsulamento.urna;

import java.util.ArrayList;
import java.util.List;

public class Urna {
	
	private List<Integer> candidatos = new ArrayList<Integer>();
	private int votosBranco;
	private int votosNulos;
	private boolean eleicaoApurada;
	
	/**
	 * Instancia uma urna com a quantidade de canditados:
	 * @param qtdCandidatos
	 */
	public Urna(int qtdCandidatos) {
		inicializarUrna(qtdCandidatos);
	}

	/**
	 * Inicia a urna zerando todos os votos branco, nulos e de candidatos;
	 * @param qtdCandidatos
	 */
	private void inicializarUrna(int qtdCandidatos) {
		this.candidatos.clear();
		for (int i = 0; i < qtdCandidatos; i++){
			this.candidatos.add(i, 0);
		}
		votosBranco = 0;
		votosNulos = 0;
	}

	/**
	 * Adicina um voto no contador de votos em branco
	 */
	public void votarEmBranco() {
		if (eleicaoApurada) {
			System.out.println("Eleicao já apurada.");
			return;
		}
		this.votosBranco++;
	}
	
	/**
	 * Adiciona um voto no contador de votos nulos
	 */
	public void votarNulo() {
		if (eleicaoApurada) {
			System.out.println("Eleicao já apurada.");
			return;
		}
		this.votosNulos++;
	}
	
	/**
	 * Adiciona um voto no candidato informado pelo código
	 * @param codigo
	 */
	public void votarCandidato(int codigo){
		if (eleicaoApurada) {
			System.out.println("Eleicao já apurada.");
			return;
		}
		int cont = candidatos.get(codigo);
		cont++;
		candidatos.set(codigo, cont);
	}
	
	/**
	 * Apura a eleicão e exibe o resultado da urna apurada; 
	 */
	public void apurarEleicao() {
		
		eleicaoApurada = true;
		
		System.out.println("==================================");
		System.out.println("======= APURACÃO DA URNA =========");
		System.out.println("==================================");

		System.out.println("Votos em Branco: " + votosBranco); 
		System.out.println("Votos em Nulos.: " + votosNulos);
		
		int index = 0;
		for (Integer cont : candidatos) {
			System.out.println("Candidato " + index + "...: " + cont); 
			index++;
		}		
		System.out.println("==================================");
	}

}

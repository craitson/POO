package br.edu.unidavi.webdev.poo.basics.encapsulamento.urna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrnaComCandidato {
	
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	private int votosBranco;
	private int votosNulos;
	private boolean eleicaoApurada;
	
	/**
	 * Instancia uma urna com a quantidade de canditados:
	 */
	public UrnaComCandidato(Candidato... candidatos) {
		inicializarUrna(candidatos);
	}

	/**
	 * Inicia a urna zerando todos os votos branco, nulos e de candidatos;
	 * @param candidatos
	 */
	private void inicializarUrna(Candidato[] candidatos) {
		this.candidatos = Arrays.asList(candidatos);
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
		Candidato candidato = candidatos.get(codigo);
		candidato.votar();
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
		
		for (Candidato candidato : candidatos) {
			System.out.println("Candidato " + candidato.getNome() + "...: " + candidato.getVotos()); 
		}		
		System.out.println("==================================");
	}

}

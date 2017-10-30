package br.edu.unidavi.webdev.poo.basics.brasileirao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato {
	
	private List<Time> times = new ArrayList<Time>();
	private List<Jogo> jogos;
	private Map<Time, Pontos> tabela;
	
	public void addTime(Time umTime) {
		times.add(umTime);
	}
	
	public void disputar() {
		iniciarCampeonato();
		for (Jogo jogo : jogos) {
			jogo.jogar();
			atualizarTabela(jogo);
		}
	}

	private void atualizarTabela(Jogo jogo) {
		Time timeA = jogo.getTimeA();
		Time timeB = jogo.getTimeB();
		
		Pontos tabelaTimeA = tabela.get(timeA);
		Pontos tabelaTimeB = tabela.get(timeB);
		
		if (jogo.empatou()){
			tabelaTimeA.incrementarPontos(1);
			tabelaTimeB.incrementarPontos(1);
		} else if (timeA.equals(jogo.vitorioso())) {
			tabelaTimeA.incrementarPontos(3);
		} else {
			tabelaTimeB.incrementarPontos(3);
		}
		
		tabelaTimeA.incrementarJogos();
		tabelaTimeB.incrementarJogos();
		
	}

	private void iniciarCampeonato() {
		jogos = new ArrayList<Jogo>();
		tabela = new HashMap<Time, Pontos>();
		for (Time timeA : times) {
			tabela.put(timeA, new Pontos());
			for (Time timeB : times) {
				if (!timeA.equals(timeB)){
					jogos.add(new Jogo(timeA, timeB));
				}
			}
		}
	}
	
	public void imprimirTabela() {
		System.out.println("Tabela do Campeonato");
		for (Time time : times) {
			Pontos pontos = tabela.get(time);
			System.out.println(
						String.format(
								"%-20s %d pontos",
								time.getNome(),
								pontos.getPontos()
								)
					);
		}
	}
	

}

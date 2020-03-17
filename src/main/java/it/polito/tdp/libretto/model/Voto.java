package it.polito.tdp.libretto.model;

import java.time.LocalDate;
/**
 * Classe Voto, contiene le informazioni su un esame superato
 * @author simon
 *
 */




public class Voto {
	private String corso;
	private int voto;
	private LocalDate data;
	
	
	/**
	 * Costruisce un nuovo voto
	 * 
	 * @param corso nome del corso superato 
	 * @param voto valore del voto acquisito
	 * @param data data di suoeramento dell'esame
	 */
	public Voto(String corso, int voto, LocalDate data) {
		this.corso = corso;
		this.voto = voto;
		this.data = data;
	}


	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return corso + ", " + voto+ ", " + data;
	}
	
	

	
	
}



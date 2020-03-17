package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;
/**
 * Memorizza e gestisce un insieme di voti
 * 
 * @author simon
 *
 */
public class Libretto {

	List<Voto> voti;

	/**
	 * Crea un libretto nuovo,vuoto
	 */
	
	public Libretto() {
		voti=new ArrayList<>();
	}

	/**
	 * 
	 * @param voto aggiunge un nuovo voto al libretto
	 */
	
        public void add(Voto voto) {
	     this.voti.add(voto);
        }
        
        /**
         * Dato un libretto , restituisce una stringa nella quale vi sono solamente i voti passati come parametri
         * @param voto valore specificato
         * @return strnga formattata per visualizzare il sotto-libretto
         */
        public String stampaVotiUguali(int voto) {
        	 String s="";
        	    for(Voto v: this.voti) {
        	    if(v.getVoto()==voto)
        	    	s+=v.toString()+"\n";
        	    }
        	    return s;
        	        }
        /**
         * Genera un nuovo libretto che conterra esclusivamente con votazione pari a quella specificata
         * @param Voto votazione specificata
         * @return nuovo Libretto
         */
        public Libretto estraiVotiUguali(int voto) {
        	Libretto nuovo=new Libretto();
        	for(Voto v:this.voti) {
        		if(v.getVoto()==voto)
        			nuovo.add(v);
        	}
        	return nuovo;
        	}
        
        public String toString() {
    String s="";
    for(Voto v: this.voti) {
    	s+=v.toString()+"\n";
    }
    return s;
        }

  
}
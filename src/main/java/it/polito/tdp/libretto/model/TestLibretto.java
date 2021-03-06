package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	Libretto lib;
	
	
	private void run() {
	    this.lib=new Libretto();
	    
	    Voto v1= new Voto("Tecniche di progammazione",30,LocalDate.of(2020,06,15));
	    Voto v2=new Voto("Analisi II",28,LocalDate.of(2020,06,28));
	    
	    lib.add(v1);
	    lib.add(v2);
	    lib.add(new Voto("Economia", 24, LocalDate.of(2020, 02, 14)));
	   
	    System.out.println(lib.estraiVotiUguali(28));
	}
	
	
	public static void main(String[] args) {
		TestLibretto test =new TestLibretto();
		test.run();
	}

}

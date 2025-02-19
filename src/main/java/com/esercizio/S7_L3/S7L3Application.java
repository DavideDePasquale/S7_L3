package com.esercizio.S7_L3;

import com.esercizio.S7_L3.esercizio2.Libro;
import com.esercizio.S7_L3.esercizio2.Pagine;
import com.esercizio.S7_L3.esercizio2.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class S7L3Application {

	public static void main(String[] args) {
		SpringApplication.run(S7L3Application.class, args);

         //ESERCIZIO 1
//		Info persona = new Info();
//		UserData userData = new UserData();
//		persona.setCognome("Paolini");
//		persona.setNome("Carlo");
//		Calendar calendario = Calendar.getInstance();
//		calendario.set(1989,Calendar.AUGUST,10);
//		Date dataDiNascita = calendario.getTime();
//		persona.setDataDiNascita(dataDiNascita);
//		InfoAdapter infoAdapter = new InfoAdapter(persona);
//		userData.getData(infoAdapter);


		// Esercizio2
        Pagine pag = new Pagine("Intro alla morte");

		Sezione sez = new Sezione("CAPITOLO1");
		sez.aggiungiPag(pag);
		Libro l = new Libro("Baubau",29, Arrays.asList(sez),Arrays.asList("Mauro","Paolo"));
		l.stampa();

	}




}

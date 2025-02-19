package com.esercizio.S7_L3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro implements MetodiComuni{

    private String titolo;
    private double prezzo;
    private List<Sezione> listaSezioni;
    private List<String> listaAutori;

    @Override
    public int numeroPagine() {
        int numeroPag = 0;
        for (MetodiComuni pag : listaSezioni){
            numeroPag += pag.numeroPagine();

        }
        return numeroPag;
    }
    @Override
    public void stampa() {
        System.out.println(titolo);
        for (Sezione sez : listaSezioni){
            sez.stampa();
        }
    }

}

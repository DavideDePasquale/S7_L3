package com.esercizio.S7_L3.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements MetodiComuni{

    private String titolo;
    private double prezzo;
    private List<Sezione> listaSezioni;
    private List<String> listaAutori;

    public Libro() {
    }

    public Libro(String titolo,double prezzo,List<Sezione> listaSezioni, List<String> listaAutori) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.listaSezioni = new ArrayList<>();
        this.listaAutori = new ArrayList<>();
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<Sezione> getListaSezioni() {
        return listaSezioni;
    }

    public void setListaSezioni(List<Sezione> listaSezioni) {
        this.listaSezioni = listaSezioni;
    }
    public void aggiungiSez(Sezione sezione){
        listaSezioni.add(sezione);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", prezzo=" + prezzo +
                ", listaSezioni=" + listaSezioni +
                '}';
    }

    @Override
    public int numeroPagine() {
        int numeroPag = 0;
        for (Sezione pag : listaSezioni){
            numeroPag += pag.numeroPagine();
        }
        return numeroPag;
    }
    @Override
    public void stampa() {
        for (Sezione sez : listaSezioni){
            System.out.println(sez);
        }
    }

}

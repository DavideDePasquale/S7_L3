package com.esercizio.S7_L3.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements MetodiComuni{

    private String contenuto;
    private List<Pagine> listaPagine;

    public Sezione(String contenuto) {
        this.contenuto= contenuto;
        this.listaPagine = new ArrayList<>();
    }


    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public List<Pagine> getListaPagine() {
        return listaPagine;
    }

    public void setListaPagine(List<Pagine> listaPagine) {
        this.listaPagine = listaPagine;
    }
    public void aggiungiPag(Pagine pag){
        listaPagine.add(pag);
    }

    @Override
    public String toString() {
        return "Sezione{" +
                "listaPagine=" + listaPagine +
                '}';
    }

    @Override
    public int numeroPagine() {
        int numeroPag = 0;
        for (Pagine pagine : listaPagine){
            pagine.stampa();
            numeroPag += pagine.numeroPagine();
        }
        return numeroPag;
    }

    @Override
    public void stampa() {
        for (Pagine pagina : listaPagine){
            System.out.println(pagina);
        }
    }
}

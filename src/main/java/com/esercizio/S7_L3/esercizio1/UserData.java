package com.esercizio.S7_L3.esercizio1;

public class UserData {
    private String nomeCompleto;
    private int eta;


    public String getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
        System.out.println("Nome completo : " + nomeCompleto + " Età : " + eta+ " anni");
        return  nomeCompleto + eta;
    }
}

package com.esercizio.S7_L3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagine implements MetodiComuni {

   private String contenuto;

    @Override
    public int numeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println(contenuto);
    }

}

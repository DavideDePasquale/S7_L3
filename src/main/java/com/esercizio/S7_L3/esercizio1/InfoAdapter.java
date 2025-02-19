package com.esercizio.S7_L3.esercizio1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return  info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        Calendar oggi = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dataDiNascita);
        int annoCorrente = oggi.get(Calendar.YEAR);
        int annoDataDiNascita = birthDate.get(Calendar.YEAR);
        int eta = (annoCorrente - annoDataDiNascita);
        return eta;
    }
}

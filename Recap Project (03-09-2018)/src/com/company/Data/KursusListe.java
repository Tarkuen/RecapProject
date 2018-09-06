package com.company.Data;

import com.company.Entities.Kursus;

import java.util.ArrayList;
import java.util.List;

public class KursusListe {

    private List<Kursus> kursusList;
    private static final KursusListe instance = new KursusListe();

    private KursusListe(){
        kursusList = new ArrayList<>();
    }

    public static KursusListe getInstance(){
     return instance;
    }

    public List<Kursus> getKursusList() {
        return kursusList;
    }
}

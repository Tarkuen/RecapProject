package com.company.Data;

import com.company.Entities.Kursus;

import java.util.ArrayList;
import java.util.List;

public class KursusListe {

 private List<Kursus> kursusList;

    private KursusListe(){
        kursusList = new ArrayList<>();
    }

    private static class KursusListeSingleton{
    private static final KursusListe instance = new KursusListe();
    }

    public static KursusListe getInstance(){
     return KursusListeSingleton.instance;
    }

    public List<Kursus> getKursusList() {
        return kursusList;
    }
}

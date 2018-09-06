package com.company;

import com.company.Data.KursusListe;
import com.company.Entities.Kursus;
import com.company.Entities.Studerende;
import com.company.Entities.Underviser;

public class Main {

    public static void main(String[] args) {

        KursusListe kData = KursusListe.getInstance();
        kData.getKursusList()
                .add(new Kursus("1", "1"));
        kData.getKursusList()
                .add(new Kursus("2", "2"));


        for (Kursus kursus : kData.getKursusList()) {
            if(kursus.getNavn().equalsIgnoreCase("1")){
                kursus.getStuderendeList().add(new Studerende("Henriette", "1"));
                kursus.getStuderendeList().add(new Studerende("Ane", "2"));
                kursus.getStuderendeList().add(new Studerende("Bart", "3"));
                kursus.getStuderendeList().add(new Studerende("Carsten", "4"));
                kursus.getStuderendeList().add(new Studerende("Ditte", "5"));
                kursus.getStuderendeList().add(new Studerende("Erik", "6"));
                kursus.getStuderendeList().add(new Studerende("Frederik", "7"));

            }
            else if(kursus.getNavn().equalsIgnoreCase("2")){
                kursus.getStuderendeList().add(new Studerende("Gert", "8"));
                kursus.getStuderendeList().add(new Studerende("Henrik", "9"));
                kursus.getStuderendeList().add(new Studerende("Ida", "10"));
                kursus.getStuderendeList().add(new Studerende("John", "11"));
                kursus.getStuderendeList().add(new Studerende("Kurt", "12"));
            }
        }


        Menu m = new Menu();
        m.startmenu();

    }
}

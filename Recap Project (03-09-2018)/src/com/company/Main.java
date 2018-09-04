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

        Studerende stud = new Studerende("Jens", "12");

        for (Kursus kursus : kData.getKursusList()) {
            if(kursus.getNavn().equalsIgnoreCase("1")){
                kursus.getStuderendeList().add(new Studerende("Henriette", "1"));
                kursus.getStuderendeList().add(stud);
            }
            else if(kursus.getNavn().equalsIgnoreCase("2")){
                kursus.getStuderendeList().add(new Studerende("John", "2"));
            }
        }


        Menu m = new Menu();
        m.startmenu();

    }
}

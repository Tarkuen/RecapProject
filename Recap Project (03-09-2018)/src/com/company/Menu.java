package com.company;

import com.company.Data.KursusListe;
import com.company.Entities.Eksamen;
import com.company.Entities.Kursus;
import com.company.Entities.Studerende;
import com.company.Entities.Underviser;

import java.util.List;
import java.util.Scanner;

class Menu {
    private KursusListe kData = KursusListe.getInstance();

    void startmenu() {
//
//        kData.getKursusList()
//                .add(new Kursus("1", "1"));
//        kData.getKursusList()
//                .add(new Kursus("2", "2"));
//
//        for (Kursus kursus : kData.getKursusList()) {
//           if(kursus.getNavn().equalsIgnoreCase("1")){
//               kursus.getStuderendeList().add(new Studerende("Jens", "1"));
//           }
//           else if(kursus.getNavn().equalsIgnoreCase("2")){
//               kursus.getStuderendeList().add(new Studerende("Peter", "2"));
//           }
//        }


        System.out.println("Welcome");
        System.out.println("Press 1 for Course");

        Scanner scn = new Scanner(System.in);
        int ans = scn.nextInt();
        switch (ans) {
            case 1:
                System.out.println("Du har valgt Kursus");
                System.out.println("Indtast kursus nummer: ");
                String ans2 = scn.next();
                for (Kursus kursus : kData.getKursusList()) {
                    if (kursus.getNavn().equalsIgnoreCase(ans2)) {
                        System.out.println("Vi har fundet kursus " + ans2);
                        System.out.println("Tast 1 for at ændre eller se de tilmeldte studerende");
                        System.out.println("Tast 2 for at ændre eller se underviserne ");
                        System.out.println("Tast 3 for at ændre eller se eksamensopgaverne ");
                        int ans3 = scn.nextInt();
                        switch (ans3) {
                            case 1:
                                System.out.println("Du har valgt at tilgå de studerende");
                                for (Studerende studerende : kursus.getStuderendeList()) {
                                    System.out.println(studerende.toString());
                                }
                                break;

                            case 2:
                                System.out.println("Du har valgt at tilgå de underviserne");
                                for (Underviser underviser : kursus.getUndervisere()) {
                                    System.out.println(underviser.toString());
                                }
                                break;
                            case 3:
                                System.out.println("Du har valgt at tilgå de eksamensopgaverne");
                                for (Eksamen eksamen : kursus.getEksamensOpgaver()) {
                                    System.out.println(eksamen.toString());
                                }
                                break;
                        }

                }
//                else {
//                    System.out.println("Det kursus nummer eksisterer ikke:  " + '"'+ans2+'"');
//                }
                    }


                }
        }
    }



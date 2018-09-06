package com.company;

import com.company.Data.KursusListe;
import com.company.Entities.Eksamen;
import com.company.Entities.Kursus;
import com.company.Entities.Studerende;
import com.company.Entities.Underviser;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Menu {
    private KursusListe kData = KursusListe.getInstance();

    void startmenu() {

        System.out.println("Velkommen");
        System.out.println("Tryk 1 for at tilgå et kursus");
        System.out.println("Tryk 2 for at ændre eksisterende kursuser");

        Scanner scn = new Scanner(System.in);
        int ans = scn.nextInt();
        switch (ans) {
            case 1:
                System.out.println("Du har valgt Kursus");
                for (Kursus kursus : kData.getKursusList()) {
                    System.out.println(kursus.toString());
                }
                System.out.println("Indtast kursus nummer: ");
                String ans2 = scn.next();

                for (Kursus kursus : kData.getKursusList())
                    if (kursus.getNavn().equalsIgnoreCase(ans2)) {

                        System.out.println("Vi har fundet kursus " + ans2);
                        System.out.println("Tast 1 for at ændre eller se de tilmeldte studerende");
                        System.out.println("Tast 2 for at ændre eller se underviserne ");
                        System.out.println("Tast 3 for at ændre eller se eksamensopgaverne ");

                        int ans3 = scn.nextInt();
                        switch (ans3) {
                            case 1:
                                System.out.println("Du har valgt at tilgå de studerende");
                                System.out.println("Tast 1 for at se en liste over de tilmeldte studerende");
                                System.out.println("Tast 2 for at fjerne en studerende fra kurset");
                                System.out.println("Tast 3 fo at tilføje en studerende til listen; skriv navn og nummer");


                                String ans4 = scn.next();

                                    if(ans4.equalsIgnoreCase("1")){
                                        for (Studerende stud : kursus.getStuderendeList()) {
                                            System.out.println(stud.toString());
                                        }
                                    }

                                if (ans4.equalsIgnoreCase("2")) {
                                    for (Studerende studerende : kursus.getStuderendeList()) {
                                        System.out.println(studerende.toString());
                                    }
                                    System.out.println("Indtast nummeret på den elev du vil fjerne fra kurset");
                                    String ans5 = scn.next();
                                    Iterator<Studerende> it = kursus.getStuderendeList().iterator();
                                    while (it.hasNext()) {
                                        if (it.next().getNummer().equalsIgnoreCase(ans5)) {
                                            it.remove();
                                        }
                                        kursus.getStuderendeList().clear();
                                        while (it.hasNext()) {
                                            kursus.getStuderendeList().add(it.next());
                                        }
                                    }
                                }


                                    {

                                        if (ans4.equalsIgnoreCase("3")) {
                                            System.out.println("Tilføj en ny elev : Skriv navn og nummer til den pågælende elev");
                                            System.out.println("Indtast navnet");
                                            scn.nextLine();
                                            String name = scn.nextLine();
                                            System.out.println("Indtast Nummeret");
                                            String nummer = scn.next();
                                            kursus.getStuderendeList().add(new Studerende(name, nummer));
                                        }

                                        break;
                                    }

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

            case 2:
                System.out.println("Tast 1 for at tilføje et kursus?");
                System.out.println("Tast 2 for at fjerne et kursus?");
                int answer = scn.nextInt();

                switch (answer){
                    case 1:
                        System.out.println("Hvad er navnet på kurset?");
                        scn.nextLine();
                        String name = scn.nextLine();
                        System.out.println("Hvad er kursusets nummer?");
                        String nummer= scn.next();
                        boolean check = Boolean.valueOf("");
                        for (Kursus kursus : kData.getKursusList()) {
                            if (kursus.getNummer().equalsIgnoreCase(nummer)){
                                check = false;
                                break;
                            }
                            else check=true;
                        }
                        if(check){
                            kData.getKursusList().add(new Kursus(name, nummer));
                        }
                        else {
                            System.out.println("Kursus nummeret er optaget.");
                        }


                    case 2:
                        for (Kursus kursus : kData.getKursusList()) {
                            System.out.println(kursus.toString());
                        }
                        System.out.println("Hvad er kursets nummer?");
                        scn.nextLine();
                        String nummer1 = scn.nextLine();
                        int index = 0;
                        for (Kursus kursus : kData.getKursusList()) {
                            if (kursus.getNummer().equalsIgnoreCase(nummer1)) {
                                index=kData.getKursusList().indexOf(kursus);
                                break;
                            }
                        index=-1;
                        }

                        if(index!=-1){
                            System.out.println("Kurset er fjernet");
                            kData.getKursusList().remove(kData.getKursusList().get(index));
                        }
                        else{
                            System.out.println("Kurset fandtes ikke.");
                        }


                }

                    startmenu();
                    }
        }
    }






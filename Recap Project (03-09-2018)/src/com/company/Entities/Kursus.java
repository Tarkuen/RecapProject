package com.company.Entities;

import java.util.ArrayList;
import java.util.List;

public class Kursus {

    private String navn ="";
    private String nummer="";

    private List<Studerende> studerendeList;
    private List<Eksamen> eksamensOpgaver;
    private List<Underviser> undervisere;

    public Kursus(String navn, String nummer){
        setNavn(navn);
        setNummer(nummer);
        studerendeList = new ArrayList<>();
        eksamensOpgaver = new ArrayList<>();
        undervisere = new ArrayList<>();
    }

    public List<Studerende> getStuderendeList() {
        return studerendeList;
    }

    public void setStuderendeList(List<Studerende> studerendeList) {
        this.studerendeList = studerendeList;
    }

    public List<Eksamen> getEksamensOpgaver() {
        return eksamensOpgaver;
    }

    public void setEksamensOpgaver(List<Eksamen> eksamensOpgaver) {
        this.eksamensOpgaver = eksamensOpgaver;
    }

    public List<Underviser> getUndervisere() {
        return undervisere;
    }

    public void setUndervisere(List<Underviser> undervisere) {
        this.undervisere = undervisere;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getNavn(){
        return navn;
    }

    public String getNummer(){
        return nummer;
    }


    @Override
    public String toString() {
        return "Kursus{" +
                "navn='" + navn + '\'' +
                ", nummer='" + nummer + '\'' +
                ", studerendeList=" + studerendeList +
                ", eksamensOpgaver=" + eksamensOpgaver +
                ", undervisere=" + undervisere +
                '}';
    }
}

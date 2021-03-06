package com.company.Entities;

import com.company.Person;

public class Underviser implements Person{

    private String navn;
    private String nummer;

    public Underviser(String navn, String nummer){
        setNavn(navn);
       setNummer(nummer);
    }

    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public String getNummer() {
       return nummer;
    }

    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Underviser{" +
                "navn='" + navn + '\'' +
                ", nummer='" + nummer + '\'' +
                '}';
    }
}

package com.company.Entities;

import com.company.Person;

public class Eksamen implements Person{

    private String navn;
    private String nummer;
    private String dato;

    public Eksamen(String navn, String nummer, String dato){
        setNavn(navn);
        setNummer(nummer);
        setDato(dato);
    }

    public String getNavn(){
        return navn;
    }

    public String getNummer(){
        return nummer;
    }

    public String getDato(){
        return dato;
    }

    @Override
    public void setNavn(String navn) {
        this.navn=navn;
    }

    @Override
    public void setNummer(String nummer) {
        this.nummer=nummer;
    }

    public void setDato(String dato){
        this.dato=dato;
    }

    @Override
    public String toString() {
        return "Eksamen{" +
                "navn='" + navn + '\'' +
                ", nummer='" + nummer + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }
}

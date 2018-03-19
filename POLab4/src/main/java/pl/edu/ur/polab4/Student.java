/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Student {
    
    public String imie;      
    public String nazwisko;  
    public int nr_indeksu; 
    public String nazwa_specjalnosci;
    public String rok_studiow;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String nazwa_specjalnosci) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, String rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public void wyswietl(){
        System.out.println("----------------------------");
        System.out.println("Student");
        System.out.println("Imie: "+ this.imie);
        System.out.println("Nazwisko: "+ this.nazwisko);
        System.out.println("Numer indeksu: "+ this.nr_indeksu);
        System.out.println("Nazwa specjalnosci: "+ this.nazwa_specjalnosci);
        System.out.println("Rok studiow: "+ this.rok_studiow);
    }
}

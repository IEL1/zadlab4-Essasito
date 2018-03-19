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
public class WprowadzDaneStudentow {

    public static void main(String[] args) {

        Scanner wprowadz = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = wprowadz.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = wprowadz.nextLine();

        System.out.print("Podaj nr indeksu: ");
        int nr_indeksu = wprowadz.nextInt();

        System.out.print("Podaj specjalnosc: ");
        String nazwa_specjalnosci = wprowadz.next();

        System.out.print("Podaj rok studiow: ");
        String rok_studiow = wprowadz.nextLine();
        
        Student student1 = new Student(imie, nazwisko, nr_indeksu, nazwa_specjalnosci, rok_studiow);
        student1.wyswietl();

    }
}
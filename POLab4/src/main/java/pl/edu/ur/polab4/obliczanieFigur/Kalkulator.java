/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Sebcio
 */
public class Kalkulator {
    
    public static void main(String [] args) {
        int z;
        double a;
        double b;
        double r;
        double h;
        Scanner wprowadz = new Scanner(System.in);
        
        do{
            System.out.println("KALKULATOR FIGUR GEOMETRYCZNYCH");
            System.out.println("1. Koło");
            System.out.println("2. Kula");
            System.out.println("3. Kwadrat");
            System.out.println("4. Prostokąt");
            System.out.println("5. Prostopadłościan");
            System.out.println("6. Stożek");
            System.out.println("7. Sześcian");
            System.out.println("0. Wyłącz kalkulator");
            System.out.print("Wybierz figurę geometryczną: ");
        
        z=wprowadz.nextInt();
                
        switch(z){
            case 1:
                System.out.print("Podaj promien: ");
                r = wprowadz.nextDouble();
                Kolo kolo = new Kolo(r);
                kolo.pokazDane();
                break;
            case 2:
                System.out.print("Podaj promien: ");
                r = wprowadz.nextDouble();
                Kula kula = new Kula(r);
                kula.pokazDane();
                break;
            case 3:
                System.out.print("Podaj bok: ");
                a = wprowadz.nextDouble();
                Kwadrat kwadrat = new Kwadrat(a);
                kwadrat.pokazDane();
                break;
            case 4:
                System.out.print("Podaj bok a: ");
                a = wprowadz.nextDouble();
                System.out.print("Podaj bok b: ");
                b = wprowadz.nextDouble();
                Prostokat prostokat = new Prostokat(a, b);
                prostokat.pokazDane();
                break;
            case 5:
                System.out.print("Podaj krawedz a: ");
                a = wprowadz.nextDouble();
                System.out.print("Podaj krawedz b: ");
                b = wprowadz.nextDouble();
                System.out.print("Podaj wysokosc: ");
                h = wprowadz.nextDouble();
                Prostopadloscian prostopadloscian = new Prostopadloscian(a, b, h);
                prostopadloscian.pokazDane();
                break;
            case 6:
                System.out.print("Podaj promien podstawy: ");
                a = wprowadz.nextDouble();
                System.out.print("Podaj wysokosc: ");
                h = wprowadz.nextDouble();
                Stozek stozek = new Stozek(a, h);
                stozek.pokazDane();
                break;
            case 7:
                System.out.print("Podaj krawedz: ");
                a = wprowadz.nextDouble();
                Szescian szescian = new Szescian(a);
                szescian.pokazDane();   
                break;
        }
        }while(z!=0);
    }
}
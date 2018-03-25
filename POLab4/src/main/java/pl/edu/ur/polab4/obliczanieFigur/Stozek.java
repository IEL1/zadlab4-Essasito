/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Sebcio
 */
public class Stozek {
    
    public double promien_podstawy;
    public double wysokosc;
    public double tworzaca;
    public double objetosc;
    public double pole;

    public Stozek(double promien_podstawy, double wysokosc) {
        this.promien_podstawy = promien_podstawy;
        this.wysokosc = wysokosc;
    }
    
    public void liczTworz(){
        this.tworzaca=Math.sqrt((wysokosc*wysokosc)+(promien_podstawy*promien_podstawy));
    }
    
    public void liczPole(){
        this.pole=Math.PI*promien_podstawy*(promien_podstawy+tworzaca);
        System.out.println("Pole stozka: " + this.pole);
    }
    public void liczObj(){
        this.objetosc=Math.PI*(promien_podstawy*promien_podstawy)*wysokosc*1/3;
        System.out.println("Objetosc stozka: " + this.objetosc);
    }
    
    public void pokazDane(){
        System.out.println("Promien podstawy stozka: " + this.promien_podstawy);
        System.out.println("Wysokosc stozka: " + this.wysokosc);
        liczTworz();
        liczPole();
        liczObj();
    }
}

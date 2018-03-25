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
public class Prostokat {
    
    public double bok_a;
    public double bok_b;
    public double obwod;
    public double pole;

    public Prostokat(double bok_a, double bok_b) {
        this.bok_a = bok_a;
        this.bok_b = bok_b;
    }
    
    public void liczPole(){
        this.pole=bok_a*bok_b;
        System.out.println("Pole prostokata: " + this.pole);
    }
    public void liczObw(){
        this.obwod=2*bok_a+2*bok_b;
        System.out.println("Obwod prostokata: " + this.obwod);
    }
    
    public void pokazDane(){
        System.out.println("Bok a prostokata: " + this.bok_a);
        System.out.println("Bok b prostokata: " + this.bok_b);
        liczPole();
        liczObw();
    }
}

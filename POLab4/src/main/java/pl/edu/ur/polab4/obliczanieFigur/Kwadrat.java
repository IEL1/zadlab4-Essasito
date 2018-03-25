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
public class Kwadrat {

    public double bok;
    public double obwod;
    public double pole;

    public Kwadrat(double bok) {
        this.bok = bok;
    }
    
    public void liczPole(){
        this.pole=bok*bok;
        System.out.println("Pole kwadratu: " + this.pole);
    }
    public void liczObw(){
        this.obwod=4*bok;
        System.out.println("Obwod kwadratu: " + this.obwod);
    }
    
    public void pokazDane(){
        System.out.println("Bok kwadratu: " + this.bok);
        liczPole();
        liczObw();
    }
}

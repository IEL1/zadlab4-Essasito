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
public class Kolo {
    
    public double promien;
    public double obwod;
    public double pole;

    public Kolo(double promien) {
        this.promien = promien;
    }
    
    public void liczPole(){
        this.pole=Math.PI*(promien*promien);
        System.out.println("Pole kola: " + this.pole);
    }
    public void liczObw(){
        this.obwod=2*Math.PI*promien;
        System.out.println("Obwod kola: " + this.obwod);
    }
    
    public void pokazDane(){
        System.out.println("Promien kola: " + this.promien);
        liczPole();
        liczObw();
    }
 
}

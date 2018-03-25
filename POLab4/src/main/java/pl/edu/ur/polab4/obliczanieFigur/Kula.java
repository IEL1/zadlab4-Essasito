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
public class Kula {
    
    public double promien;
    public double objetosc;
    public double pole;

    public Kula(double promien) {
        this.promien = promien;
    }
    
    public void liczPole(){
        this.pole=4*Math.PI*(promien*promien);
        System.out.println("Pole kuli: " + this.pole);
    }
    public void liczObj(){
        this.objetosc=4/3*Math.PI*(promien*promien*promien);
        System.out.println("Objetosc kuli: " + this.objetosc);
    }
    
    public void pokazDane(){
        System.out.println("Promien kola: " + this.promien);
        liczPole();
        liczObj();
    }
}

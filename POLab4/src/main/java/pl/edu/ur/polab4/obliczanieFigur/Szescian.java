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
public class Szescian {
    
    public double krawedz;
    public double objetosc;
    public double pole;

    public Szescian(double krawedz) {
        this.krawedz = krawedz;
    }
    
    public void liczPole(){
        this.pole=6*(krawedz*krawedz);
        System.out.println("Pole prostokata: " + this.pole);
    }
    public void liczObj(){
        this.objetosc=krawedz*krawedz*krawedz;
        System.out.println("Obwod prostokata: " + this.objetosc);
    }
    
    public void pokazDane(){
        System.out.println("Krawedz szescianu: " + this.krawedz);
        liczPole();
        liczObj();
    }
}

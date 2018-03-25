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
public class Prostopadloscian {
    
    public double krawedz_a;
    public double krawedz_b;
    public double wysokosc;
    public double objetosc;
    public double pole;

    public Prostopadloscian(double krawedz_a, double krawedz_b, double wysokosc) {
        this.krawedz_a = krawedz_a;
        this.krawedz_b = krawedz_b;
        this.wysokosc = wysokosc;
    }
    
    public void liczPole(){
        this.pole=2*krawedz_a*krawedz_b+2*krawedz_b*wysokosc+2*krawedz_a*wysokosc;
        System.out.println("Pole prostopadloscianu: " + this.pole);
    }
    public void liczObw(){
        this.objetosc=krawedz_a*krawedz_b*wysokosc;
        System.out.println("Obwod kola: " + this.objetosc);
    }
    
    public void pokazDane(){
        System.out.println("Krawedz a prostopadloscianu: " + this.krawedz_a);
        System.out.println("Krawedz b prostopadloscianu: " + this.krawedz_b);
        System.out.println("Wysokosc prostopadloscianu: " + this.wysokosc);
        liczPole();
        liczObw();
    }
}

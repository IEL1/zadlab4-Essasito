/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class DaneStudentow {
    
    public static void main(String[] args){
        Student student1 = new Student("Marcin", "Jakistam", 155312, "robotnik", "pierwszy");
        Student student2 = new Student("Robert", "Szybki", 761321, "robotnik", "drugi");
        Student student3 = new Student("Adam", "Kowalski", 151112, "robotnik", "pierwszy");
        Student student4 = new Student("Marta", "Nowak", 152563, "robotnik", "pierwszy");
        
        student1.wyswietl();
        student2.wyswietl();
        student3.wyswietl();
        student4.wyswietl();
    }
}

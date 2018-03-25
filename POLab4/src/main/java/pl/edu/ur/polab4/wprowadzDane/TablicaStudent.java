/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import pl.edu.ur.polab4.Student;

/**
 *
 * @author Sebcio
 */
public class TablicaStudent {
    
    String[][] student = new String[100][5];
    
        public void tworz(){
            for(int i=0; i<100; i++){
                for(int j=0; j<5; j++){
                    if(j==2){
                        student[i][j]="0";
                }
            }
        }
    }
}

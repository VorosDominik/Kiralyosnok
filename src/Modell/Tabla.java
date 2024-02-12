/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author Vörös
 */
public class Tabla {
    private char[][] T;
    private char UresCella; 
    private String allapot;
    
    public Tabla(char uresCella) {
        T = new char[8][8]; 
        UresCella = uresCella; 
        allapot="";
       

       
       for (int i = 0; i < T.length; i++) {
    for (int j = 0; j < T[i].length; j++) {
        T[i][j] = UresCella;
        allapot+= T[i][j] + " ";
    }
        allapot+="\n";        
    }


   
    }
    public String getAllapot() {
        return allapot;
    }
}

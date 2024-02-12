/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;


import java.util.Random;

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
        allapot = "";

        defa();

    }

    private void defa() {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = UresCella;
                allapot += T[i][j] + " ";
            }
            allapot += "\n";
        }
    }

    public String getAllapot() {
        return allapot;
    }

    public String elhelyez(int N) {

        defa();
        Random rnd = new Random();
        int Kiralynok = 0;

        while (Kiralynok < N) {
            int X = rnd.nextInt(8);
            int Y = rnd.nextInt(8);
            if (T[X][Y] != 'K') {
                T[X][Y] = 'K';
                Kiralynok++;
            }
        }

        allapot = "";
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                allapot += T[i][j] + " ";
            }
            allapot += "\n";
        }

        return allapot;
    }

    private boolean ÜresOszlop(int akartOszlop) {
        char[] oszlop = new char[T.length];
        for (int i = 0; i < T.length; i++) {
            oszlop[i] = T[i][akartOszlop];
        }
        for (char c : oszlop) {
            if (c == 'K') {
                return false;
            }
        }
        return true;
    }

    private boolean ÜresSor(int akartsor) {
        char[] sor = T[akartsor];
        for (char c : sor) {
            if (c == 'K') {
                return false;
            }
        }
        return true;
    }

    public String ÜresOszlopokSzáma() {
        int UrOsz = 0;
        for (int i = 0; i < 7; i++) {
            if (ÜresOszlop(i) == true) {
                UrOsz++;
            }
        }
        return " Az üres oszlopok száma: " + UrOsz;
    }

    public String ÜresSorokSzáma() {

        int UrOsz = 0;
        for (int i = 0; i < 7; i++) {
            if (ÜresSor(i) == true) {
                UrOsz++;
            }
        }

        return " Az üres sorok száma: " + UrOsz;
    }

    public String Tablatartalma() {
        String szov = "";
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                szov += T[i][j] + " ";
            }
            szov += "\n";
        }
        return szov;
    }

}

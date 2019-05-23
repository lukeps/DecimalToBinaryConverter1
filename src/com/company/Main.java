package com.company;

import java.util.ArrayList;

public class Main {
    ArrayList<String> binarna= new ArrayList<>();
    int liczba;


    ArrayList<String> algorytmDziesietnyBinarny(int liczba){
        this.liczba=liczba;
        int dzielenie = liczba;
        while(dzielenie>0) {

            if (dzielenie % 2 == 0) {

                binarna.add("0");


            } else if (dzielenie % 2 == 1) {

                binarna.add("1");

            }
            dzielenie = liczba / 2;
            liczba = dzielenie;

        }

        return binarna;
    }

    void odwrocKolejnosc(){

        ArrayList<String> ar = algorytmDziesietnyBinarny(69); // podaj liczbe do konwersji
        for(int z=ar.size()-1;z>=0;z--){
            System.out.print(ar.get(z));
        }
    }



    public static void main(String[] args){
        Main m = new Main();
        m.odwrocKolejnosc();


    }
}


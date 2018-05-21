/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.util.Random;

/**
 *
 * @author krzysztof
 */
public class Main {
    public static void iloraz(int a, int b){
      double iloraz=a/b;
      System.out.println("wynik dzielenia to"+iloraz);
  }
    
    public static void main(String[] args) {
      Random rand = new Random();
        int licznik  = 0;
        while(licznik != 3) {
            int liczba = -10 + rand.nextInt((10 - -10) + 1);
            int liczba1 = -10 + rand.nextInt((10 - -10) + 1);
            if(liczba1 == 0) {
                licznik++;
                System.out.println("Dzielnie przez zero jest niemożliwe po raz " + licznik);
            } else {
             iloraz(liczba,liczba1);
             
             
            }
        }
        if(licznik == 3) {
            System.out.println("3 wystapienia");
            throw new ArithmeticException();
        }
    }
 }


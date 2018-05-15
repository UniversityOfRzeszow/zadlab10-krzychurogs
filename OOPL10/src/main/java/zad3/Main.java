/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Main {
    public void dziel(int liczba,int dzielnik)
    {
       
    try
    {
     int wynik=liczba/dzielnik;
        System.out.println(wynik);
    }
    catch(java.lang.Exception e)
    {
      System.out.println("Nie mozna przez 0 "  );
    }
    }
    
    public static void main(String[] args) {
        
    
        Main trzecie=new Main();
        for(int i=0;i<10;i++)
        {
        for(int j=0;j<10;j++)
        {  
         trzecie.dziel(i,j);
        }
     }
    
    }
    
}

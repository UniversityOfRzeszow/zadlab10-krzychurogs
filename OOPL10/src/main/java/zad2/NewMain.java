/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablica = {10, 20, 30, 40, 50};
        Scanner odczyt = new Scanner(System.in);
        
        System.out.println("Który element tablicy wyświetlić?");
        int i=odczyt.nextInt();
       
        try {
            System.out.println(tablica[i]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Podałeś indeks wykraczający poza rozmiar tablicy!");
        }
    }
    
}

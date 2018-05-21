/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.util.Random;
import static zad4.Main.iloraz;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author krzysztof
 */
public class Konsola {
    static public void wprowadzInt() {
        Scanner odczyt = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            int a = odczyt.nextInt();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test1.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzStr() {
        Scanner odczyt = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            String a = odczyt.nextLine();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test1.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzFloat() {
        Scanner odczyt = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            double a=odczyt.nextFloat();
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("test1.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) a);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    public static void main(String[] args) {
       Konsola ob=new Konsola();
       ob.wprowadzInt();
    }
}

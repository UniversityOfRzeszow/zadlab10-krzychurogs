package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {
     void wprowadzint()
    {
        Scanner odczyt=new Scanner(System.in);
        int liczba;
        System.out.println("podaj liczbe");
        try{
          liczba=odczyt.nextInt();  
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
     void wprowadzString()
    {
        Scanner odczyt=new Scanner(System.in);
        String napis;
        System.out.println("podaj napis");
        try{
          napis=odczyt.nextLine();
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
     void wprowadzfloat()
    {
        Scanner odczyt=new Scanner(System.in);
        float liczba;
        System.out.println("podaj liczbe");
        try{
          liczba=odczyt.nextFloat();
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
     void wprowadzdouble()
     {
         
        Scanner odczyt=new Scanner(System.in);
        double liczba;
        System.out.println("podaj liczbe");
        try{
          liczba=odczyt.nextDouble();
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
     void wprowadzshort()
     {
         
        Scanner odczyt=new Scanner(System.in);
        short liczba;
        System.out.println("podaj liczbe");
        try{
          liczba=odczyt.nextShort();
          
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
     void wprowadzchar()
     {
         
        Scanner odczyt=new Scanner(System.in);
        
        System.out.println("podaj liczbe");
        try{
          char c = odczyt.next().charAt(0);
          
        }
        catch(InputMismatchException e)
        {
            System.out.println("zly typ danych");
        }
     }
    public static void main(String[] args) {
       Main ob=new Main();
       ob.wprowadzint();
       ob.wprowadzString();
    }
    
}

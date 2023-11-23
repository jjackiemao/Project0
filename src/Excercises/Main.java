package Excercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Array factory = new Array();

        //Vi vill skapa ett array i vår ArrayFactory
        //Vi får inte skapa själva arrayet inuti vår Mainklass
        //Vi stannar programmet när vi skrivit in *

        String savedStrings = ""; //<-- vi deklarerar en tom String utanför vår
        //While loop.

        while (true){
            System.out.println("Please write some words, one word, followed by enter");
            System.out.println("To quit, please write a *");
            String input = scan.nextLine();
            if (!input.equals("*")){ //<-- om vi INTE skrivit * så ska programmet fortsätta!
                //Vi vill även att informationen som vi skrivit in på något sätt sparas.
                savedStrings = savedStrings + " " + input; //<-- Vi sparar saved strings innehåll
                //samt ett mellanrum och sedan innehållet i vår input.

            } else { //<-- Annars så bör vi avbryta programmet!
                factory.setWordArray(savedStrings.trim()); //<-- .trim tar bort whitespace!
                break; //<-- Avslutar vår loop!
                //<-- Vi skriver även här innan vi bryter loopen effekten av våra
                //Beräkningar, detta går även att göra efter vår while-loop.
            }
        }
        factory.printMyArray();
        System.out.println("The first word is:" + factory.getFirstWord());
        System.out.println("The last word is:" + factory.getLastWord());
        System.out.println("The array is " + factory.getArrayLength() + " positions long");


    }
}

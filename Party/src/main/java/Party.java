package main.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Party {


    static void party(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po imieniu");
            System.out.println("5. Wyjście");

            int usherChoice= scanner.nextInt();

            switch (usherChoice)
            {
                case 1-> System.out.println("Lista gości");

            }
        }

    }
}
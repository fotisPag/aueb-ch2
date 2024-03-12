package gr.aueb.cf.ch2;

import java.util.Scanner;

public class InserDates {

    public static void main(String[] args) {

        int day, month, year;

        Scanner in = new Scanner(System.in);

        System.out.println ("Δώσε την ημέρα");
        day = in.nextInt();

        System.out.println ("Δώσε το μήνα");
        month = in.nextInt();

        System.out.println ("Δώσε το χρόνο");
        year = in.nextInt();

        System.out.printf ("%d/%d/%d", day, month, year);

    }

}

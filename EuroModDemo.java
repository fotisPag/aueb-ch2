package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
* Μετατρέπει ποσά που δίνει ο χρήστης σε Ευρώ σε χαρτονομίσματα των
* 500, 100, 50, 20, 10 ευρω
* καθώς και σε κέρματα του 1 Ευρώ.
*
* Για παράδειγμα τα 1204 Ευρώ είναι 2 χαρτονομίσματα των 500 Ευρώ
* 2 χαρτονομίσματα των 100 Ευρώ, 0 χαρτονομίσματα των 50, 20, 10 Ευρώ
*και 4 κέρματα του 1 Ευρώ.
*
* @author F.Pagonis
*  */
public class EuroModDemo {

    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     long euros500, euros100, euros50, euros20, euros10;
     long remainingEuros;

    System.out.println("Δώσε ένα ποσό σε Ευρώ");
    remainingEuros = in.nextLong();

    euros500 = remainingEuros / 500;
    remainingEuros = remainingEuros % 500;

    euros100 = remainingEuros / 100;
    remainingEuros = remainingEuros % 100;

    euros50 = remainingEuros / 50;
    remainingEuros = remainingEuros % 50;

    euros20 = remainingEuros / 20;
    remainingEuros = remainingEuros % 20;

    euros10 = remainingEuros / 10;
    remainingEuros = remainingEuros % 10;


    System.out.printf ("500: %d \n100: %d\n 50: %d\n20: %d\n10: %d\n1: %d ",
            euros500, euros100, euros50, euros20, euros10, remainingEuros);

    }


}

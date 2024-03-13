package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DisektaEti {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int etos;
        do{

            System.out.println("Δώσε έτος. Εάν πατήσετε 1 θα σταματήσει να σας ρωτάει.");
            etos = in.nextInt();

            if ((etos % 4 == 0 && etos % 100 != 0) || (etos % 400 == 0))  {
                System.out.println("Το έτος " + etos + " είναι δίσεκτο");
            } else {
                System.out.println("Το έτος " + etos + " δεν είναι δίσεκτο");
            }

        } while (etos != 1);

        System.out.println("Γεια σας");
    }
}

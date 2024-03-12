package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahreneitToCelcious {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int inputNumber;


        System.out.println("Εισάγετε τη θερμοκρασία σε Fahrenheit:");
        inputNumber = in.nextInt();

        int celsius = 5 * (inputNumber - 32) / 9;

        System.out.printf ("Ο αριθμός σε κελσίου %d", celsius);




    }

}
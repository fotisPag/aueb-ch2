package gr.aueb.cf.ch2;

import java.util.Scanner;
/*
* Υπολογίζει το τρετράγωνο και τον κύβο ενός αριθμού
* που δίνει ο χρήστης. Χρησιμοποιεί την έτοιμη μέθοδο
* Math.pow() της κλάσης Math.
*
* @Author F.Pagonis
* */
public class MathPowers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;

        System.out.println ("Παρακαλώ δώστε έναν αριθμό");
        num = in.nextInt();

        System.out.printf("Num:%d\tSquare:%d\tCube:%d", num, (int) Math.pow(num, 2), (int) Math.pow(num, 3));
    }
}

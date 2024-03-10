package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
*Μετατρέπει τα συνολικά δευτερόλεπτα που δίνει ο χρήστης σε μέρες, λεπτά και δευτερόλεπτα
* @author F. Pagonis
*/
public class TimeToDHMS {

    public static void main(String[] args) {

        final int SEC_PER_DAY = 24 * 3600;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTES = 60;


        Scanner in = new Scanner(System.in);
        long remainingTotalSec, days, hours, minutes;


        System.out.println ("Παρακαλώ δώστε δευτερλόπτε προς μετατροπή");
        remainingTotalSec =  in.nextLong();

        days = remainingTotalSec / SEC_PER_DAY;
        remainingTotalSec %= SEC_PER_DAY;

        hours = remainingTotalSec / SEC_PER_HOUR;
        remainingTotalSec %= SEC_PER_HOUR;

        minutes = remainingTotalSec / SEC_PER_MINUTES;
        remainingTotalSec %= SEC_PER_MINUTES;

        System.out.printf ("DAYS: %d\tHOURS: %d\tMINUTES: %d\tSECONDS: %d",
                days, hours, minutes, remainingTotalSec);

    }

}

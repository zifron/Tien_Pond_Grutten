package nl.isenzo.job;

import nl.isenzo.job.Cirkel;
import java.util.*;
/**
 * Created by M03J101 on 2016-06-07.
 */
public class Run {

    public static void main(String[] args) {
        // getting the values from the programs arguments
        long aantal_Leden = Long.parseLong(args[0]);
        int iteratie = Integer.parseInt(args[1]);

        Cirkel c = new Cirkel();
        c.createArrayList(aantal_Leden);

        // removing 1 item at the time when the iteration has come to 18.
        // lees 18 keer door de loop heen
        long einde_kring = c.kring.size();
        long kringPositie= 1;
        while (c.kring.size() >= 1){
            for (int i = 1; i <= iteratie; i++){
                //loop door de kring heen. De 18e interatie moet uit de kring worden verwijderd.
//                System.out.println(c.kring(kringPositie));
                if (i == 18){
                    System.out.println("FOR KRING 6 x kringpositie = " + kringPositie);
                    c.kring.remove(kringPositie);
                    //i = 0;
                    //kringPositie= 0;
                    einde_kring = c.kring.size();
                    System.out.println("Currently the arry list has following elements: " + c.kring);
                    // let us print all the values available in list
                    for (long value : c.kring) {
                        System.out.println("Value = " + value);
                    }

                }
//                System.out.println(kringPositie);
//                System.out.println(einde_kring);
                if (kringPositie >= einde_kring){
                    kringPositie = 1;
                }
                else {
                    kringPositie++;
                }

            }
        }
//        System.out.println("Last elements: " + c.kring);
//        System.out.println(c.kring.size());
    }


}

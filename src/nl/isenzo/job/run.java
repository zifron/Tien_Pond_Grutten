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
        int kringPositie= 1;
            for (int i = 1; i <= iteratie && c.kring.size() > 1; i++){
//                System.out.println("voor de controle van i == 18 : " + i + "kring: " + kringPositie);
                //loop door de kring heen. De 18e interatie moet uit de kring worden verwijderd.
//                System.out.println(c.kring(kringPositie));
                if (i == 18){
                    System.out.println("i == 18 is juist!! i =  "+  i + "kring: " + kringPositie + "waarde is: " + c.kring.get(kringPositie-1) );
                    c.kring.remove(kringPositie - 1);
                    i = 0;
                    //kringPositie++;
                    einde_kring = c.kring.size();
                    System.out.println("Currently the arry list has following elements: " + c.kring);
                    if (kringPositie >= einde_kring){
                        kringPositie = 1;
                    }
                    continue;
                }
                if (kringPositie >= einde_kring){
                    kringPositie = 1;
                }
                else {
                    kringPositie++;
                }

            }
        System.out.println("ArrayList After : " + c.kring);

    }


}

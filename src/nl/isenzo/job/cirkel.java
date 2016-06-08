package nl.isenzo.job;

import java.util.ArrayList;

/**
 * Created by M03J101 on 2016-06-07.
 */
public class Cirkel {
//    long aantal_Leden = 6;
//    int nrIteratie;
//    int rest = 1;
    public ArrayList<String> kring= new ArrayList<>();

    public Cirkel(){
    }

    public void createArrayList(long leden){
        long mens = 1;
        for (int i = 0; i < leden; i++) {
            this.kring.add(String.valueOf(mens));
            mens ++;
        }
    }


    }

package edu.myOwnGame;

import java.util.Random;

public class PaperRockScissors {
    public static void main(String[] args) {


        String[] odpowiedzKomp = new String[3];
        odpowiedzKomp[0] = "Papier";
        odpowiedzKomp[1] = "Kamień";
        odpowiedzKomp[2] = "Nożyce";

        System.out.println("Komputer już wybrał, teraz twoja kolej: ");


        Random komp = new Random();
        for (int i=0; i<= odpowiedzKomp.length; i++){
            odpowiedzKomp[i]= komp.nextInt(1);
        }


    }
}

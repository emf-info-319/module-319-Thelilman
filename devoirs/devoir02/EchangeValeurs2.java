package devoirs.devoir02;

import java.util.Random;

public class EchangeValeurs2 {
    public static void main(String args[]) {
        final int capacité_Réservoire_A = 5;
        final int capacité_Réservoire_B = 3; // final = constante
        int reservoirA;
        int reservoirb;
        int remplissage;
        Random rand = new Random(); // code pour avoir une valeur aléatoire
        remplissage = rand.nextInt(capacité_Réservoire_A + 1); // it will generate a number between 0 and 5 need to add
                                                               // + 1 to
                                                               // have 5
        System.out.println(remplissage);
    }
}
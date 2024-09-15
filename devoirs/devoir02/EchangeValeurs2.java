package devoirs.devoir02;

import java.util.Random;

public class EchangeValeurs2 {
    public static void main(String args[]) {
        final int capacité_Réservoire_A = 3;
        final int capacité_Réservoire_B = 5; // final = constante
        int reservoirA = 0;
        int reservoirb = 0; // 0 = vide iniatialement
        int remplissage;
        Random rand = new Random(); // code pour avoir une valeur aléatoire
        remplissage = rand.nextInt(capacité_Réservoire_B + 1); // it will generate a number between 0 and 5 need to add
                                                               // + 1 to
                                                               // have 5

        if (remplissage >= 2) {
            System.out.println("il y a " + remplissage + " litres a remplir");
        } else {
            System.out.println("il y a " + remplissage + " litre a remplir");
        }
        while (reservoirA + reservoirb < remplissage) {

            if (reservoirA < capacité_Réservoire_A) {
                System.out.println("Remplisage du réservoir A");

                reservoirA = reservoirA + 1; // reservoirA++ / pour réduire le + devients -

            } else {
                System.out.println("Remplisage du réservoir B");
                reservoirb++;
            }

            System.out.println("le réservoir A: " + reservoirA + ", le réservoir B: " + reservoirb);
        }

            System.out.println("remplissage terminé!");
    }

}
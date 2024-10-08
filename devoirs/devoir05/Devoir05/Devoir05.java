package Devoir05;

import java.util.Scanner; // pour qu'il sacanne ce que le gentil être humain inscrit comme numéro

public class Devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {

        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        Scanner nombreEcrit = new Scanner(System.in);
        // Voici comment lire un entier depuis la console
        System.out.print("Entrez une valeur svp : ");
        Scanner scanner;
        int valeur = scanner.nextInt();
        scanner.nextLine(); // pour ignorer la touche RETURN
        // On continue à utiliser le scanner dans le programme…
        // On referme le scanner à la fin du programme
        scanner.close();
        // on va déclarer les valeur suivante : Nombre + grandeLimite [mettre une limite
        // (100)]
        // + mettre une limite pour "petitelimite" [mettre une limmite (1)]

        // mettre mtn un tableau pour avoir des nombres aléatoires
        int nombreAleatoire = (int) (Math.random()); // j'ai de la peine avec le tableau genre savoir mettre quoi dedans
                                                     // et ou
        // ...
        // déclarer les valeur grandeLimite + petitLimite + le nombre écrit part le
        // gentil être humain
        int grandeLimite = 100;
        int petitelimite = 1;
        int nombreEcrit;
        switch (nombreAleatoire) {
            case 1:
                if (nombreEcrit < nombreAleatoire) {
                    System.out.println("trop petit");
                }
                break;
            case 2:
                if (nombreEcrit > nombreAleatoire) {
                    System.out.println("trop grand");
                }
                break;
            case 3:
                if (nombreEcrit == nombreAleatoire) {
                    System.out.println("bravo !!!");
                }

            default:
                break;
        }
    }
}
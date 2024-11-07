package Devoir05;

import java.util.Scanner; // pour qu'il sacanne ce que le gentil être humain inscrit comme numéro

public class Devoir05 {

    public final static int MAX = 100;
    public final static int MIN = 1;

    public static void main(String[] args) {

        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        // Voici comment lire un entier depuis la console
        System.out.print("Entrez une valeur svp : ");
        Scanner scanner = new Scanner(System.in);
        int nombreEcrit = scanner.nextInt();
        // pour ignorer la touche RETURN

        // on va déclarer les valeur suivante : Nombre + grandeLimite [mettre une limite
        // (100)]
        // + mettre une limite pour "petitelimite" [mettre une limmite (1)]

        // mettre mtn un tableau pour avoir des nombres aléatoires
        int nombreAleatoire = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        while (nombreAleatoire!=nombreEcrit){

            if (nombreEcrit < nombreAleatoire) {
                System.out.println("trop petit");

            } else if (nombreEcrit > nombreAleatoire) {
                System.out.println("trop grand");
            }
            if (nombreEcrit == nombreAleatoire) {
                System.out.println("bravo !!!");
            } else if(nombreAleatoire!=nombreEcrit) {
                System.out.print("entre denouveau une valeur");
                scanner = new Scanner(System.in);}
            }
            scanner.close();
        }
    }

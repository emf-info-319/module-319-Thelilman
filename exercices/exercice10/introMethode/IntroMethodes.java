
import java.util.Scanner;

/**
 * IntroMethodes
 */
public class IntroMethodes {

    public static void main(String[] args) {

        int valeur = demandeNombre();
        int valeur2 = demandeNombre();
        int valeur3 = demandeNombre();
        debut();
        int sommeTotal = somme(valeur, valeur2, valeur3);
        System.out.println("la somme c'est : " + sommeTotal);
        fin();
    }

    public static void debut() {

        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("on va voir les métodes dans ce cours.");
    }

    public static void fin() {
        System.out.println("programme terminer");
    }

    public static int demandeNombre() {            // elle doit nous retourner un nombre ---> dans les () mettre ce qu'elle nous retourne 

        Scanner scanner = new Scanner(System.in); // create a Scanner 
        System.out.println("Entrer un nombre");
        int nombre = scanner.nextInt();         // scanner ce qu'on écrit
        System.out.println("merci j'enregistre " + nombre);

        return nombre;
    }

    public static int somme(int valeur, int valeur2, int valeur3) {
        int somme = valeur + valeur2 + valeur3;
        System.out.println("la somme est : " + somme);
        return somme;
    }
}

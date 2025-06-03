package revisions.remed;
import java.util.Scanner;
public class E2 {
  public final static INT TAILLE_PLATEAU = 20;
  public final static String CASE_VIDE = " ";
  public final static String CASE_REJOUER = "R";
  public final static String CASE_RECULER = "B";
  public final static String CASE_AVANCER = "A";
  public final static String CASE_DEPART = "D";
  public final static String CASE_FIN = "F";

  public static void main(String[] args) {
    System.out.println("Hello, World!");
    Scanner scanner = new Scanner(System.in);
    char[] plateau = initialiserPlateau();
    int positionJoueur = 0;
    boolean jeuTermine = false;
    int nombreDeLance = 0;
    System.out.println("Bienvenue dans le jeu de l'oie !");
    afficherPlateau(positionJoueur ,nombreDeLance,plateau );
    while (!jeuTermine) {
      System.out.println("appuyer sur Entrée pour lancer le dé...");
      scanner.nextLine();
      int de = lancerDe();
      nombreDeLance++;
      System.out.println("Vous avez obtenue" + de);
      positionJoueur = deplacerjoueur(positionJoueur, plateau, de);
      positionJoueur = appliquerEffetCase(plateau, positionJoueur);
      if (positionJoueur == TAILLE_PLATEAU - 1) {
        jeuTermine = true;
        System.out
            .println("Félicitations vous avez atteint la case final et gagné le jeu en " + nombreDeLance + " coups !");
      }
      jeuTermine = true;
    }
  }

  public static char[] initialiserPlateau() {
    char[] plateau = new char[TAILLE_PLATEAU];
    plateau[0] = CASE_DEPART;
    plateau[TAILLE_PLATEAU - 1] = CASE_FIN;
    for (int i = 1; i < TAILLE_PLATEAU - 1; i++) {
      plateau[i] = choisiSpécial();
    }
    return plateau;

  }

  public static String choisiSpécial() {
    String[] special = { CASE_REJOUER, CASE_RECULER, CASE_AVANCER, CASE_VIDE };
    int index = (int) (Math.random() * special.length);
    return special[index];
  }

  public static void afficherPlateau(int positionJoueur, int nombreDeLance, char[] plateau) {
    System.out.println("Position du joueur : " + positionJoueur);
    System.out.println("Nombre de lances : " + nombreDeLance);
    for (int i = 0; i < plateau.length; i++) {
      if (i == positionJoueur) {
        System.out.print("[X]");
      } else {
        System.out.print("[" + plateau[i] + "]");
      }
    }
    System.out.println();
  }

  public static int lancerDe() {
    return (int) (Math.random() * 6) + 1;
  }

  public static int deplacerjoueur(int positionJoueur, char[] plateau, int de) {
    positionJoueur += de;
    if (positionJoueur >= TAILLE_PLATEAU) {
      positionJoueur = TAILLE_PLATEAU - 1;
    }
    return positionJoueur;
  }

  public static int appliquerEffetCase(char[] plateau, int positionJoueur) {
    char caseActuelle = plateau[positionJoueur];
    if (caseActuelle == CASE_REJOUER) {
      System.out.println("Vous avez atterri sur une case Rejouer !");
      return positionJoueur; // Pas de changement de position
    } else if (caseActuelle == CASE_RECULER) {
      System.out.println("Vous avez atterri sur une case Reculer !");
      positionJoueur -= 2; // Reculer de deux cases
      if (positionJoueur < 0) {
        positionJoueur = 0; // Ne pas aller en dessous de la case départ
      }
    } else if (caseActuelle == CASE_AVANCER) {
      System.out.println("Vous avez atterri sur une case Avancer !");
      positionJoueur += 2; // Avancer de deux cases
      if (positionJoueur >= TAILLE_PLATEAU) {
        positionJoueur = TAILLE_PLATEAU - 1; // Ne pas dépasser la case finale
      }
    }
    return positionJoueur;
}
}
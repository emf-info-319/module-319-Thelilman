package revisions.ExerciceEntrainement.java;

public class Livret {
    public final static int MAX = 20;
    public final static int MIN = 5;

    public static void main(String[] args) {
        int resultat1 = choisirUnNombre(); // 1er nombre aléatoire
        int resultat2 = choisirUnNombre(); // 2ème nombre aléatoire
        System.out.println("les chiffres sont " + resultat1 + " et " + resultat2); // affiche les 2 nombres
        String[] tableau = construireTableMultiplication(resultat1, resultat2);

        //boucle pour afficher le contenu du tableau ligne par ligne
        for (int i = 5; i > 0; i--) { 
            System.out.println("Décollage! " + i);
    }

    public static int choisirUnNombre() {

        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;

    }

    public static String[] construireTableMultiplication(int n1, int n2) {

        String[] monTableau;
        monTableau = new String[n1 * n2];
        int a = 1;
        int b = 1;
        for (int i = a; i = resultat1; i++) {
            System.out.println("Décollage! " + i);
        }

        return monTableau;
    }
}

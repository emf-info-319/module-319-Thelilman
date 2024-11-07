package exercices.exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println("Voici le nb de caractère du String " + maChaineDeCaractere.length());

        maChaineDeCaractere.substring(9, 16);

        // Afficher la lettre à la position 10
        System.out.println("La lettre à la position 10 est : " + maChaineDeCaractere.charAt(10));
        String monPrénom = "Hadi";
        for (int i = 0; i < monPrénom.length(); i++) {
            System.out.println(monPrénom.charAt(i));
        }
    }

}

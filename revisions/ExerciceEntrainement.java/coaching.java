public class coaching {
    public static void main(String[] args) {
        int resultat = additione(3, 3);
        System.out.println("la réponse est " + resultat);
        String[] tabvide = new String[10];
        String[] tabRempli = rempliTableau(tabvide);
        int resultat2 = additione(5, 5);
        System.out.println("la réponse est " + resultat2);
        for(int i = 0; i < tabRempli.length; i++) {
            System.out.println(tabRempli[i]);
        }
    }

    public static int additione(int nombre1, int nombre2) { // () ---> dans les parenthèse on reçoit les nombres // int
                                                            // = type de retour
        int resultat = nombre1 + nombre2;
        return resultat;
    }

    public static String[] rempliTableau(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {

            tableau[i] = "bonjour";

        }
        return tableau;
    }

}

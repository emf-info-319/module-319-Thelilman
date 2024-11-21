public class Exercicerevision {
    public static void main(String[] args) {
        nbreAleatoire();
        String[] Sujet = { "Il ", "Michelle ", "Simon " };
        String[] verbe = { "combat ", "conduit ", "défonce ", "cours ", "marche " };
        String[] chose = { "un chien ", "un chat ", "un ours ", "une piste ", "une maison ", "un arbre" };

    }

    public static void nbreAleatoire() {
        int min = 5; // Limite inférieure
        int max = 15; // Limite supérieure
    }

    public static void choisirMot() {
        for (int i = 0; i < 10; i++) {
            String[] sujet = choisirMot(sujet);
            String[] verbe = choisirMot(verbe);
            String[] chose = choisirMot(chose);

            System.out.println(sujet + " " + verbe + " " + chose);
        }
    }
}

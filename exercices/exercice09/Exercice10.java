public class Exercice10 {
    public static void main(String[] args) {
        direBonjour (args);
        
        // Pour trouver le plus petit entre 5 et 10 
        int min = Math.min(5, 10);
        System.out.println("Le plus petit entre 5 et 10 est : " + min);

        // pour trouver le plus grand nombre entre 2 chiffres
        int max = Math.max(5,9);
        System.out.println("le plus grand nombre enttre 5 et 9 c'est : "+ max);

        // on utlise pow pour élever la base^à une puissance --- > a:2 = base b:3 = puissance
        int nombre1 = 2;
        int nombre2 = 3;
        double puissance = Math.pow(nombre1, nombre2);
        System.out.println(nombre1+ " élevé à la puissance "+ nombre2 +" est : " + puissance);
        
        // donne la valeur absolue ( valeur oppoosé comme 8 = -8 //  1 = -1 ...)
        int chiffre = -7;
        int abs = Math.abs(chiffre);
        System.out.println("la valeur absolue de " + chiffre + " c'est le "+ abs);
         
        // Utiliser Math.sqrt pour calculer la racine carrée
         double racine = Math.sqrt(16);
         System.out.println("La racine carrée de 16 est : " + racine);

    }
    public static void direBonjour(String[] args) {
        System.out.println("Bonjour");
    }

    public static void dire(String[] args) {
        System.out.println("n'importe quoi");
    }

    
}

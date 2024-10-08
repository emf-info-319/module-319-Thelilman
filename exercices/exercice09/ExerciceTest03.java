
public class ExerciceTest03 {

final static int MAX = 6; // Valeur de la Valeur aléatoire (maximum)
    final static int MIN = 1; // valeur de la valeur aléatoire (minimum)

    public static void main(String[] args) {
        int[] tab;
        tab = new int[10];
        int Somme = 0 ;
        int nombre ;

        for (int i = 0; i < tab.length; i++) {          // la constante 
        int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // met ++ si tu veux augmenter la valeur et -- pour la réduire
            System.out.println(nombre);                     // Affichage des nombres et pas du tableau 
                   tab[i]= nombre ;  
                               // peux remplacer nombre part i afin de mettre les variables directement         
        }
        
        
        for (int i = 0; i < tab.length; i++) {              // Affichage des nombres et du tableau

            System.out.println(tab[i]); 
        }
        
        
        // Calculer la moyenne
        double moyenne =  / tab.length;

        // Afficher la moyenne
        System.out.println("La moyenne est : " + moyenne);

        

            //tab[0]=4;
            //tab[1]=3;                               // de cette façon si ON A  les valeur et est en dehors du for()
            //tab[2]=5;                           

                                                    // ( tab = new int[]{4,3,5,5,1,4,3,2,6,5}; ) 
    }
}
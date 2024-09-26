public class exercice {

    public static void main(String[] args) {
     int [] tableau1 = {4,8,7,9,1,5,4,3}; // crééer un tableau avec des valeurs
     int [] tableau2 = {7,6,5,4,3,2,1,7};
     int [] resultat = new int [8]; // crée un tableau avec sa taille  

     for (int i = 0; i < tableau1.length; i++) {                // tableau tjr en crochet !
        int addition = tableau1[i] + tableau2[i];
        resultat[i]= addition;
        
        System.out.println(resultat[i]);            // toujours faire gaffe au crochet 
     } 
    }
}
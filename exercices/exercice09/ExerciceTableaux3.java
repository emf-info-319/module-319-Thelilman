public class ExerciceTableaux3 {
    public final static int MIN = 1;
    public final static int MAX = 6;
    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];
        // Générer un nbre aléatoire entier entre MIN (compris) et MAX (compris)
       int somme = 0 ;
       

        for(int i= 0 ; i<monTableau.length; i++){
            monTableau[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            somme += monTableau[i] ;
            System.out.println(monTableau[i]);

        }
        
        double moyenne =(double) somme / monTableau.length;

        System.out.println("la moyenne est :"+ moyenne);

    }

}
    


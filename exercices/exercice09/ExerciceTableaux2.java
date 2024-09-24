public class ExerciceTableaux2 {

    public final static int MIN = 1;
    public final static int MAX = 6;
    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];
        // Générer un nbre aléatoire entier entre MIN (compris) et MAX (compris)
        

        for(int i= 0 ; i<monTableau.length; i++){
            int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            monTableau[i]=nombre;
            System.out.println(monTableau[i]);

        }
        
    }

}

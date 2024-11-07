package exercice11;

public class ExercicesInversionTableau {
    public final static int MAX = 100; 
    public final static int MIN = 0;

    public static void main(String[] args) {
        int[] tableauInitial;
        tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = MIN + (int)(Math.random() * (MAX - MIN + 1));


    }
}

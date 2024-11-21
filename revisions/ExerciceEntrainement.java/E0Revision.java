public class E0Revision {
    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX= 6;
    public final static int NBRE_NOTE = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTE];
        int nombreAleatoire = ( int ) ( Math.random() * ( 6 - 1 + 1 ) ) + 0;
        System.out.println("le nombre est : " + nombreAleatoire);


}
}
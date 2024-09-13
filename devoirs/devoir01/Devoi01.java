package devoirs.devoir01;

public class Devoi01 {
    public static void main(String[] args) {
        int monAge = 30;
        boolean estMajeur;

        System.out.println("je m'appelle Hadi Harb");
        System.out.println("j'ai"+ monAge + "ans");
        if (monAge >= 20) {
            estMajeur = true;
        
        } else{
            estMajeur =false;
        }
            
        if (estMajeur) {
            System.out.println("je suis majeur");
        } else {
            System.out.println("je suis mineur");
        }
    
    }

}

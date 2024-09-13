package exercices.exercice08;

/**
 * ExerciceBoucles1
 */
public class ExerciceBoucles1   {

    public static void main(String[] args) {

        // Partie boucle for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);

        }

        // Partie boucle while
        int number = 1;
        while (number <= 5) {
            System.out.println("Boucle while, intération " + number);
            number++;
        }

        // partie boucle dowhile
        int numberDoWhile = 1;
        do {
            System.out.println("boucle do-while, intération" + numberDoWhile);
            numberDoWhile++;

        } while (numberDoWhile <= 5);

        // Partie boucle for sans itération 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Boucle for, itération " + i);
        }
        // partie boucle stopper à intération 3

        number = 1;
        while (number <= 5) {
            if (number > 3) {
                break;
            }
            System.out.println("Boucle while, intération " + number);
            number++;
        } 
        
        // Partie boucle for
        System.out.println("boucle for :");
        for (int i = 5; i >= 1;i--) {
            System.out.println(i);
            if (i==1){
                 System.out.println("décollage!!");
    }
        }
    
     // Partie boucle while exe 2
     number = 5;
     System.out.println("Boucle while");
     while (number == 1) {
         System.out.println(number);
         number--;
    
    
    
    
    
    }

}
}
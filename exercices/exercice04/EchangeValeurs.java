package exercices.exercice04;

public class EchangeValeurs {public static void main(String[] args) {
    int valeur1 = 1 ;
    int valeur2 = 2 ;
    int valeur3 = 0 ;

    System.out.println("le contenu de la variable est :"+ valeur1);
    System.out.println("le contenu de la variable est :"+valeur2);

    System.out.println("........Traitement......");
    //traitement
    valeur3 = valeur1;
    valeur1=valeur2; //valeur1=2
    valeur2=valeur3; //valeur2=2

    System.out.println("le contenu de la variable est :"+ valeur1);
    System.out.println("le contenu de la variable est :"+valeur2);

    

}

}

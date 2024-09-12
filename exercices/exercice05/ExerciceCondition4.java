package exercices.exercice05;

public class ExerciceCondition4 {public static void main(String[] args) {
    int temperature ;
    temperature = 100 ;
    if (temperature <-10) {
        System.out.println("il fait très froid");
        
    } else if(temperature<-10&&temperature<0) { 
        System.out.println("il fais froid");
    } else if (temperature<25&& temperature>0){
        System.out.println("il fait normal");
     } else if (temperature >35){System.out.println("il fait très très très chaud");}
}
    
}

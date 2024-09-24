
public static void main(String[] args) {
    int jour = 31;
    int mois = 12;
    int annee = 2024;
    int resultat = 0 ;

                                                    // remplace arg part la variable dont tu travails
    switch (mois) { 
        case 1: 
        resultat = jour ;
            
            break;
        case 2:
        resultat = jour + 31; // on ajoute 31 jours (dépend celon du mois !)
            break;
        case 3: 
        resultat = jour + 31 + 28 ;
            
            break;
        case 4: 
        resultat = jour + 31 + 28 + 31 ;
                
             break;
        case 5: 
        resultat = jour + 31 + 28 + 31+ 30;
                    
             break;
        case 6: 
        resultat = jour + 31 + 28 + 31+ 30+31;
                            
             break;
             case 7: 
             resultat = jour + 31 + 28 + 31+ 30+31+30;
                     
                     break;
            case 8: 
            resultat = jour +31 + 28 + 31+ 30+31+30+31;
                             
                     break;
            case 9: 
            resultat = jour +31 + 28 + 31+ 30+31+30+31+31;
                                              
                     break;
            case 10: 
             resultat = jour +31 + 28 + 31+ 30+31+30+31+31+30;
                                                       
                    break;
            case 11 : 
            resultat = jour +31 + 28 + 31+ 30+31+30+31+31+30+31;
                                              
                     break;
            case 12 : 
            resultat = jour +31 + 28 + 31+ 30 + 31+30+31+31+30+31+30;
                                              
                     break; // variable sur les mois ! 
        
    
        default:
            break;
    } // peut effectuer des changements après le switch (passer de mois à année)
    if(annee % 4 == 0 && mois >2) {
        resultat++; 
    } System.out.println("le " +jour+"."+mois+"." +annee+ " est " + resultat +" de l'année");
    // met des espaces dans les "" pour pas que tout soit collé
}
public class devoirs04 {
    public static void main(String[] args) {
        int jour = 24;
        int mois = 9; // jms de 0
        int annee = 2024;

        switch (mois) {
            case 1:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 2:
                if (jour >= 1 && jour <= 29 && annee%4==0 || jour >= 1 && jour <= 28 && annee%4!=0 ) {
                    System.out.println("la date formatée est le " + jour + " fevrier " + annee);
               
                    
                }
                else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 3:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 4:
                if (jour < 1 && jour > 30) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 5:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 6:
                if (jour < 1 && jour > 30) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 7:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 8:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 9:
                if (jour < 1 && jour > 30) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 10:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 11:
                if (jour < 1 && jour > 30) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;
            case 12:
                if (jour < 1 && jour > 31) {
                    System.out.println("erreur le jours est hors limite");
                } else if (annee >= 0 && annee <= 9999) {
                    System.out.println("la date formatée est le " + jour + " janvier " + annee);
                } else {
                    System.out.println("l'année [" + annee + "] est hors limite !");
                }
                break;

            default:
                break;

        }
    }

}
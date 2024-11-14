package exercice11;

public class exemple {
    public static void main(String[] args) {
                int[][] tableau = new int[3][4];
        
                // Remplissage du tableau avec des valeurs
                for (int i = 0; i < tableau.length; i++) { // Parcours des lignes
                    for (int j = 0; j < tableau[i].length; j++) { // Parcours des colonnes
                        tableau[i][j] = (i + 1) * (j + 1); // Remplissage avec le produit des indices pour l'exemple
                    }
                }
        
                // Affichage du tableau
                System.out.println("Tableau 2D :");
                for (int[] tableau1 : tableau) {
                    for (int j = 0; j < tableau1.length; j++) {
                        System.out.print(tableau1[j] + "\t"); // "\t" pour séparer par des tabulations
                    }
                    System.out.println(); // Nouvelle ligne pour chaque ligne du tableau
                }
            }
        }
        
    


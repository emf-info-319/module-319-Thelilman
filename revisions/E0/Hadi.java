public class Hadi {

    public final static int NOTE_MAX = 6;
    public final static int NOTE_MIN = 1;
    public final static int NBRE_NOTES = 5;
    private static final int A = 0;

    public static void main(String[] args) {
        int[] notesObtenues;
        notesObtenues = new int[NBRE_NOTES];
        //int NBRE_NOTES = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
        
        double totalNote = 0;
        for(int i= 0 ; i<notesObtenues.length; i++){
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) +NOTE_MIN;
        
            switch (notesObtenues[i]) {
                case 1,2,3,4: 
                if (i==4) {System.out.println("la note obtenue est "+NBRE_NOTES+" suffisant");
                    
                } 
                 if(i<=3) {System.out.println("la note obtenue est "+NBRE_NOTES+" insuffisant");
                
                    
                }if (i==5) {System.out.println("la note obtenue est "+NBRE_NOTES+" bien");
                    
                }
                 if (i==6) {System.out.println("la note obtenue est "+NBRE_NOTES+" très bien");
                    
                }
                 
                    
                
                    break;
                   
                

                default:
                    
            }

        }
            
    }
            

    }

   
package garmaciam_personeammalate_01;

import java.util.Scanner;

/**
 *
 * @author 18642
 */
public class GarmaciaM_personeammalate_01 {


    public static void main(String[] args) {
        int popolazione = 60360000, infetti = 1, giorni = 0, i;
        Scanner inp = new Scanner(System.in);  
        System.out.println("inserire il tasso di propagazione: \n");
        int tassoP = inp.nextInt();
        
        for (i = 0; i<(popolazione/2);i++){
            infetti = tassoP*infetti;
            giorni = i;
        }
        
        System.out.println("il numero di giorni fino a quando la meta' della popolazione sara' infetta: " + giorni);
    }
    
}

package garmaciam_personeammalate_02;

import java.util.Scanner;

/**
 *
 * @author 18642
 */
public class GarmaciaM_personeammalate_02 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);  
        System.out.println("inserire il numero totale di ammalati: ");
        double perc_guar = inp.nextDouble();
        int giorni = 0;
        System.out.println("inserire la percentuale di guariti al giorno: ");
        double infetti = inp.nextDouble(),guariti;
        
        while (infetti > 100){
            guariti = (infetti*10)/100;
            infetti = infetti-guariti;
            giorni = giorni+1;
        }
        
        System.out.println("il numero di giorni fino a quando i numeri di ammalati saranno meno di cento sono: " + giorni);
    }
    
}

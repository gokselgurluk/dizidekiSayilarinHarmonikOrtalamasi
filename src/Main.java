
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {




//Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
//
//Harmonik Seri Formülü :1/a+1/b+1/c abc dizideki elemanlar

        double harmonikSerisi = 0.0;
        double sum = 0.0;
        int[] numbers = {1, 2, 3, 4, 5};




            for (int i = 0; i < numbers.length; i++) {
                //for(int y= 1; y<= numbers[i];y++)
                    harmonikSerisi += (1.0/numbers[i]);
               // sum += numbers[i];
                }


            sum = numbers.length/harmonikSerisi;


            System.out.println("Harmonik Ortalama : "+sum);

    }
}


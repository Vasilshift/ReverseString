import java.util.Scanner;

import static java.lang.Math.abs;

public class Quiz {
    public static void main(String[] args) {

        int[] array = new int[8];
        int[] arraysort = new int[8];
        //Scanner sc = new Scanner(System.in);
        //a = sc.nextInt();
        for (int i = 0; i <array.length; i++) {
            array[i] = i;
            if(i % 2 == 0) {
                arraysort[i] = i;
            }
        }
        for(int k= 0; k < arraysort.length; k++) {
            System.out.print(arraysort[k]);
        }
    }

}
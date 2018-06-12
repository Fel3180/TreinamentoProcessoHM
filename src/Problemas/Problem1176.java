package Problemas;

import java.util.Scanner;

public class Problem1176 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        Long vet[] = new Long[10000000];

        Long x = 0l;
        Long y = 1l;

        vet[0] = x;
        vet[1] = y;

        int k = 2;
        while (k < 10000000){
            Long result = x + y;
            x = y;
            y = result;

            vet[k] = result;

            k++;
        }

         while (i > 0) {
            int j = in.nextInt();
            System.out.println("Fib("+j+") = " +vet[j]);
            i--;
        }
    }
}

package Problemas;

import java.util.Scanner;

public class Problem1151 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int x = 0;
        int y = 1;
        int result = 0;

        String printResult = x + " " + y;

        i = i - 2;
        while (i > 0){
            result = x + y;

            printResult = printResult + " " + result;

            x = y;
            y = result;

            i--;
        }
        System.out.println(printResult);
    }
}

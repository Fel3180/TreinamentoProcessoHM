package Problemas;

import java.util.Scanner;

public class Problem1153 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int result = 1;

        while (i > 0){
            result = result * i--;
        }

        System.out.println(result);
    }
}

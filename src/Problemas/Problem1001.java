package Problemas;

import java.util.Scanner;

public class Problem1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("X = "+ somar(in));
    }

    private static int somar(Scanner in) {
        return in.nextInt() + in.nextInt();
    }
}

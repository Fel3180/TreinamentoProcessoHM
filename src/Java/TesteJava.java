package Java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TesteJava {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] a = new int[3];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[3];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int[] result = solve(a, b);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
	}
	
	  // Complete the solve function below.
    public static int[] solve(int[] a, int[] b) {
     int[] resultado = new int[5]; 
     for(int i =0; i < a.length; i++){
         if(a[i] > b[i]){
             resultado[i] = 1;
         } else if (b[i] > a[i]){
             resultado[i] = 1;
         }
     }
        return resultado;
    }
}

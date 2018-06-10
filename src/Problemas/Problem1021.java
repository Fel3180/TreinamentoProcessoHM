package Problemas;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem1021 {

    static BigDecimal valor = BigDecimal.valueOf(0);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        valor = in.nextBigDecimal();

        int qtdNotas100 = countQtdNotasEMoedas(BigDecimal.valueOf(100));
        int qtdNotas50 = countQtdNotasEMoedas(BigDecimal.valueOf(50));
        int qtdNotas20 = countQtdNotasEMoedas(BigDecimal.valueOf(20));
        int qtdNotas10 = countQtdNotasEMoedas(BigDecimal.valueOf(10));
        int qtdNotas5 = countQtdNotasEMoedas(BigDecimal.valueOf(5));
        int qtdNotas2 = countQtdNotasEMoedas(BigDecimal.valueOf(2));
        int qtdMoedas1 = countQtdNotasEMoedas(BigDecimal.valueOf(1));
        int qtdMoedas50 = countQtdNotasEMoedas(BigDecimal.valueOf(0.50));
        int qtdMoedas25 = countQtdNotasEMoedas(BigDecimal.valueOf(0.25));
        int qtdMoedas10 = countQtdNotasEMoedas(BigDecimal.valueOf(0.10));
        int qtdMoedas5 = countQtdNotasEMoedas(BigDecimal.valueOf(0.05));
        int qtdMoedas01 = countQtdNotasEMoedas(BigDecimal.valueOf(0.01));

        imprimirResultado(qtdNotas100, qtdNotas50, qtdNotas20, qtdNotas10, qtdNotas5, qtdNotas2,
                qtdMoedas1, qtdMoedas50, qtdMoedas25, qtdMoedas10, qtdMoedas5, qtdMoedas01);
    }

    private static int countQtdNotasEMoedas(BigDecimal notaMoeda) {
        int qtdNotasEMoedas = 0;
        while(valor.compareTo(notaMoeda) >= 0){
            ++qtdNotasEMoedas;
            valor = valor.subtract(notaMoeda);
        }
        return qtdNotasEMoedas;
    }

    private static void imprimirResultado(int qtdNotas100, int qtdNotas50, int qtdNotas20, int qtdNotas10,
                                          int qtdNotas5, int qtdNotas2, int qtdMoedas1, int qtdMoedas50,
                                          int qtdMoedas25, int qtdMoedas10, int qtdMoedas5, int qtdMoedas01) {
        System.out.println("NOTAS:");
        System.out.println(qtdNotas100 + " nota(s) de R$ 100.00");
        System.out.println(qtdNotas50 + " nota(s) de R$ 50.00");
        System.out.println(qtdNotas20 + " nota(s) de R$ 20.00");
        System.out.println(qtdNotas10 + " nota(s) de R$ 10.00");
        System.out.println(qtdNotas5 + " nota(s) de R$ 5.00");
        System.out.println(qtdNotas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(qtdMoedas1 + " moeda(s) de R$ 1.00");
        System.out.println(qtdMoedas50 + " moeda(s) de R$ 0.50");
        System.out.println(qtdMoedas25 + " moeda(s) de R$ 0.25");
        System.out.println(qtdMoedas10 + " moeda(s) de R$ 0.10");
        System.out.println(qtdMoedas5 + " moeda(s) de R$ 0.05");
        System.out.println(qtdMoedas01 + " moeda(s) de R$ 0.01");
    }
}

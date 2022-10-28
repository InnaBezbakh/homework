package ritas.homework;

import java.sql.SQLOutput;

public class RitasHomework {

    public static int task1_1(int a, int b) {
        int gcd = 1;
        for (int i=1; i<= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int task1_2(int number) {
        String convertNumberToSrting = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < convertNumberToSrting.length(); i++) {
            int x = convertNumberToSrting.charAt(i) - '0';
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(task1_1(24,54));
        System.out.println(task1_2(6005));
    }
}

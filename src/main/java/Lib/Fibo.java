package Lib;

public class Fibo {
    public static int fibo(int n) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        if (n > 1) {
            for (int i = 0; i < n; i++) {

                sum = num1 + num2;

                num1 = num2;
                num2 = sum;

            }
        }
        return num1;
    }
}

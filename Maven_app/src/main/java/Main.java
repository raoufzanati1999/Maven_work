import Lib.Fibo;
import java.util.Scanner;
public class Main {




    public static void main(String[] args) throws InterruptedException {


        System.out.println("FibonacciSequence:");
        System.out.println("Enter the index of Fibonacci Sequence");

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        System.out.println("\nThe Fn of " + n + " : " + Fibo.fibo(n));


    }
}

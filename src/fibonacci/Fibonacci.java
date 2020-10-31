package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Ktory wyraz ciagu podac?");
        Scanner in = new Scanner(System.in);
        int numerWCiagu = in.nextInt();

        int x1 = 1;
        int x2 = 1;
        for (int i = 3; i <= numerWCiagu; i++) {
            int temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(x2);
    }
}

package CodePlus.Oct08;

import java.util.Scanner;

public class Sol10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        //There is no information about input size.
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a + b);
        }
    }
}

package CodePlus.Oct09;

/*
*
* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*
* 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
* 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* */


import java.util.Scanner;

public class Sol11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int a, b;

        for (int i = 1; i < t + 1; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}

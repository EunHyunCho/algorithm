package Programmers.Level1;

/*
 두 정수 사이의 합
 */

public class Sol12912 {
    public static void main(String[] args) {
        System.out.println(solution(-4, -7));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int big = Math.max(a, b);
        int small = Math.min(a, b);

        for (int i = small; i <= big; i++) {
            answer += i;
        }

        return answer;
    }
}

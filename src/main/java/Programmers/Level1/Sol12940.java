package Programmers.Level1;
/*
    최대공약수와 최소공배수

    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

    제한 사항
    두 수는 1이상 1000000이하의 자연수입니다.
 */

import java.util.Arrays;

public class Sol12940 {
    public static void main(String[] args) {
        Solution12940 solution12940 = new Solution12940();
        int[] answer = solution12940.solution(43, 2);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n > m) {
            int swap = m;
            m = n;
            n = swap;
        }

        for (int i = n; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = (m * n) / i;
                break;
            }
        }
        return answer;
    }
}


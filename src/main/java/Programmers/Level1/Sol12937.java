package Programmers.Level1;

/*
    정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.

    제한 조건
    num은 int 범위의 정수입니다. - 음수도 포함된다는 말
    0은 짝수입니다.
*/

public class Sol12937 {
    public static void main(String[] args) {
        Solution12937 sol = new Solution12937();
        System.out.println(sol.solution(-9));
    }
}

class Solution12937 {
    public String solution(int num) {
        String answer = "";
        answer = (num % 2 == 1 || num % 2 == -1) ? "Odd" : "Even";
        return answer;
    }
}
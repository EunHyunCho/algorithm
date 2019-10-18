package Programmers.Level2;

/*
    쇠막대기 문제 (Stack)
*/

import java.util.Stack;

public class Sol42585 {
    public static void main(String[] args) {
        System.out.println(solution("()(((()())(())()))(())"));
    }

    public static int solution(String arrangement) {
        int answer = 0;
        String[] arr = arrangement.split("");
        Stack stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) stack.push("(");

            else {
                if (arr[i - 1].equals("(")) answer += stack.size() - 1;
                else answer += 1;
                stack.pop();
            }
        }
        return answer;
    }
}

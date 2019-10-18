package CodePlus.Oct18;

/*
    쇠막대기
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sol10799 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bracket(bufferedReader.readLine()));
    }

    public static int bracket(String bracket) {
        int answer = 0;
        String[] arr = bracket.split("");
        Stack stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) stack.push("(");
            else {
                if (arr[i - 1].equals(")")) answer += 1;
                else answer += stack.size() - 1;
                stack.pop();
            }
        }

        return answer;
    }
}

package Programmers.Level1;

/*
    가운데 글자 가져오기
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    재한사항
    s는 길이가 1 이상, 100이하인 스트링입니다.
 */

public class Sol12903 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        if (s.length() % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == (arr.length / 2 - 1) || i == (arr.length / 2))
                    answer = answer.concat(arr[i]);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == (arr.length / 2))
                    answer = answer.concat(arr[i]);
            }
        }

        return answer;
    }
}

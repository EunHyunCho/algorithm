package Programmers.Oct09;

import java.util.Arrays;

public class Sol42576 {
    public static void main(String[] args) {
        Solution42576 s = new Solution42576();
        String[] participant = 	{"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer =  s.solution(participant, completion);
        System.out.println(answer);
    }
}

class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }

        return participant[participant.length - 1];
    }
}

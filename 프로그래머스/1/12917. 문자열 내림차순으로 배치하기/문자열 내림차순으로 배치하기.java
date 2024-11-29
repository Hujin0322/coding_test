import static java.util.Arrays.sort;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        sort(answer, Collections.reverseOrder());
        return String.join("", answer);
    }
}
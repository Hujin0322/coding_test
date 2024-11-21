import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] num = Long.toString(n).split("");
        Arrays.sort(num, Collections.reverseOrder());
        return Long.parseLong(String.join("", num));
    }
}
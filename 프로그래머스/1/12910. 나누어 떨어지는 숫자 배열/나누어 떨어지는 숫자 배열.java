import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int n : arr) {
            if (n % divisor == 0) {
                answer.add(n);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        Collections.sort(answer);
        return (answer);
    }
}
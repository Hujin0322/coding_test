import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (!(i == j)) {
                    int sum = numbers[i]+numbers[j];
                    set.add(sum);
                }
            }
        }

        List<Integer> answer = new ArrayList<>(set);
        answer.sort(Integer::compareTo);

        return answer;
    }
}
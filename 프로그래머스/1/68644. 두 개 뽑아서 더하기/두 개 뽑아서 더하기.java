import java.util.TreeSet;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (!(i == j)) {
                    int sum = numbers[i]+numbers[j];
                    set.add(sum);
                }
            }
        }
        return set;
    }
}
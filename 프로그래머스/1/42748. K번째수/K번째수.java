import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int s = commands[i][0]-1;
            int e = commands[i][1];
            int k = commands[i][2]-1;
            
            int[] nums = Arrays.copyOfRange(array, s, e);
            Arrays.sort(nums);
            answer[i] = nums[k];
        }
        return answer;
    }
}
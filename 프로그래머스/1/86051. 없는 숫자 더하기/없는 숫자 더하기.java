import java.util.ArrayList;

class Solution {
    public int solution(int[] numbers) {
        int[] list = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> nums = new ArrayList<>();
        for (int num: numbers){
            nums.add(num);
        }
        
        int answer = 0;
        for (int num: list) {
            if (!nums.contains(num)) {
                answer += num;
            }
        }
        return answer;
    }
}
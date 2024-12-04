class Solution {
    private int answer = 0;

    public int solution(int[] number) {
        int r = 3;
        combination(number, new int[r], 0, 0, r);
        return answer;
    }

    public void combination(int[] number, int[] temp, int start, int depth, int r) {
        if (depth == r) {
            int sum = 0;
            for (int num : temp) {
                sum += num; 
            }
            if (sum == 0) { 
                answer++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            temp[depth] = number[i];
            combination(number, temp, i + 1, depth + 1, r);  
        }
    }
}

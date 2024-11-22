class Solution {

    public long solution(int a, int b) {
     	int a1 = Math.min(a, b);
		int b1 = Math.max(a, b);
        long answer = (long) (b1 - a1 + 1) * (a1 + b1) / 2;
        return answer;
    }
}
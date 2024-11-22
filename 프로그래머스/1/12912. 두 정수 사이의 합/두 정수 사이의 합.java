class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int num = 0;
        if (a>=b){
            num = a;
            a = b;
            b = num;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
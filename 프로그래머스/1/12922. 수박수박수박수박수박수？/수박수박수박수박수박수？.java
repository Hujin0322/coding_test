class Solution {
    public String solution(int n) {
        String word = "수박";
        StringBuilder answer = new StringBuilder();
        answer.append(word.repeat(Math.max(0, n / 2)));
        if (n % 2 != 0) {
            answer.append("수");
        }
        return answer.toString();
    }
}
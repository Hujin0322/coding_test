class Solution {
    public String solution(String s) {
        String answer = "";
        // 홀수인 경우: 길이%2 내림
        if (s.length()%2 != 0){
            answer = String.valueOf(s.charAt(s.length()/2));
        } else {
            answer = String.valueOf(s.charAt(s.length()/2-1))+String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}
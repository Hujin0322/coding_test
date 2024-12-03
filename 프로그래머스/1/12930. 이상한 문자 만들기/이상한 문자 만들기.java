class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0; 
        String[] array = s.split("");

        for (String ss : array) {
            if (ss.equals(" ")) {
                cnt = 0;
                answer.append(" ");
            } else {
                cnt++;
                answer.append(cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
            }
        }

        return answer.toString();
    }
}

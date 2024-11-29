class Solution {
    public long solution(int price, int money, int count) {
        long total = (long) count * price * (count + 1) / 2;
        long answer = total - money;
        return (answer > 0)? answer : 0;
    }
}
class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        while (b != 0) { 
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;

        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }
}

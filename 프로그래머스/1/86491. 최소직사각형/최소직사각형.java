class Solution {
    public int solution(int[][] sizes) {
        int W = 0, H = 0;
        for (int i=0;i< sizes.length;i++){
            int w = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            W = Math.max(W,w);
            H = Math.max(H,h);
        }
        return W*H;
    }
}
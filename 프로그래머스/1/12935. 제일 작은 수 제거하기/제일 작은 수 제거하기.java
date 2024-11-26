class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return (arr[0] == 10)? new int[]{-1} : new int[] {};
        }

        int min = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
        }
        
        int[] ans = new int[arr.length-1];
        
        int i = 0;
        for (int num : arr) {
            if (num != min) {
                ans[i++] = num;
            }
        }return ans;
    }
}
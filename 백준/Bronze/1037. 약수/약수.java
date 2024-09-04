import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] nums = new int[a];
        for (int i=0;i<a;i++) nums[i] = sc.nextInt();
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[a-1]);
        }
    }

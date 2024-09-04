import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        sc.nextLine();
        String[] list = sc.nextLine().split(" ");
        int[] nums = new int[a];
        for (int i=0;i<a;i++) {
            nums[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[list.length-1]);
        }
    }

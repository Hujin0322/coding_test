import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            int a = (int) Math.pow(sc.nextInt(), 2);
            int b = (int) Math.pow(sc.nextInt(), 2);
            int c = (int) Math.pow(sc.nextInt(), 2);

            if(a==0) break;

            int[] arr = {a,b,c};
            Arrays.sort(arr);

            System.out.println(arr[0]+arr[1]==arr[2]?"right":"wrong");
        }
    }
}   

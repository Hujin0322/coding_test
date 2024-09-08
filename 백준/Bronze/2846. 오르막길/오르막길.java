import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] list = new int[a];
        for (int i = 0; i < a; i++) {
            list[i] = sc.nextInt();
        }
        
        int n=0, no=0;
        for (int j = 0; j < a - 1; j++) {
            if (list[j] < list[j + 1]) {
                n = n + list[j + 1] - list[j];
                if (no < n) no = n;
            } else n = 0;
        }
        System.out.print(no);
    }
}

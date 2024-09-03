import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((b+c) % 2 == (i + j) % 2) {
                    System.out.print("v");
                } else System.out.print(".");
            }
            System.out.println();
        }
    }
}

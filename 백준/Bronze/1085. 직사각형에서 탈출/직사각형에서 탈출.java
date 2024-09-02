import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int result = Math.min(Math.min((h-y), (w-x)), Math.min(x, y));
        System.out.println(result);
    }
}

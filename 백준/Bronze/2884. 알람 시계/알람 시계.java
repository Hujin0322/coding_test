import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(m<45?(h+23)%24+" "+(m+15):h+" "+(m-45));
    }
}

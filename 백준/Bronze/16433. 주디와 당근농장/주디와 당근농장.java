import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String [][] list = new String[num1][num1];

        if ((num2+num3) % 2 == 0){
            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num1; j++) {
                    if ((i + j) % 2 == 0) {
                        list[i][j] = "v";
                    } else list[i][j] = ".";
                }
            }
        }else{
            for (int i = 0; i < num1; i++) {
                for (int j = 0; j < num1; j++) {
                    if ((i+j)% 2 != 0) {
                        list[i][j] = "v";
                    }else list[i][j] = ".";
                }
            }
        }

        for (int i=0; i<num1;i++){
            for (int n=0; n<num1;n++){
                System.out.printf("%s",list[i][n]);
            }
            System.out.println();
        }
    }
}

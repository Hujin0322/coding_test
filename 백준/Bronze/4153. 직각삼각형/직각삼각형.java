
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            String[] list = sc.nextLine().split(" ");
            int[] num = new int[list.length];

            for (int i=0;i<list.length;i++){
                num[i] = Integer.parseInt(list[i]);
            }
            Arrays.sort(num);
            int a = (int) Math.pow(num[0],2);
            int b = (int) Math.pow(num[1],2);
            int c = (int) Math.pow(num[2],2);

            if(a==0) break;
            else if(a+b==c){
                System.out.println("right");
            }else{System.out.println("wrong");}
        }
    }

}   

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int[] list = new int[6];
        for (int i=0;i<6;i++){
            list[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0;i<6;i++){
            int q = list[i]/a;
            int r = list[i]%a;
            if (q==0){
                if (r==0) continue;
                else cnt++;
            }else if (q!=0){
                if (r==0) cnt=cnt+q;
                else cnt=cnt+1+q;
            }
        }System.out.println(cnt);
        System.out.println((int)n/b+" "+(int)n%b);
    }
}

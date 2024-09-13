import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.next();
        }
        for (int i=0;i<arr.length;i++) {
            int cnt = 0;
            int sum = 0;

            for (int j=0; j<arr[i].length();j++){
                if (arr[i].charAt(j)=='O'){
                    cnt++;
                    sum += cnt;
                }else{cnt=0;}
            }
            arr[i] = Integer.toString(sum);
        }
        for(String t : arr){
            System.out.println(t);
        }sc.close();
    }
}

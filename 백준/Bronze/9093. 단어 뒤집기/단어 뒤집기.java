import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<a;i++){
            String str = sc.nextLine();
            String[] list = str.split(" ");
            for(String word : list){
                StringBuilder re = new StringBuilder(word);
                sb.append(re.reverse().append(" "));
            }sb.append("\n");
        }
        System.out.println(sb);
    }
}

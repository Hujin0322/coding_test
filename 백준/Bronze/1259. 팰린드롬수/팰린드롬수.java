import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String str = sc.next();
            if (str.equals("0")) break;
            String sb = new StringBuffer(str).reverse().toString();
            if(str.equals(sb)){
                list.add("yes");
            }else{list.add("no");}
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

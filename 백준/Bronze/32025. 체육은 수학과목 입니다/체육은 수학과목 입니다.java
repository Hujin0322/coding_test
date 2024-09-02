import java.util.Scanner;

public class Main {
  public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      int int1 = sc.nextInt()*100;
      int int2 = sc.nextInt()*100;

      int min = Math.min(int1,int2);

      System.out.println(min/2);
  }
}
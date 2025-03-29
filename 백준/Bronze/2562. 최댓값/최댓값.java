import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            array[i] = Integer.parseInt(input);
        }

        int max = array[0];
        int index = 0;

        for (int i = 1; i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.print(index+1);
    }
}

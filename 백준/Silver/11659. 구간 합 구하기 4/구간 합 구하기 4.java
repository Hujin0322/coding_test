import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] S = new int[N+1];

        String[] numbers = br.readLine().split(" ");
        for (int i=1; i<=N;i++){
            S[i] = S[i-1] + Integer.parseInt(numbers[i-1]);
        }
        
        for (int a=0;a<M;a++){
            String[] input2 = br.readLine().split(" ");
            int i = Integer.parseInt(input2[0]);
            int j = Integer.parseInt(input2[1]);
            bw.write((S[j]-S[i-1]) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double sum = 0.0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (A > max) {
                max = A;
            }
            sum += A;
        }
        System.out.println(sum * 100.0 / max / N);
    }
}

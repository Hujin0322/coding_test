import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        int s = 0, e = N - 1, count = 0;

        while (s < e) {
            int sum = numbers[s] + numbers[e];
            if (sum < M) {
                s++;
            } else if (sum > M) {
                e--;
            } else {
                count++;
                s++;
                e--;
            }
        }
        System.out.println(count);
    }
}

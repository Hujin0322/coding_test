import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] requiredCount = new int[4];
    static int[] currentCount = new int[4];
    static int validCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 부분문자열

        char[] dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            requiredCount[i] = Integer.parseInt(st.nextToken());
            if (requiredCount[i] == 0) {
                validCount++;
            }
        }

        for (int i = 0; i < P; i++) {
            add(dna[i]);
        }

        int result = (validCount == 4) ? 1 : 0;

        for (int i = P; i < S; i++) {
            add(dna[i]);
            remove(dna[i - P]);

            if (validCount == 4) {
                result++;
            }
        }
        System.out.println(result);
    }

    static void add(char c) {
        int idx = genIndex(c);
        currentCount[idx]++;

        if (currentCount[idx] == requiredCount[idx]) {
            validCount++;
        }
    }

    static void remove(char c) {
        int idx = genIndex(c);

        if (currentCount[idx] == requiredCount[idx]) {
            validCount--;
        }
        currentCount[idx]--;
    }

    static int genIndex(char c) {
        if (c == 'A') {
            return 0;
        }
        if (c == 'C') {
            return 1;
        }
        if (c == 'G') {
            return 2;
        }
        return 3;
    }
}

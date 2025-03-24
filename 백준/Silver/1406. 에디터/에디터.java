import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) list.add(c);

        ListIterator<Character> cursor = list.listIterator();
        while (cursor.hasNext()) cursor.next();

        for (int i=0;i<M;i++) {
            String commend = br.readLine();
            switch (commend.charAt(0)) {
                case 'L': if (cursor.hasPrevious()) cursor.previous(); break;
                case 'D': if (cursor.hasNext()) cursor.next(); break;
                case 'B': if (cursor.hasPrevious()) {cursor.previous(); cursor.remove();} break;
                case 'P': cursor.add(commend.charAt(2)); break;
            }
        }

        for (char c: list) sb.append(c);
        System.out.println(sb);
    }
}

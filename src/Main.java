import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            calc();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String calc() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
    }
}

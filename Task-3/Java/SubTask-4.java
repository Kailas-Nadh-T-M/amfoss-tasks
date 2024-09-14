import java.io.*;

public class DiamondFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader a = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter b = new BufferedWriter(new FileWriter("output.txt"));
            
            int n = Integer.parseInt(a.readLine());
            a.close();
            
            StringBuilder pattern = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    pattern.append(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    pattern.append("*");
                }
                pattern.append("\n");
            }
            for (int i = n - 2; i >= 0; i--) {
                for (int j = 0; j < n - i - 1; j++) {
                    pattern.append(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    pattern.append("*");
                }
                pattern.append("\n");
            }
            
            b.write(pattern.toString());
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

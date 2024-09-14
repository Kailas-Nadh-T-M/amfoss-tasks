import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            BufferedReader a = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter b = new BufferedWriter(new FileWriter("output.txt"));
            
            String line = a.readLine();
            if (line != null) {
                b.write(line);
            }
            
            a.close();
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

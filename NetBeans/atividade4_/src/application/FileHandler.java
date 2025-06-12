
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void saveData(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true));
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

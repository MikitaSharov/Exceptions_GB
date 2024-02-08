import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write (Human human) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(human.lastName + ".txt", true));) {
            writer.write(human.toString());
        } catch (IOException e) {
            throw new RuntimeException("нет подключения к файлу");
        }
    }
}

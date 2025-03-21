import com.google.common.base.Charsets;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;

public class DeprecatedExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            // This uses the deprecated Charsets.UTF_8 constant.
            // In newer versions, it is recommended to use StandardCharsets.UTF_8.
            String content = Files.toString(file, Charsets.UTF_8);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import com.google.common.base.Charsets;       // Deprecated in Guava 32+
import java.nio.charset.StandardCharsets;

public class SampleGuava {
    public static void main(String[] args) {
        String text = "Hello, Guava!";
        
        // — Affected code: Guava’s Charsets.UTF_8 is deprecated
        byte[] bytesDeprecated = text.getBytes(Charsets.UTF_8);
        System.out.println("Deprecated → " + sDeprecated);

    }
}

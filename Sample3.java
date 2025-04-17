import com.google.gson.JsonParser;   // JsonParser() ctor is @Deprecated
import com.google.gson.JsonElement;

public class SampleGsonDeprecated {
    public static void main(String[] args) {
        String json = "[\"apple\",\"banana\",\"cherry\"]";

        // — Affected code (deprecated in Gson 2.8.6+):
        JsonParser parser   = new JsonParser();   
        JsonElement element = parser.parse(json);
        System.out.println("Parsed via deprecated API: " + element);
    }
}

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class SampleGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "[\"apple\",\"banana\",\"cherry\"]";
        
        // — Affected code: using TypeToken.fromJson API which DevSync will flag
        List<String> list = gson.fromJson(
            json,
            new TypeToken<List<String>>() {}.getType()
        );
        
        System.out.println("Parsed list: " + list);
    }
}

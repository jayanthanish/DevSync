import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Excluder;  // com.google.gson.Excluder

public class SampleGsonExcluderDeprecated {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // — Affected code: Gson.excluder() is @Deprecated as of 2.8.9
        Excluder ex = gson.excluder();
        System.out.println("Deprecated excluder → " + ex);
    }
}

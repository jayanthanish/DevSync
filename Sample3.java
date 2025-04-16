import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Preconditions;  // Deprecated/internal
import com.google.gson.JsonObject;

public class Sample3 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Deprecated: Using internal utility class (will be inaccessible)
        $Gson$Preconditions.checkNotNull("data");

        // Deserialization with missing fields now handles nulls more strictly
        String json = "{\"name\": null}";
        JsonObject obj = gson.fromJson(json, JsonObject.class);

        System.out.println("Name: " + obj.get("name"));  // null-safe behavior updated in newer versions
    }
}

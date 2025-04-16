import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.StringUtils;

public class Sample {
  public static void main(String[] args) {
    // Commons Lang: String check
    String input = "   ";
    if (StringUtils.isBlank(input)) {
      System.out.println("Input is blank");
    } else {
      System.out.println("Input is not blank");
    }

    // Gson: JSON serialization
    JsonObject obj = new JsonObject();
    obj.addProperty("name", "DevSync");
    obj.addProperty("version", 1.0);

    Gson gson = new Gson();
    String jsonOutput = gson.toJson(obj);
    System.out.println("Serialized JSON: " + jsonOutput);

    // Gson: JSON deserialization
    JsonObject parsed = gson.fromJson(jsonOutput, JsonObject.class);
    System.out.println("Parsed back: " + parsed.get("name").getAsString());
  }
}

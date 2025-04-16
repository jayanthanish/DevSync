import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class Sample3 {
  public static void main(String[] args) {
    String json = "[\"a\", \"b\"]";
    Gson gson = new Gson();

    // ❗ This usage was flagged in 2.10 due to issues with unchecked conversion
    List<String> list = gson.fromJson(json, new TypeToken<List<String>>(){}.getType());

    System.out.println(list);
  }
}

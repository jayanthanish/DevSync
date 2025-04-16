import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonObject;
import com.google.common.collect.ImmutableList;

public class Sample3 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Known problem: deserializing into abstract ImmutableList
        String json = "[\"a\", \"b\"]";
        ImmutableList<String> list = gson.fromJson(json, new TypeToken<ImmutableList<String>>(){}.getType());

        // Deprecated internal usage (recently renamed)
        com.google.gson.internal.$Gson$Preconditions.checkNotNull("data");
    }
}

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.ArrayList;

public class Sample3 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Deprecated pattern: trying to deserialize into ImmutableList
        String jsonList = "[\"a\", \"b\", \"c\"]";
        List<String> list = gson.fromJson(jsonList, new TypeToken<com.google.common.collect.ImmutableList<String>>(){}.getType());

        // Previously internal class references (renamed recently)
        com.google.gson.internal.$Gson$Types.getRawType(String.class);
        com.google.gson.internal.$Gson$Preconditions.checkNotNull("value");
    }
}

package DeutscheBankAG;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON_Runner_Serialization {
    public static void main(String[] args){
        //Converting Java object to JSON (Serialization)

        Person p1 = new Person("Jatin");
        System.out.println(p1);

        //Convert Java object to JSON using GSON library
        Gson gson = new Gson();
        String data = gson.toJson(p1);
        System.out.println(data);

        //Convert JSON in a pretty format!!
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String formattedData = gsonPretty.toJson(p1);
        System.out.println(formattedData);
    }
}

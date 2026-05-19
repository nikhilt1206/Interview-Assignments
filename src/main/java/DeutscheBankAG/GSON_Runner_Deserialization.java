package DeutscheBankAG;

import com.google.gson.Gson;

public class GSON_Runner_Deserialization {
    public static void main(String[] args){
        //Converting JSON object to Java object

        String data = "{\n" +
                "  \"name\": \"Jatin\"\n" +
                "}";
        Gson gson = new Gson();
        Person p =gson.fromJson(data,Person.class);
        System.out.println(p);
        System.out.println(p.getName()); //Extracted data from Json
    }
}

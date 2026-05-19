package DeutscheBankAG;

import tools.jackson.databind.ObjectMapper;

public class Jackson_Runner_Deserialization {
    public static void main(String[] args){
        String data = "{\n" +
                "  \"name\": \"Jatin\"\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person p1 = objectMapper.readValue(data,Person.class);
        System.out.println(p1);
    }
}

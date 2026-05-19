package DeutscheBankAG;

import tools.jackson.databind.ObjectMapper;

public class Jackson_Runner_Serialization {
    public static void main(String[] args){
        //Serialize the Java object --> Jackson object
        Person p1 = new Person("Sharma");
        System.out.println(p1);

        ObjectMapper objectMapper = new ObjectMapper();
        String data = objectMapper.writeValueAsString(p1);
        System.out.println(data);
    }
}

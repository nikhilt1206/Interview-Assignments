package DeutscheBankAG;

import java.io.*;

public class Serialization_Runner {
    public static void main(String[] args) {
        //Java object
        Person p1 = new Person("Nikhil");
        System.out.println(p1);

        //Java object needs to be serialized
        File serializedData = new File("person.ser");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(serializedData);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p1); //Serialization in Java
            //Nikhil's data will be returned in the file person.ser
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

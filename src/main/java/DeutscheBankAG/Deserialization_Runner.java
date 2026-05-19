package DeutscheBankAG;

import java.io.*;

public class Deserialization_Runner {
    public static void main(String[] args) {

        File myfile = new File("person.ser");
        //There is byte stream present in the 'person.ser' file & we have to convert it into Java Object (Read it)

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Person p1=null;
        try {
            fis = new FileInputStream(myfile);
            ois = new ObjectInputStream(fis);
            p1 = (Person)ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        System.out.println("Data"+ p1);
    }
}

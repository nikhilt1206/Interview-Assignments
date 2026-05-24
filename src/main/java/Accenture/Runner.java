package Accenture;

public class Runner {
    public static void main(String[] args){

        //Since DB Connector class is not Singleton Class so 2 objects will be created (different hash codes)
        DBConnector db1 = DBConnector.createInstance();
        System.out.println(db1);

        DBConnector db2 = DBConnector.createInstance();
        System.out.println(db2);
        //Here we are trying to create instance, no matter how many times we call createInstance() method
        //It will always give us only one object reference (same hash code) - Singleton Class
    }
}

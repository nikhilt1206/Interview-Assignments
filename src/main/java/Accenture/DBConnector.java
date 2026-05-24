package Accenture;

//We will make this class as Singleton class - one object for entire application
public class DBConnector {

    private static DBConnector db;
    //Private constructor - Singleton Class/Builder Design Pattern
    //We cannot create object outside the class. It can be created within the class
    private DBConnector(){
        System.out.println("DB Connector");
    }

    public static DBConnector createInstance(){
        if(db==null){
            //Thread Safety - ONE THREAD AT A TIME
            synchronized (DBConnector.class){
                if(db==null){
                    db = new DBConnector();
                }
            }
        }
        return db;
    }
}

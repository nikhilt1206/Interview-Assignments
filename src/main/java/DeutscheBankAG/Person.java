package DeutscheBankAG;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

//POJO Class
public class Person implements Serializable {
    private static final long serialVersionUID=1L;
    //@JsonProperty("full_name")
    private String name;

    public Person(){

    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

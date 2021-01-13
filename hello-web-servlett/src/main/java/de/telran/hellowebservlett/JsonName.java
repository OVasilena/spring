package de.telran.hellowebservlett;

public class JsonName {
    public String token;
    public String secondToken;

    //DTO Data transfer Object
    public JsonName(String string) {
        token = string;
        secondToken = string;
    }

    public JsonName() {}
}

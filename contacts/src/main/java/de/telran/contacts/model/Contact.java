package de.telran.contacts.model;

public class Contact {
    private int id;
    private String name;
    private String lastName;
    private int age;

    public Contact(){}

    public Contact(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Contact(int id,String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

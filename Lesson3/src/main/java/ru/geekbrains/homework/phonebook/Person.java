package ru.geekbrains.homework.phonebook;


public class Person {
    private String name;
    private String email;
    private String phonenumber;

    public Person(String name,String email,String phonenumber){
        this.phonenumber = phonenumber;
        this.email= email;
        this.name= name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


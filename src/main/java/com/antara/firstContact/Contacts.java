package com.antara.firstContact;

public class Contacts {
    String name;
    String surname;
    String number;

    Contacts(String name,String surname,String number){
        this.name=name;
        this.number=number;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

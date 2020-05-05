package com.antara.firstContact;

public class Contact {
    String name;
    String surname;
    String number;

    Contact(String name, String surname, String number){
        this.name=name;
        this.number=number;
        this.surname=surname;
    }

    @Override
    public String toString() {
        return
                 name + ',' +
                surname + ',' +
                number
                ;
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

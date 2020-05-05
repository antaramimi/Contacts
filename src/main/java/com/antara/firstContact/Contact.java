package com.antara.firstContact;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if(isNumberValid(number)){
            this.number = number;
        }else {
            this.number="[no number]";
        }
    }

    public static boolean isNumberValid(String phoneNumber){
        if (phoneNumber.matches("[a-zA-z]+")) {
            return false;
        }
        else if (phoneNumber.length() > 10) {
            return false;
        }

        else if (phoneNumber.startsWith("1")){
            return false;
        }
        return true;
    }
}

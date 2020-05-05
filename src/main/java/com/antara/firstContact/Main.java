package com.antara.firstContact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    ArrayList<Contacts> userContacts = new ArrayList<>();


    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
        main.createContactRecord();

    }

    public void createContactRecord() {
        System.out.println("Enter the name of the person:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the surname of the person:");
        String surname = scanner.nextLine();
        System.out.println("Enter the number:");
        String number = scanner.nextLine();
        Contacts contacts = new Contacts(name, surname, number);
        userContacts.add(contacts);
        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }

    public void showMenu() {
        int option;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter action");
            System.out.println("1: add");
            System.out.println("2: count");
            System.out.println("3: list");
            System.out.println("4: edit");
            System.out.println("5: remove");
            System.out.println("6: Exit");


            option = Integer.valueOf(sc.nextLine());
            switch (option) {
                case 1:
                    createContactRecord();
                    break;
                case 2:
                    int size = userContacts.size();
                    System.out.println("Size: " + size);
                    if (size == 0) {
                        System.out.println("The Phone Book has 0 records.");
                    }
                    break;
                case 3:
                    for(int i=0;i<userContacts.size();i++) {
                        System.out.println(i+":"+ "" +userContacts.get(i));
                    }
                    break;

            }

        }


    }
}



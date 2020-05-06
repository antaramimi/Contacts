package com.antara.firstContact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> userContacts = new ArrayList<>();
    int size = userContacts.size();
    int counter=userContacts.size();


    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();

    }

    public void createContactRecord() {
        System.out.println("Enter the name of the person:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the surname of the person:");
        String surname = scanner.nextLine();
        System.out.println("Enter the number:");
        String number = scanner.nextLine();
        if(!Contact.isNumberValid(number)){
            System.out.println("Wrong number format!\n");
        }
        Contact contact = new Contact(name, surname, number);
        userContacts.add(contact);
        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }

    public void userList() {
        for (int i = 0; i < userContacts.size(); i++) {
            String userlist = i+1 + "." + " " + userContacts.get(i);
            System.out.println(userlist);
        }
    }

    public void showMenu() {
        String option;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter action");
            System.out.println("add");
            System.out.println("count");
            System.out.println("list");
            System.out.println("edit");
            System.out.println("remove");
            System.out.println("exit");


            option = String.valueOf(sc.nextLine());
            switch (option) {
                case "add":
                    createContactRecord();
                    break;
                case "count":
                    //int size = userContacts.size();
                    //System.out.println("Size: " + size);
                    if (size < 0) {
                        System.out.println("The Phone Book has 0 records.");
                    }else {
                            int counter=userContacts.size();
                            System.out.println("The Phone Book has " + counter + " "+"records.");

                    }
                    break;
                case "list":
                    userList();
                    break;
                case "edit":
                    //int size = userContacts.size();
                    System.out.println("Size: " + size);
                    if (size < 0) {
                        System.out.println("No records to edit!");
                    }else{
                    userList();
                    System.out.println("Select a record ");
                    int record = sc.nextInt();
                    Contact contact = userContacts.get(record);
                    System.out.println("Select a field (name, surname, number): ");
                    String userInput = sc.next();

                    if (userInput.equalsIgnoreCase("name")) {
                        System.out.println("Enter the name ");
                        String name = sc.next();
                        contact.setName(name);
                        System.out.println("The record updated!");
                    } else if (userInput.equalsIgnoreCase("surname")) {
                        String surname = sc.next();
                        contact.setName(surname);
                        System.out.println("The record updated!");
                    } else {
                        System.out.println("Enter the number ");
                        String number = sc.next();
                        if(!Contact.isNumberValid(number)){
                            return;
                        }
                        contact.setNumber(number);
                        System.out.println("The record updated!");
                    }}
                    break;
                case "remove":
                    System.out.println("Size: " + size);
                    if (size < 0) {
                        System.out.println("No records to edit!");
                    }else {
                        userList();
                        System.out.println("Select a record ");
                        int recordForDelete = sc.nextInt();
                        Contact contactForDelete = userContacts.get(recordForDelete);
                        userContacts.remove(contactForDelete);
                        System.out.println("The record removed!");
                    }
                    break;
                case "exit":
                    System.exit(0);

            }
        }


    }

}







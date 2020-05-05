package com.antara.firstContact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Contact> userContacts = new ArrayList<>();


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
        Contact contact = new Contact(name, surname, number);
        userContacts.add(contact);
        System.out.println("A record created!");
        System.out.println("A Phone Book with a single record created!");
    }

    public void userList() {
        for (int i = 0; i < userContacts.size(); i++) {
            String userlist = i + ":" + "" + userContacts.get(i);
            System.out.println(userlist);
        }
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
                    userList();
                    break;
                case 4:
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
                    }else if (userInput.equalsIgnoreCase("surname")) {
                        String surname = sc.next();
                        contact.setName(surname);
                        System.out.println("The record updated!");
                    } else {
                        System.out.println("Enter the number ");
                        String number = sc.next();
                        contact.setNumber(number);
                        System.out.println("The record updated!");
                    }

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);

            }
            }


        }

    }







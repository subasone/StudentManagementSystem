/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class StudentDAOImpl {

    String[] names = new String[10];
    int counter = 0;
    Scanner input;

    public StudentDAOImpl(Scanner input) {
        this.input = input;
    }

    public void menu() {
        System.out.println("Welcome To Student Management System");
        System.out.println("1. Add");
        System.out.println("2. Show All");
        System.out.println("3. Search");
        System.out.println("4. Delete");
        System.out.println("5. Exit");

        System.out.println("Enter your choice [1-5]");
    }

    public void addStudents() {
        while (true) {
            System.out.println("Add");
            System.out.println("Enter name to add: ");
            names[counter] = input.next();
            counter++;
            System.out.println("Do you add again[Y/N]");

            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showAll() {
        System.out.println("Show All");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }
    }

    public void search() {
        while (true) {
            System.out.println("Search");
            boolean found = false;
            System.out.println("Enter text to search: ");
            String name = input.next();
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null && names[i].contains(name)) {
                    System.out.println(names[i]);
                    found = true;

                }

            }
            if (!found) {
                System.out.println("Not found");
            }
            System.out.println("Do you want to search again?[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    public void delete() {
        System.out.println("Delete");
        showAll();
        System.out.println("Do you want to delete this name: ");
        String name = input.next();
        //int counter1 = 0;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                names[i] = null;
                counter--;
               // counter1 = 1;
                break;

            }
        }
    }
     public void controller(){
                 while (true) {
            menu();
            
            int choice = input.nextInt();

            if (choice == 1) {
                addStudents();

            } else if (choice == 2) {
                showAll();

            } else if (choice == 3) {
                  search();

            } else if (choice == 4) {
                 delete();

            } else {
                System.exit(0);
            }

        }
     }
}

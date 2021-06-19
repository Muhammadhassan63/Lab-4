package lab2;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        {
            AddressBook ab = new AddressBook();
            Address Address1 = new Address("Hassan", "Amber", "0345620897", "Karachi");
            Address Address2 = new Address("Junaid", "Khan", "0345678907", "Lahore");
            Address Address3 = new Address("Amir", "Ali", "0345667890", "Faislabad");
            Address Address4 = new Address("Abdul", "Rafay", "0345889889", "Multan");
            Address Address5 = new Address("Farzeen", "Khan", "03452467354", "Islamabad");
            Address Address6 = new Address("Waqar", "Chaudhry", "0333674387", "Larkana");
            Address Address7 = new Address("Rohail", "Nazir", "0333687657", "WahCantt");
            Address Address8 = new Address("Arsalan", "Zubair", "03338899640", "Rawalpindi");
            Address Address9 = new Address("Jawad", "Ahmed", "03339876268", "Kohat");
            Address Address10 = new Address("Seher", "Khan", "0333556839", "Karachi");

            ab.addContact(Address1);
            ab.addContact(Address2);
            ab.addContact(Address3);
            ab.addContact(Address4);
            ab.addContact(Address5);
            ab.addContact(Address6);
            ab.addContact(Address7);
            ab.addContact(Address8);
            ab.addContact(Address9);
            ab.addContact(Address10);

            //File Handling (Read/Write)

            int i = 1;
            Scanner input = new Scanner(System.in);
            while (i != 0) {
                String firstname;
                String lastname;
                String phonenumber;
                String address;
                int choice = 0;
                System.out.println("        WELCOME TO  REAL LIFE ADDRESS BOOK\n");
                System.out.println("Please Select Any of The Following Option");
                System.out.println("1.Enter new contact\n2.Search contact\n3.Update contact\n4.Delete contact\n5.Display");
                choice = input.nextInt();
                switch (choice) {
                    //Adding a Contact
                    case 1:
                        System.out.println("Please fill the following details to Add a Contact\n");
                        System.out.println("Please Enter First Name:");
                        input.nextLine();
                        firstname = input.nextLine();
                        System.out.println("Please Enter Last Name:");
                        lastname = input.nextLine();
                        System.out.println("Please Enter Phone Number:");
                        phonenumber = input.nextLine();
                        System.out.println("Please Enter Address");
                        address = input.nextLine();
                        ab.addContact(new Address(firstname, lastname, phonenumber, address));
                        System.out.println("Your Contact Has Been Added Successfully\nThankyou!!!!");
                        break;

                    //Searching a Contact
                    case 2:
                        System.out.println("Please fill the following details to Search a Contact\n");
                        System.out.println("Please Enter First Name:");
                        input.nextLine();
                        firstname = input.nextLine();
                        System.out.println("Please Enter Last Name:");
                        lastname = input.nextLine();
                        System.out.println(ab.searchContact(firstname, lastname));
                        break;

                    //Updating a Contact
                    case 3:
                        System.out.println("Please fill the following details to Update a Contact\n");
                        System.out.println("Please Enter First Name:");
                        input.nextLine();
                        firstname = input.nextLine();
                        System.out.println("Please Enter Last Name:");
                        lastname = input.nextLine();
                        System.out.println("Please Enter Phone Number:");
                        phonenumber = input.nextLine();
                        System.out.println("Please Enter Address");
                        address = input.nextLine();
                        ab.updateContact(new Address(firstname, lastname, phonenumber, address));
                        break;

                    //Deleting a Contact
                    case 4:
                        System.out.println("Please fill the following details to Delete a Contact\n");
                        input.nextLine();
                        System.out.println("Please Enter First Name:");
                        firstname = input.nextLine();
                        System.out.println("Please Enter Last Name:");
                        lastname = input.nextLine();
                        System.out.println("Please Enter Phone Number:");
                        phonenumber = input.nextLine();
                        System.out.println("Please Enter Address");
                        address = input.nextLine();
                        System.out.println("Your Contact Has Been Deleted Successfully\nThankyou!!!!!");
                        Address d = new Address(firstname, lastname, phonenumber, address);
                        ab.deleteContact(d);
                        break;

                    //Displaying a Address Book
                    case 5:
                        ab.display();
                        break;
                    default:
                        break;
                }
                System.out.println("Press 1 to Continue OR Press 0 to Exit");
                i = input.nextInt();
            }
        }


        }

    }

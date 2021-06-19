package lab2;

import java.io.*;
public class Address implements Serializable
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Address(String firstName, String lastName, String phonenumber, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phonenumber;
        this.address = address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Firstname: " + firstName + "\nLastname: " + lastName + "\nPhonenumber: " + phoneNumber + "\nAddress: " + address;
    }



}
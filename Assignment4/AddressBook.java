package lab2;

import java.io.*;
public class AddressBook implements Serializable
{
    private Address[] contact;


    public AddressBook()
    {
        this.contact = new Address[1];
    }




    public void addContact(Address address) throws Exception
    {
        if(contact[0]==null)
        {
            contact[contact.length-1] = address;
        }
        else
        {
            extend();
            contact[contact.length-1] = address;
        }
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);
        }
        oos.close();
    }



    private void extend()
    {
        Address[] temp = new Address[contact.length];
        temp=contact;
        contact = new Address[contact.length+1];

        for(int i=0; i<temp.length; i++)
        {
            contact[i]= temp[i];
        }
    }



    public Address searchContact(String firstName,String lastName) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(int i=0; i<contact.length; i++)
        {
            Address b = (Address)ois.readObject();
            if(b.getFirstName().equals(firstName)&&(b.getLastName().equals(lastName)))
            {
                return b;
            }
        }
        return null;
    }



    public void updateContact(Address address) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);


        for(int i=0; i<contact.length; i++)
        {
            if(contact[i].getFirstName()==address.getFirstName())
            {
                contact[i]=address;
            }
        }
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);
        }
        oos.close();
    }



    public void deleteContact(Address address) throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(int i=0; i<contact.length; i++)
        {
            Address b = (Address)ois.readObject();
            if(address.getFirstName().equals(b.getFirstName())&& address.getLastName().equals(b.getLastName()))
            {
                Address[] temp = contact;
                contact = new Address[temp.length-1];
                for(int j=0,k=0; j<contact.length; j++, k++)
                {
                    if(k==i)
                    {
                        k++;
                    }
                    contact[j] = temp[k];
                }
            }
        }
        FileOutputStream fos = new FileOutputStream("Address Book");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(int i=0; i<contact.length; i++)
        {
            oos.writeObject(contact[i]);
        }
        oos.close();
    }



    public void display() throws Exception
    {
        FileInputStream fis = new FileInputStream("Address Book");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try
        {
            while(true)
            {
                Address b = (Address)ois.readObject();
                System.out.println(b+"\n");
            }
        }
        catch(Exception e)
        {
        }

        ois.close();
    }
}

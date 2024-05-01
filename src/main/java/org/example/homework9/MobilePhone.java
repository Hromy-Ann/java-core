package org.example.homework9;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    List<Contact> myContacts;
    String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contactToAdd) {
        if (findContact(contactToAdd) >= 0) {
            return false;
        }
        myContacts.add(contactToAdd);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact);
        if (contactIndex < 0) {
            return false;
        }
        myContacts.set(contactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contactToRemove) {
        return myContacts.remove(contactToRemove);
    }

    public int findContact(Contact contactToFind) {
        return myContacts.indexOf(contactToFind);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact);
        }
    }
}

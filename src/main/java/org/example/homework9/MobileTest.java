package org.example.homework9;

public class MobileTest {
    public static void main(String[] args) {
        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");
        Contact tom = new Contact("Tom", "11235813");
        Contact jane = new Contact("Jane", "23571113");
        Contact basil = new Contact("Basil", "235799993");
        MobilePhone phone = new MobilePhone("09388551");
        boolean bobAdded = phone.addNewContact(bob);
        boolean bobAddedTwice = phone.addNewContact(bob);
        boolean aliceRemovedBeforeAdded = phone.removeContact(alice);
        boolean aliceAdded = phone.addNewContact(alice);
        boolean basilAdded = phone.addNewContact(basil);
        boolean updatedBasilToTom = phone.updateContact(basil, tom);
        phone.addNewContact(jane);
        phone.printContacts();
        int basilIndex = phone.findContact("Basil");
        Contact janeQueried = phone.queryContact("Jane");
        int aliceIndex = phone.findContact(alice);
        boolean bobRemoved = phone.removeContact(bob);
        boolean basilRemoved = phone.removeContact(basil);

        System.out.println("bobAdded = " + bobAdded);
        System.out.println("bobAddedTwice = " + bobAddedTwice);
        System.out.println("aliceRemovedBeforeAdded = " + aliceRemovedBeforeAdded);
        System.out.println("aliceAdded = " + aliceAdded);
        System.out.println("basilAdded = " + basilAdded);
        System.out.println("updatedBasilToTom = " + updatedBasilToTom);
        System.out.println("basilIndex = " + basilIndex);
        System.out.println("janeQueried = " + janeQueried);
        System.out.println("aliceIndex = " + aliceIndex);
        System.out.println("bobRemoved = " + bobRemoved);
        System.out.println("basilRemoved = " + basilRemoved);
    }
}

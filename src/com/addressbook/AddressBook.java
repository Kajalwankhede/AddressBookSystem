//UC 1-- Ability to create a Contacts in AddressBook with first and last names, address,city, state, zip, phone number andemail...
//UC 2-- Ability to add a new Contact to Address Book - Use Console to add person details from
//UC 3-- Ability to edit existing contact person using their name
//UC 4--Ability to delete a person using person's name

package com.addressbook;
public class AddressBook {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private int phoneNumber;
    private String email;

    AddressBook(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String email) {//Declaring instance variable using constructor

        this.firstName = firstName;// initialize instance variable
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    // For accessing the private variables

    public String getFirstName() {
        return firstName;

    }

    public String getlastName() {
        return lastName;

    }

    public String getAddress() {
        return address;

    }

    public String getcity() {
        return city;

    }

    public String getState() {
        return state;

    }

    public int getZip() {
        return zip;

    }

    public int getPhoneNumber() {
        return phoneNumber;

    }

    public String getEmail() {
        return email;

    }

    @Override
    public String toString() {// Override method
        return " First Name: " + firstName + " Last Name: " + lastName + " Address: " + address + " City: " + city + " State: " + state + " Zip: " + zip + " Phone Number: " + phoneNumber + " Email:" + email;

    }


}


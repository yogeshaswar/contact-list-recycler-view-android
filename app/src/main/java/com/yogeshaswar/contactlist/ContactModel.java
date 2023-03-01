package com.yogeshaswar.contactlist;
//Structure Class
public class ContactModel {
    //declare all variables required for contact_card
    int contactImg;
    String contactName, contactNumber;

    //constructor
    public ContactModel(int contactImg, String contactName, String contactNumber) {
        this.contactImg = contactImg;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }
}

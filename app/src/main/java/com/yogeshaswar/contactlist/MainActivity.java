package com.yogeshaswar.contactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //Data-save
    ArrayList<ContactModel> contactList;
    //Adapter
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init
        recyclerView = findViewById(R.id.recycler_contact);
        //set layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //create layout -> card layout to show contact
        //create model/structure class
        //declare array -> data
        contactList = new ArrayList<ContactModel>(); //empty list
        //add data to arrayList
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Aman", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Raman", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Ram", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Shyam", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Kalyan", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Suman", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Amol", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Akshay", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Mahesh", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Raj", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Suman", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Amol", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Akshay", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Mahesh", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Raj", "9823476400"));
        contactList.add(new ContactModel(R.drawable.img_holder_foreground, "Rajendra", "9823476400"));

        //Adapter
        contactAdapter = new ContactAdapter(contactList, this);
        //set adapter on recycler view
        recyclerView.setAdapter(contactAdapter);


    }
}
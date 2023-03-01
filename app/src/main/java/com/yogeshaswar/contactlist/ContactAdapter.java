package com.yogeshaswar.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder>{
    //constructor
    ArrayList<ContactModel> contactList;
    Context context;

    public ContactAdapter(ArrayList<ContactModel> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_card, parent, false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.contactImg.setImageResource(contactList.get(position).contactImg);
        holder.contactName.setText(contactList.get(position).contactName);
        holder.contactNumber.setText(contactList.get(position).contactNumber);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    //innerClass
    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView contactName, contactNumber;
        ImageView contactImg;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            contactImg = itemView.findViewById(R.id.contact_image);
            contactName = itemView.findViewById(R.id.tv_contact_name);
            contactNumber = itemView.findViewById(R.id.tv_contact_num);

        }
    }
}

package com.example.sohel.customlistview2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by sohel on 2/7/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Context context, int resource, List<Contact> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.show_item_list,parent,false);
        }

        ImageView profileImgView = (ImageView)convertView.findViewById(R.id.list_item_image);
        TextView nameTextView = (TextView)convertView.findViewById(R.id.list_item_name);
        TextView cellTextView = (TextView)convertView.findViewById(R.id.list_item_cell);


        Contact currentContact = getItem(position);

        profileImgView.setImageResource(currentContact.getmImage());
        nameTextView.setText(currentContact.getmName());
        cellTextView.setText(currentContact.getmCell()+ "");

        return convertView;
    }
}

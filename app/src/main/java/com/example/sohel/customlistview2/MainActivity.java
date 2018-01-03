package com.example.sohel.customlistview2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView contactListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListView = (ListView)findViewById(R.id.contact_list_view);

        final ArrayList<Contact> contactList = new ArrayList();

        contactList.add(new Contact(R.drawable.sohel,"Sohel Rana","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.afirul,"Afirul Islam","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.anower,"Anower Hossain","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.maya,"Tajbina Akter Maya","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.rohan,"Rohan Islam","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.sohel2,"Mithon Islam","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.sojol,"Sojol Ahmed","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.tarik,"Tarikul Islam","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));
        contactList.add(new Contact(R.drawable.tisha,"Tamanna Akter Tisha","+881773544075","sohel.cse37@gmail.com","26/9,sher-shah-suri road"));

        ContactAdapter adapter = new ContactAdapter(this,R.layout.show_item_list,contactList);
        contactListView.setAdapter(adapter);

        contactListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {

                Contact value = (Contact) adapter.getItemAtPosition(position);

                Intent intent = new Intent(getApplicationContext(),ContactDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("imageID",value.getmImage()+ "");
                bundle.putString("name",value.getmName());
                bundle.putString("phoneNo",value.getmCell());
                bundle.putString("email",value.getmEmail());
                bundle.putString("address",value.getmAddress());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}

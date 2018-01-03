package com.example.sohel.customlistview2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ContactDetailsActivity extends AppCompatActivity {

    ImageView contactImage;
    TextView nameTextView,cellTextView,emailTextView,addTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        contactImage = (ImageView)findViewById(R.id.contact_image_view);
        nameTextView = (TextView)findViewById(R.id.name_text_view);
        cellTextView = (TextView)findViewById(R.id.cell_text_view);
        emailTextView = (TextView)findViewById(R.id.email_text_view);
        addTextView = (TextView)findViewById(R.id.add_text_view);

        final Bundle bundle = getIntent().getExtras();

        contactImage.setImageResource(Integer.parseInt(bundle.getString("imageID")));
        nameTextView.setText(bundle.getString("phoneNo"));
        cellTextView.setText(bundle.getString("name"));
        emailTextView.setText(bundle.getString("email"));
        addTextView.setText(bundle.getString("address"));
    }
}

package com.example.cryptocoins;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class SettingsArea extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        setTitle("Settings Area");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_area);

        final Button walletIDLink = (Button) findViewById(R.id.walletID);

        walletIDLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iDIntent = new Intent(SettingsArea.this, Pop.class);
                SettingsArea.this.startActivity(iDIntent);
            }
        });


    }
}

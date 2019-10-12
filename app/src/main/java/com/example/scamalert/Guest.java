package com.example.scamalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Guest extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        button = (Button) findViewById(R.id.buttonGuest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuest();
            }
        });
    }

        public void openGuest() {

            Intent intent = new Intent(this, Guest.class);
            startActivity(intent);



        }
}

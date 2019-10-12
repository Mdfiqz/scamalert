package com.example.scamalert;

import androidx.appcompat.app.AppCompatActivity;
import com.example.scamalert.MainActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
        public void openMainActivity () {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }

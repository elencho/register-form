package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onBtnClick (View view) {
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastname = findViewById(R.id.txtLastname);
        TextView txtEmail = findViewById(R.id.txtEmail);


        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextLastname = findViewById(R.id.editTextLastname);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        txtName.setText("Your name is: " +editTextName.getText().toString());
        txtLastname.setText("Your lastname is: " +editTextLastname.getText().toString());
        txtEmail.setText("Your email is: " +editTextEmail.getText().toString());


    }
}
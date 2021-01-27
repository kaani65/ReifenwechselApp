package com.example.reifenwechselapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegisterUser extends AppCompatActivity {


     EditText regPlz,regVorname,regStrasse,regStadt,regEmail,regAuto,regModell,regNachname;
     Button buttonBuchen;
     CheckBox checkBoxUnterbodenschutz,checkBoxAuswuchten,checkBoxFrühjahrcheck;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
     //   TextView = textViewKalender

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        TextView textView = (TextView) findViewById(R.id.textViewKalender);

        textView.setText(date);

        regVorname = findViewById(R.id.editTextVorname);
        regNachname = findViewById(R.id.editTextTextNachname);
        regStrasse = findViewById(R.id.editTextStrasse);
        regPlz = findViewById(R.id.editTextPlz);
        regStadt = findViewById(R.id.editTextStadt);
        regEmail = findViewById(R.id.editTextAuto);
        regAuto = findViewById(R.id.editTextAuto);
        regModell = findViewById(R.id.editTextModell);

        buttonBuchen = findViewById(R.id.buttonBuchen);
        buttonBuchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Termin");

                //get all the Values
                String vorname = regVorname.getText().toString();
                String nachname =regNachname.getText().toString();
                String strasse =regStrasse.getText().toString();
                String plz =regPlz.getText().toString();
                String stadt =regStadt.getText().toString();
                String email =regEmail.getText().toString();
                String auto =regAuto.getText().toString();
                String modell =regModell.getText().toString();

                UserHelperClass helperClass = new UserHelperClass(vorname,nachname,strasse,plz,stadt,email,modell,auto);

                reference.child(date).setValue(vorname + " "+ nachname + " "+ stadt + " "+ email + " " + modell + " " + auto );
            }
        });
    }




}
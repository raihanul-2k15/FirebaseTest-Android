package com.raihanul.firebasetest;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private EditText edtData;
    private Button btnSave;
    private Button btnShow;
    private TextView txtData;
    private DatabaseReference dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtData = (EditText) findViewById(R.id.edtData);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnShow = (Button) findViewById(R.id.btnShow);
        txtData= (TextView) findViewById(R.id.txtData);
        dr = FirebaseDatabase.getInstance().getReference();

        btnSave.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                dr.child("name").setValue("Raihanul");
            }
        });

    }
}

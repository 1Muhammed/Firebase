package com.example.vektorel.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtyazismalar;
    EditText mesaj;
    Button btngonder;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btngonder.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gonder();
        }
    });


    }
    public void gonder(){

        String gonderilecekmesaj = mesaj.getText().toString();



    }

}

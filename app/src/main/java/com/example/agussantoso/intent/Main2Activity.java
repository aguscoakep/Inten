package com.example.agussantoso.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.nama2);
        TextView email = (TextView) findViewById(R.id.email2);
        TextView nomor = (TextView) findViewById(R.id.nomor2);
        //menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        email.setText(b.getCharSequence("email"));
        nomor.setText(b.getCharSequence("nomor"));

    }
}

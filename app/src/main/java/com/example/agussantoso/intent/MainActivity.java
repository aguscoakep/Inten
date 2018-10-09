package com.example.agussantoso.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements OnClickListener  {
    Button button;
    EditText nama;
    EditText email;
    EditText nomor;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menampilkan semua tampilan id
        findAllViewsId();

        button.setOnClickListener(this);

    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.kirimData);
        nama = (EditText) findViewById(R.id.nama);
        email = (EditText) findViewById(R.id.email);
        nomor = (EditText) findViewById(R.id.nomor);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        //Membuat obyek bundle
        Bundle b = new Bundle();

        //Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("email", email.getText().toString());
        b.putString("nomor", nomor.getText().toString());


        //Menambahkan bundle intent
        intent.putExtras(b);

        //memulai Activity kedua
        startActivity(intent);
    }
}

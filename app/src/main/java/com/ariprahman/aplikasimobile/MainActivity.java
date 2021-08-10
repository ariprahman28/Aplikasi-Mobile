package com.ariprahman.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//deklarasi variabel
EditText TextNama;
TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variable berdasarkan id
        TextNama=(EditText) findViewById(R.id.TxtNama);
        Hasil=(TextView) findViewById(R.id.Lbl_Name);
    }

//method onclick
public void TampilNama(View v){
        Hasil.setText("Nama Anda"+TextNama.getText());
}

}
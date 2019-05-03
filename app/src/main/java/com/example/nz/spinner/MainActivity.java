package com.example.nz.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button button;
    String [] countryName ;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.button);

        countryName =getResources().getStringArray(R.array.contryName);
        adapter = new ArrayAdapter<String>(this,R.layout.custom_layout,R.id.textView,countryName);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


             String name = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });





    }
}

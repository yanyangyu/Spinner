package com.example.user.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    String [] fruit =new String[]{"香蕉","蘋果","鳳梨"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        textView = (TextView)findViewById(R.id.textView);

        ArrayAdapter <String>  adapterFruit = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,fruit);
        adapterFruit.setDropDownViewResource(android.R.layout.simple_spinner_item);   //建造好一個spinner
        spinner.setAdapter(adapterFruit);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }
}

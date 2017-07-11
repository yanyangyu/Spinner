package com.example.user.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    CheckBox checkBox;
    String [] fruit =new String[]{"香蕉","蘋果","鳳梨"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        textView = (TextView)findViewById(R.id.textView);
        checkBox = (CheckBox)findViewById(R.id.checkBox);

        ArrayAdapter <String>  adapterFruit = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,fruit);
        adapterFruit.setDropDownViewResource(android.R.layout.simple_spinner_item);   //建造好一個spinner
        spinner.setAdapter(adapterFruit);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // spinner 選取監聽
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(parent.getSelectedItem().toString()); //驗證選項內容被選取
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // 設置一個checkbox  並確認他是否有選取
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "已選取", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this, "未選取", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}

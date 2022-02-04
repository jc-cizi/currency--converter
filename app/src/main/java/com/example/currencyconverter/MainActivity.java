package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.link1);

        EditText inputttusd = findViewById(R.id.inputusd);
        EditText inputttlbp = findViewById(R.id.inputlbp);
        Button convert = findViewById(R.id.convertbutt);
    }
        public void firstbutt (View v){
            TextView text=findViewById(R.id.link1);
            EditText lebanese= findViewById(R.id.inputlbp);
            String txtlebanese=lebanese.getText().toString();
            text.setText(String.valueOf(Float.parseFloat(txtlebanese)/22000));

        }
    public void secondbutt (View v){
        TextView text2 =findViewById(R.id.link2);
        EditText dollar= findViewById(R.id.inputusd);
        String txtdollar=dollar.getText().toString();
        text2.setText(String.valueOf(Float.parseFloat(txtdollar)*22000));

    }


}

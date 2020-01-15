package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button counter;
    Button counter2;
    TextView countlabel;
    int amount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countlabel= (TextView)findViewById(R.id.count);
        counter= (Button) findViewById(R.id.counter);
        counter2 = (Button) findViewById(R.id.counter2);
    }

public void countAmount(View view){
        countlabel.setText(String.valueOf(++amount));
    }

    public void subtractAmount(View view){
        countlabel.setText(String.valueOf(--amount));
    }


}

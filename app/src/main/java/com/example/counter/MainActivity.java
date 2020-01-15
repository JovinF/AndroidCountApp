package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button counter;
    Button counter2;
    Button share;
    TextView countlabel;
    int amount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countlabel= (TextView)findViewById(R.id.count);
        counter= (Button) findViewById(R.id.counter);
        counter2 = (Button) findViewById(R.id.counter2);
        share = (Button) findViewById(R.id.share);


    }

public void countAmount(View view){
        countlabel.setText(String.valueOf(++amount));
    }

    public void subtractAmount(View view){
        countlabel.setText(String.valueOf(--amount));
    }

public void shareResult(View view){
    Intent sendIntent = new Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, countlabel.getText());
    sendIntent.setType("text/plain");

    Intent shareIntent = Intent.createChooser(sendIntent, null);
    startActivity(shareIntent);
}


}

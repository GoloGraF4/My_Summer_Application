package com.example.mysummerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonStart = (Button)findViewById(R.id.buttonReg);
        buttonStart.setOnClickListener(this);
        Button buttonEnter = (Button)findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View reg) {
        Intent i;
        i=new Intent(this,Registration.class);
        startActivity(i);
    }
    public void onClickEnter(View ent){
        Intent e;
        e=new Intent(this,Enter.class);
        startActivity(e);
    }
}

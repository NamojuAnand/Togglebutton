package com.example.ideabytes.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ToggleButton t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click();
    }

    public  void click(){
        b1=findViewById(R.id.button);
        t1=findViewById(R.id.toggle1);
        t2=findViewById(R.id.toggle2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("ToggleButton1: ").append(t1.getText());
                result.append("\nToggleButton2: ").append(t2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

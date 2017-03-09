package com.mobile.lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText age1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        btn1 = (Button) findViewById(R.id.btn_calcAge);
        age1 = (EditText) findViewById(R.id.age);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "당신의 나이는 " + (2017 - Integer.parseInt(age1.getText().toString()) + 1) + "입니다", Toast.LENGTH_SHORT).show();
            }
        });


    }
}

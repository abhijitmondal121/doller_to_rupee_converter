package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextTextPersonName);
        button2=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi click listner worked!", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                int dol = Integer.parseInt(s);
                double rs= 72.79 * dol;
                textview.setText("rs: "+rs);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi clear listner worked!", Toast.LENGTH_SHORT).show();
                textview.setText(" ");
                editText.setText(" ");
            }
        });
    }
}
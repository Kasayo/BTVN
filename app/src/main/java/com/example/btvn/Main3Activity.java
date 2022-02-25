package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText edt1,edt2;
    Button bt1,bt2,bt3,bt4;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edt1 =findViewById(R.id.edt1);
        edt2 =findViewById(R.id.edt2);
        tv2 =findViewById(R.id.tv2);
        bt1 =findViewById(R.id.bt1);
        bt2 =findViewById(R.id.bt2);
        bt3 =findViewById(R.id.bt3);
        bt4 =findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String so1 = edt1.getText().toString();
                String so2 = edt2.getText().toString();
                double a = Double.parseDouble(so1);
                double b = Double.parseDouble(so2);
                double c;
                c = a+b;
                tv2.setText(c+"");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String so1 = edt1.getText().toString();
                String so2 = edt2.getText().toString();
                double a = Double.parseDouble(so1);
                double b = Double.parseDouble(so2);
                double c;
                c = a - b;
                tv2.setText(c+"");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String so1 = edt1.getText().toString();
                String so2 = edt2.getText().toString();
                double a = Double.parseDouble(so1);
                double b = Double.parseDouble(so2);
                double c;
                c = a * b;
                tv2.setText(c+"");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String so1 = edt1.getText().toString();
                String so2 = edt2.getText().toString();
                double a = Double.parseDouble(so1);
                double b = Double.parseDouble(so2);
                double c;
                c = a / b;
                if(b==0)
                    Toast.makeText(Main3Activity.this,"Math Error", Toast.LENGTH_LONG).show();
                else
                    tv2.setText(c+"");
            }
        });
    }
}

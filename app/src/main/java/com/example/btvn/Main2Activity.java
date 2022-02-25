package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText edt1,edt2,edt3,edt4,edt5;
    Button button;
    TextView tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv3 =findViewById(R.id.tv3);
        tv4 =findViewById(R.id.tv4);
        tv5 =findViewById(R.id.tv5);
        tv6 =findViewById(R.id.tv6);
        edt1 =findViewById(R.id.edt1);
        edt2 =findViewById(R.id.edt2);
        edt3 =findViewById(R.id.edt3);
        edt4 =findViewById(R.id.edt4);
        edt5 =findViewById(R.id.edt5);
        button =findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sdt = edt1.getText().toString();
                String email = edt2.getText().toString();
                String name = edt3.getText().toString();
                String coquan = edt4.getText().toString();
                String pass = edt5.getText().toString();

                if(sdt.isEmpty() || sdt.length() <10){
                    Toast.makeText(Main2Activity.this,"Số điện thoại chưa đúng",Toast.LENGTH_LONG).show();}

                else {
                    if (email.isEmpty()) {
                        tv3.setText("Email khong dung.Vui long nhap lai");
                        edt2.setBackgroundColor(0xFFF8AEC7);
                    }
                    if (name.isEmpty()) {
                        tv4.setText("Ten cua ban khong dung.Vui long nhap lai");
                        edt3.setBackgroundColor(0xFFF8AEC7);
                    }
                    if (coquan.isEmpty()) {
                        tv5.setText("Co quan cua ban khong dung.Vui long nhap lai");
                        edt4.setBackgroundColor(0xFFF8AEC7);
                    }
                    if (pass.isEmpty()) {
                        tv6.setText("Pass cua ban khong dung.Vui long nhap lai");
                        edt5.setBackgroundColor(0xFFF8AEC7);
                    }
                }
            }

        });
    }
}
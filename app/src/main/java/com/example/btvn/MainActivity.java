package com.example.btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView  textv2;
    Button    button;
    EditText  editext1,editext2,editext3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textv2 = findViewById(R.id.tv2);
        button = findViewById(R.id.button);
        editext2 = findViewById(R.id.edt2);
        editext1 = findViewById(R.id.edt1);
        editext3 = findViewById(R.id.edt3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tk = editext1.getText().toString();
                String pass = editext2.getText().toString();
                String repass = editext3.getText().toString();


                if(tk.isEmpty()){
                    textv2.setText("Chưa nhập tài khoản");
                    editext1.requestFocus();
                    editext1.setBackgroundColor(0xFFF8AEC7);
                    return;
                }
                if(pass.isEmpty()){
                    textv2.setText("chua nhap pass");
                    editext2.setBackgroundColor(0xFFF8AEC7);


                }
                if (repass.isEmpty()){
                    textv2.setText("chua nhap lai pass");
                    editext3.setBackgroundColor(0xFFF8AEC7);
                }
                if (pass.equals(repass)==true){
                    textv2.setText("dang ky thanh cong");}
                    else{
                    textv2.setText("mat khau khong trung khop");}
                }


        });

    }
}
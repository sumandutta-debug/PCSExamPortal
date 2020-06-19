package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage48Activity extends AppCompatActivity {
Button btn_back47,btn_next48;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page48);
        btn_back47=(Button)findViewById(R.id.btn_back47);
        btn_next48=(Button)findViewById(R.id.btn_next48);

        btn_back47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back47Intent=new Intent(ExamPage48Activity.this,ExamPage47Activity.class);
                startActivity(Page1Back47Intent);
            }
        });
        btn_next48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next48Intent =new Intent(ExamPage48Activity.this,ExamPage49Activity.class);
                startActivity(Page1Next48Intent);
            }
        });
    }
}
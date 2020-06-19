package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage43Activity extends AppCompatActivity {
Button btn_back42,btn_next43;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page43);
        btn_back42=(Button)findViewById(R.id.btn_back42);
        btn_next43=(Button)findViewById(R.id.btn_next43);
        btn_back42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back42Intent=new Intent(ExamPage43Activity.this,ExamPage42Activity.class);
                startActivity(Page1Back42Intent);
            }
        });
        btn_next43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next43Intent=new Intent(ExamPage43Activity.this,ExamPage44Activity.class);
                startActivity(Page1Next43Intent);
            }
        });
    }
}
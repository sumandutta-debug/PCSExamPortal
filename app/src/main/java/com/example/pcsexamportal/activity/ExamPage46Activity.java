package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage46Activity extends AppCompatActivity {
Button btn_back45,btn_next46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page46);
        btn_back45=(Button)findViewById(R.id.btn_back45);
        btn_next46=(Button)findViewById(R.id.btn_next46);

        btn_back45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back45Intent=new Intent(ExamPage46Activity.this,ExamPage45Activity.class);
                startActivity(Page1Back45Intent);
            }
        });
        btn_next46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next46Intent =new Intent(ExamPage46Activity.this,ExamPage47Activity.class);
                startActivity(Page1Next46Intent);
            }
        });
    }
}
package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage45Activity extends AppCompatActivity {
Button btn_back44,btn_next45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page45);
        btn_back44=(Button)findViewById(R.id.btn_back44);
        btn_next45=(Button)findViewById(R.id.btn_next45);

        btn_back44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back44Intent=new Intent(ExamPage45Activity.this,ExamPage44Activity.class);
                startActivity(Page1Back44Intent);
            }
        });
        btn_next45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next45Intent =new Intent(ExamPage45Activity.this,ExamPage46Activity.class);
                startActivity(Page1Next45Intent);
            }
        });
    }
}
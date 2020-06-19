package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage42Activity extends AppCompatActivity {
Button btn_back41,btn_next42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page42);
        btn_back41=(Button)findViewById(R.id.btn_back41);
        btn_next42=(Button)findViewById(R.id.btn_next42);

        btn_back41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back41Intent =new Intent(ExamPage42Activity.this,ExamPage41Activity.class);
                startActivity(Page1Back41Intent);
            }
        });
        btn_next42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next42Intent=new Intent(ExamPage42Activity.this,ExamPage43Activity.class);
                startActivity(Page1Next42Intent);
            }
        });
    }
}
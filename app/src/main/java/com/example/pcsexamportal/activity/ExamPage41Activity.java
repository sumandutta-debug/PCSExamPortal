package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage41Activity extends AppCompatActivity {
Button btn_back40,btn_next41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page41);
        btn_back40=(Button)findViewById(R.id.btn_back40);
        btn_next41=(Button)findViewById(R.id.btn_next41);
        btn_back40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back40Intent =new Intent(ExamPage41Activity.this,ExamPage40Activity.class);
                startActivity(Page1Back40Intent);
            }
        });
        btn_next41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next41Intent=new Intent(ExamPage41Activity.this,ExamPage42Activity.class);
                startActivity(Page1Next41Intent);
            }
        });
    }
}
package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage49Activity extends AppCompatActivity {
Button btn_back48,btn_next49;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page49);
        btn_back48=(Button)findViewById(R.id.btn_back48);
        btn_next49=(Button)findViewById(R.id.btn_next49);

        btn_back48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back48Intent=new Intent(ExamPage49Activity.this,ExamPage48Activity.class);
                startActivity(Page1Back48Intent);
            }
        });
        btn_next49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next49Intent =new Intent(ExamPage49Activity.this,ExamPage50Activity.class);
                startActivity(Page1Next49Intent);
            }
        });
    }
}
package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage44Activity extends AppCompatActivity {
Button btn_back43,btn_next44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page44);
        btn_back43=(Button)findViewById(R.id.btn_back43);
        btn_next44=(Button)findViewById(R.id.btn_next44);

        btn_back43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back43Intent =new Intent(ExamPage44Activity.this,ExamPage43Activity.class);
                startActivity(Page1Back43Intent);
            }
        });
        btn_next44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next44Intent=new Intent(ExamPage44Activity.this,ExamPage45Activity.class);
                startActivity(Page1Next44Intent);
            }
        });
    }
}
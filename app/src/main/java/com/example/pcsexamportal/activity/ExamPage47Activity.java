package com.example.pcsexamportal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pcsexamportal.R;

public class ExamPage47Activity extends AppCompatActivity {
Button btn_back46,btn_next47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page47);
        btn_back46=(Button)findViewById(R.id.btn_back46);
        btn_next47=(Button)findViewById(R.id.btn_next47);

        btn_back46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Back46Intent =new Intent(ExamPage47Activity.this,ExamPage46Activity.class);
                startActivity(Page1Back46Intent);
            }
        });
        btn_next47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page1Next47Intent =new Intent(ExamPage47Activity.this,ExamPage48Activity.class);
                startActivity(Page1Next47Intent);
            }
        });

    }
}
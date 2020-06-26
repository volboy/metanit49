package com.example.metanit49;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        //Обработка нажатия кнопки
        public void sendMessage(View view) {
            TextView textView=findViewById(R.id.textView);
            EditText editText=findViewById(R.id.editText);
            textView.setText("Добро пожаловать" + editText.getText());
        }
    }


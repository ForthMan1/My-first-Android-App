package com.example.massanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMassageActivity extends AppCompatActivity {

    private TextView textViewReceivedMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_massage);
        textViewReceivedMassage = findViewById(R.id.textViewReceivedMassage); // теперь мы можем переслать ему то сообщение который переслал первый activity
        Intent intent = getIntent();
        String massage = intent.getStringExtra("massage"); // для получения данных которые были подключены к этому интенту
        textViewReceivedMassage.setText(massage); // здесь мы передали наш введенный текст который мы ранее получили.
    }
}
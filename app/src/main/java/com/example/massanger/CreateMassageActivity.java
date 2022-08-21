package com.example.massanger;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMassageActivity extends AppCompatActivity {

    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMsg = findViewById(R.id.editTextTextPersonName);
    }

    public void onClickSendMassage(View view) {
        String massage = editTextMsg.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");// устронвыливаем тип передоваемого сообщения
        intent.putExtra(Intent.EXTRA_TEXT,massage);// Теперь передаем само сообщение
        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.choosen_name));
        startActivity(chosenIntent);
    }
}
package com.tacadem.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_send) Button btnSend;
    @Bind(R.id.edit_input) EditText editInput;
    @Bind(R.id.text_message) TextView textMessage;
    @Bind(R.id.btn_google) Button btn_google;
    @Bind(R.id.btn_dial) Button btn_dial;
    @Bind(R.id.btn_toast) Button btn_toast;
    @Bind(R.id.btn_other) Button btn_other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnSend.setOnClickListener((view) -> {
            String text = editInput.getText().toString();
            textMessage.setText(text);
        });
        btn_google.setOnClickListener(view ->{
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            startActivity(intent);
        });

        btn_dial.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2257-3585"));
            startActivity(intent);
        });
        btn_toast.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this,"toast....", Toast.LENGTH_SHORT).show();
        });

        btn_other.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(intent);
        });


    }
}

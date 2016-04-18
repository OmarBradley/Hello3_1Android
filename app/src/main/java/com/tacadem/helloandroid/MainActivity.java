package com.tacadem.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_send) Button btnSend;
    @Bind(R.id.edit_input) EditText editInput;
    @Bind(R.id.text_message) TextView textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnSend.setOnClickListener((view) -> {
            String text = editInput.getText().toString();
            textMessage.setText(text);
        });

    }
}

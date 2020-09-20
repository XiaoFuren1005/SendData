package com.example.senddata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SendMessageActivity extends AppCompatActivity {

    private TextView textView;

    public String message = "successful";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        Intent intent = getIntent();
        String txt = intent.getStringExtra("Data");

        textView = findViewById(R.id.showText);

        textView.setText(txt);

        Button button = (Button)findViewById(R.id.btnReturn);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SendMessageActivity.this,MainActivity.class);
                intent.putExtra("return",message);
                startActivity(intent);
                finish();
            }
        });
    }
}

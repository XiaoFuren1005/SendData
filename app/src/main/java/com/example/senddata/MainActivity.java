package com.example.senddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "LIFTCYCLE";

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"(1)onCreate()");
        editText = findViewById(R.id.txtText);
        Button button = (Button) findViewById(R.id.btnText);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SendMessageActivity.class);
                String txt = editText.getText().toString();
                intent.putExtra("Data",txt);
                startActivity(intent);
            }
        });

        textView = findViewById(R.id.getReturn);
        Intent intent = getIntent();
        String returns = intent.getStringExtra("return");
        textView.setText(returns);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"(2)onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"(3)onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"(4)onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"(5)onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"(6)onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"(7)onDestroy");
    }
}
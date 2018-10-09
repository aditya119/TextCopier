package com.example.adityasharma.textcopier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fromText;
    private TextView toText;
    private Button copyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        copyButton = findViewById(R.id.copyButton);
        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copyMethod(view);
            }
        });
    }

    public void copyMethod(View view) {
        String text = "";
        fromText = view.findViewById(R.id.editText);
        if(fromText.getText() != null) {
            text = fromText.getText().toString();
        }
        toText = view.findViewById(R.id.toText);
        toText.setText(text);
    }

    @Override
    public void onClick(View view) {
        
    }
}
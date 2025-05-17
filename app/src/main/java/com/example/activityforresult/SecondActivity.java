package com.example.activityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText inputEditText;
    Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        inputEditText = findViewById(R.id.editText);
        returnButton = findViewById(R.id.button2);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputEditText.getText().toString().trim();

                if (input.isEmpty()) {
                    Toast.makeText(SecondActivity.this, "Input cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent resultIntent = new Intent();
                resultIntent.putExtra("userInput", input);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}

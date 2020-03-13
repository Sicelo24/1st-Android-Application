package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

String description = "My 1st Project";
EditText editText;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext1);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameValue = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("NAME", nameValue);
                intent.putExtra("DESCRIPTION", description);
                startActivity(intent);
            }
        });
    }
public static Intent makeIntent (Context context){
    Intent intent = new Intent(context, Activity2.class);
    return intent;
}

}

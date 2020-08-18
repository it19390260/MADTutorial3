package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText etNUm1;
    EditText etNUm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNUm1 = findViewById(R.id.etNum1);
        etNUm2 = findViewById(R.id.etNum2);


    }
    public void opensecond(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",etNUm1.getText().toString());
        intent.putExtra("n2",etNUm2.getText().toString());

        Toast.makeText(this, "opening calculator... ", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }


}
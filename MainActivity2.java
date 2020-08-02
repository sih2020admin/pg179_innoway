package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText text1,text2;
    String edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = findViewById(R.id.edit_text1);
        text2 = findViewById(R.id.edit_text2);

    }
    public void save(View view){
        edit1 = text1.getText().toString();
        edit2 = text2.getText().toString();
        // this mtlb current activity
        // dursra parameter wo activity jis kar janna hae. change kr lena
        Intent intent = new Intent(this,userLocation.class);
        startActivity(intent);
    }
}

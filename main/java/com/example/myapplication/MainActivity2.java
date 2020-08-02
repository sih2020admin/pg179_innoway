package com.example.myapplication;

        import android.os.Bundle;
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

        edit1 = text1.getText().toString();
        edit2 = text2.getText().toString();
    }
}
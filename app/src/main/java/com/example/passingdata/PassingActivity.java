package com.example.passingdata;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PassingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing);
        TextView t = (TextView) findViewById(R.id.text_view_data);
        Bundle bundle=getIntent().getExtras();
        String s = bundle.getString("name");
        t.setText(s);
    }
}
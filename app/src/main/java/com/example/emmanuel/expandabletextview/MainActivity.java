package com.example.emmanuel.expandabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExpandableTextView expTv1 = (ExpandableTextView) findViewById(R.id.expand_text_view);
        expTv1.setText(getString(R.string.dummy_text1));

    }



}

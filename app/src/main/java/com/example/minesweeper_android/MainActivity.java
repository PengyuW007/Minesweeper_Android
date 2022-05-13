package com.example.minesweeper_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnCellClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /********* Default setting***********/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCellClick(Cell cell) {
        //Toast Messages are a quick way of informing the user by short Pop-up messages that last for a short period of time and then disappear. 
        Toast.makeText(getApplicationContext(),"Cell clicked",Toast.LENGTH_SHORT);
    }
}
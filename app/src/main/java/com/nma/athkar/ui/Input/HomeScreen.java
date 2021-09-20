package com.nma.athkar.ui.Input;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nma.athkar.R;
import com.nma.athkar.ui.Output.CountScreen;

public class HomeScreen extends AppCompatActivity {

    Button btn_start;
    Intent gotoCountScreen ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        initviews();
        gotoCountScreen=new Intent(HomeScreen.this, CountScreen.class);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(gotoCountScreen);



            }
        });

    }

    private void initviews() {
         btn_start=findViewById(R.id.start);


    }
}
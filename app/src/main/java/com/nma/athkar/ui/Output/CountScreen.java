package com.nma.athkar.ui.Output;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nma.athkar.R;

public class CountScreen extends AppCompatActivity {

    int counter=0;
    Button btn_click;
    Button btn_clear;
    TextView tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_screen);
        btn_click=findViewById(R.id.click);
        btn_clear=findViewById(R.id.clear);
        tx=findViewById(R.id.tx);
        btn_click.setOnClickListener(new View.OnClickListener()
          {
                                         @Override
               public void onClick(View view) {

            counter++;
              tx.setText(Integer.toString(counter));

                }
               }
        );

                btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               tx.setText("0");
                counter=0;
                //tx.setText(Integer.toString(counter));


            }
        });






    }
}
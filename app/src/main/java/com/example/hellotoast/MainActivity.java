package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button countbutton , toastbutton;
    private TextView showcounttextview;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countbutton = (Button)findViewById(R.id.countbutton);
        toastbutton = (Button)findViewById(R.id.toastbutton);
        showcounttextview = (TextView)findViewById(R.id.showcounttextview);


        countbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                if (showcounttextview != null){
                    showcounttextview.setText(Integer.toString(count));
                }

            }
        });

        toastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,R.string.toast_message,Toast.LENGTH_SHORT)
                        .show();

            }
        });


    }
}

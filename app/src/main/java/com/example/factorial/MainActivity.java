package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1 = (EditText) findViewById(R.id.num);
        // EditText T2=(EditText) findViewById(R.id.Text2);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.button);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num, fact = 1;
                num = Integer.parseInt(T1.getText().toString().trim());
                //n2=Integer.parseInt(T2.getText().toString().trim());
                for(int i=2;i<=num;i++)
                {
                    fact=fact*i;
                }

                Result.setText("Factirial of" + num + " is " + fact);
                Toast.makeText(MainActivity.this, "Factorial is" + num, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
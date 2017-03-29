package com.ma.mj.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onTransClick(View v){
        e1 = (EditText)findViewById(R.id.editText3);
        t1 = (TextView)findViewById(R.id.textView13)
        int num = Integer.parseInt(e1.getText().toString());

        if(v.getId() == R.id.button2){
            double result = num * 3.305785;
            t1.setText(String.format("%.2f제곱미터입니다아아아",result));
        }
        else if(v.getId() == R.id.button3){
            double result = num * 0.3025;
            t1.setText(String.format("%.0f평입니다.",result));

        }

    }
}

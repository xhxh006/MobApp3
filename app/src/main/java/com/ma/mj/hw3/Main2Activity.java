package com.ma.mj.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TabHost tabHost;
    EditText e1,e2,e3;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

    }

    void init(){
        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();
        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("BMI 계산기"));
        tabHost.addTab(tabHost.newTabSpec("B").setIndicator("면적 계산기")
        .setContent(new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag){
                View view = View.inflate(Main2Activity.this,R.layout.activity_main3,null);
                return view;
            }
        }));
    }
    public void yoClickClick (View v){
        if (v.getId() == R.id.button){
            e1 = (EditText)findViewById(R.id.editText);
            e2 = (EditText)findViewById(R.id.editText2);
            t1 = (TextView)findViewById(R.id.textView10);
            t2 = (TextView)findViewById(R.id.textView13);

            String hight = e1.getText().toString();
            String weight = e2.getText().toString();


            Float bmi = Integer.parseInt(weight) / ((Float.parseFloat(hight)/100)*(Float.parseFloat(hight)/100));
            if (bmi < 18.5){
                t1.setText("체중 미달입니다.");
            }
            else if(18.5 <= bmi && bmi < 23){
                t1.setText("정상 체중입니다.");
            }
            else if(23 <= bmi && bmi < 25){
                t1.setText("과체중입니다.");
            }
            else{
                t1.setText("비만입니다.");
            }
        }
    }
    public void onTransClick(View v){
        e3 = (EditText)findViewById(R.id.editText3);
        t2 = (TextView)findViewById(R.id.textView13);
        Float num = Float.parseFloat(e3.getText().toString());

        if(v.getId() == R.id.button2){
            double result = num * 3.305785;
            String result2 = String.format("%.2f",result);
            t2.setText(result2+"제곱미터입니다.");
        }
        else if(v.getId() == R.id.button3){
            double result = num * 0.3025;
            String result2 = String.format("%.0f",result);
            t2.setText(result2+"평입니다.");

        }

    }
}

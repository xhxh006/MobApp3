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

    }

    void init(){
        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup();
        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("BMI 계산기"));
        tabHost.addTab(tabHost.newTabSpec("B").setIndicator("면적 계산기")
        .setContent(new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag){
                View biew = View.inflate(Main2Activity.this,R.layout.activity_main3,null);
                return biew;
            }
        }));
    }
    public void yoClickClick (View v){
        if (v.getId() == R.id.button){
            e1 = (EditText)findViewById(R.id.editText);
            e2 = (EditText)findViewById(R.id.editText2);
            t1 = (TextView)findViewById(R.id.textView12);

            String hight = e1.getText().toString();
            String weight = e2.getText().toString();

            int bmi = Integer.parseInt(weight) / (Integer.parseInt(hight)*Integer.parseInt(hight));
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
        t2 = (TextView)findViewById(R.id.textView13)
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

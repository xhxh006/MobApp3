package com.ma.mj.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class Activity_tabhost extends AppCompatActivity {
    TabHost tabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);

        tabhost = (TabHost)findViewById(R.id.th);
        tabhost.setup();

        TabHost.TabSpec tab1 = tabhost.newTabSpec("A").setContent(R.id.tab1)
                .setIndicator("날짜선택");
        tabhost.addTab(tab1);

        tabhost.addTab(tabhost.newTabSpec("B").setContent(R.id.tab2)
                .setIndicator("시간선택"));

        View getT3View() {
            View view = View.inflate(Activity_tabhost.this,R.layout.tab3,null);

            Button btn = (Button)view.findViewById(R.id.btntab3);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Hello!!!", Toast.LENGTH_SHORT).show();
                    ;
                }
            });
        }
    }


}

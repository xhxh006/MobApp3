package com.ma.mj.hw3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

import static android.graphics.Color.BLUE;

public class Actibity_menu extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actibity_menu);

        t = (TextView)findViewById(R.id.textView);
        registerForContextMenu(t);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.muyellow){}
        else if(item.getItemId() == R.id.muyellow){}
        else if(item.getItemId() == R.id.mufont20){
            t.setTextSize(20);
            item.setChecked(true);
        }
        else if(item.getItemId() == R.id.mufont40){
            t.setTextSize(40);
            item.setChecked(true);

        }

        return super.onOptionsItemSelected(item);
    }*/
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == t){
            getMenuInflater().inflate(R.menu.menu,menu);
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mublue:
               // t.setBackground()
        }
        return super.onContextItemSelected(item);
    }
}

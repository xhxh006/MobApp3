package com.ma.mj.hw3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView food;
    TextView t1, t2;
    LinearLayout lay;
    FrameLayout fra;
    int mDegree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food = (ImageView)findViewById(R.id.imageView);
        t1 = (TextView)findViewById(R.id.textView8);
        t2 = (TextView)findViewById(R.id.textView7);
        fra = (FrameLayout)findViewById(R.id.fraa);
        lay = (LinearLayout)findViewById(R.id.linelay);
        mDegree = 0;


    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item){;
        if(item.getItemId() == R.id.mered){
            lay.setBackgroundColor(Color.RED);
        }
        else if(item.getItemId() == R.id.meblue){
            lay.setBackgroundColor(Color.BLUE);
        }
        else if(item.getItemId() == R.id.meyellow){
            lay.setBackgroundColor(Color.YELLOW);
        }

        else if(item.getItemId() == R.id.meturn){
            if (mDegree == 330){
                mDegree = 0;
            }
            else{
                mDegree = mDegree + 30;
            }
            food.setRotation(mDegree);
        }
        else if(item.getItemId() == R.id.metle){
            if(item.isChecked()){
                item.setChecked(false);
                fra.setVisibility(View.INVISIBLE);
            }
            else{
                item.setChecked(true);
                fra.setVisibility(View.VISIBLE);
            }
        }
        else if(item.getItemId() == R.id.memag){
            if (item.isChecked()){
                item.setChecked(false);
                food.setScaleX(1);
                food.setScaleY(1);
            }
            else{
                item.setChecked(true);
                food.setScaleX(2);
                food.setScaleY(2);
            }
        }
        else if(item.getItemId() == R.id.mechicken){
            item.setChecked(true);
            food.setImageResource(R.drawable.bhc);
            t1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.INVISIBLE);
        }
        else if(item.getItemId() == R.id.mepasta){
            item.setChecked(true);
            food.setImageResource(R.drawable.papasta);
            t1.setVisibility(View.INVISIBLE);
            t2.setVisibility(View.VISIBLE);
        }
        else if(item.getItemId() == R.id.gogo){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}

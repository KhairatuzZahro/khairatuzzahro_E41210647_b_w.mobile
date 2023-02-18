package com.example.minggu1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void btnlinier(View view) {
        Intent intent = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(intent);
    }
    public void btnrelative(View view) {
        Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(intent);
    }
    public void btnconstrain(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
        startActivity(intent);
    }
    public void btnframe(View view) {
        Intent intent = new Intent(MainActivity.this, FrameLayout.class);
        startActivity(intent);
    }
    public void btntabel(View view) {
        Intent intent = new Intent(MainActivity.this, TabelLayout.class);
        startActivity(intent);
    }
    public void btnmaterial(View view) {
        Intent intent = new Intent(MainActivity.this,materialdesign.class);
        startActivity(intent);
    }
    public void btnscroll(View view) {
        Intent intent = new Intent(MainActivity.this,scrollview.class);
        startActivity(intent);
    }
    public void btnhorizontal(View view) {
        Intent intent = new Intent(MainActivity.this, scrollviewhorizontal.class);
        startActivity(intent);
    }
}
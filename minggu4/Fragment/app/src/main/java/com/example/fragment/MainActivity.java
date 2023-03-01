package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    Button btnFristFragment , btnSecondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFristFragment = (Button) findViewById(R.id.firstfragment);
        btnSecondFragment = (Button) findViewById(R.id.secondFragment);
        btnFristFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new FirstFragment());
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }
    private  void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction framentTransaction = fm.beginTransaction();
        framentTransaction.replace(R.id.frameLayout, fragment);
        framentTransaction.commit();
    }
}
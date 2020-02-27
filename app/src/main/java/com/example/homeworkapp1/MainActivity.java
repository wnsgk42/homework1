package com.example.homeworkapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentName fragment_name = new FragmentName();
        FragmentOld fragment_old = new FragmentOld();
        FragmentBirth fragment_birth = new FragmentBirth();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frg_old, new FragmentOld());
        fragmentTransaction.add(R.id.frg_bth, new FragmentBirth());
        fragmentTransaction.add(R.id.frg_name, new FragmentName());
        fragmentTransaction.commit();


    }
}

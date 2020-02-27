package com.example.homeworkapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText edit_name;
    EditText edit_old;
    Button btn_birth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.frg_old, new FragmentOld());
        fragmentTransaction.add(R.id.frg_name, new FragmentName());
        fragmentTransaction.add(R.id.frg_bth, new FragmentName());
        fragmentTransaction.commit();

        Button btn_birth=findViewById(R.id.btn_birth);
        btn_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button btn = findViewById(R.id.btn);

        edit_name = findViewById(R.id.edit_name);
        edit_old = findViewById(R.id.edit_old);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_name.getText().toString();
                String old = edit_old.getText().toString();
                Toast.makeText(getApplicationContext(), "이름:"+name+", 나이:"+old+", 생일:"+birth,Toast.LENGTH_LONG);
            }
        });
    }

}


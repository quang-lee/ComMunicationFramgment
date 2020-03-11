package com.example.communicationframgment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentA fragmentA = new FragmentA();

        Bundle bundle = new Bundle();
        bundle.putString("Xin Chao", "Day la du lieu duoc chuyen qua Fragment tu Activity");

        fragmentA.setArguments(bundle);
        fragmentTransaction.add(R.id.lnActivity, fragmentA);
        fragmentTransaction.commit();






    }
}

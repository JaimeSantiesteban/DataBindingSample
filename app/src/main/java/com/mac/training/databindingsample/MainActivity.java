package com.mac.training.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mac.training.databindingsample.databinding.ActivityMainBinding;
import com.mac.training.databindingsample.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        User user = new User("Jaime", "Santiesteban", "email@asas.com");
        binding.setUser(user);
    }
}

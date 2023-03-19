package com.example.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //对于一个没有被载入或者想要动态载入的界面，都需要使用LayoutInflater.inflate()来载入；
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        //根视图获取
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textCreateNewAccount.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));
    }
}
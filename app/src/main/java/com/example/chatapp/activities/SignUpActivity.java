package com.example.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapp.R;
import com.example.chatapp.databinding.ActivitySignInBinding;
import com.example.chatapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //对于一个没有被载入或者想要动态载入的界面，都需要使用LayoutInflater.inflate()来载入；
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        //根视图获取
        setContentView(binding.getRoot());
        setListeners();
    }


    private void setListeners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}
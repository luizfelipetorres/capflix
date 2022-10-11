package com.lftf.capflix;

import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.lftf.capflix.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        binding.iconShowPassword.setOnClickListener(this);
        binding.forgotPassword.setOnClickListener(this);
        binding.buttonLogin.setOnClickListener(this);
        binding.textViewSignUp.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.icon_show_password:
                if (binding.editTextPassword.getInputType() != InputType.TYPE_CLASS_TEXT)
                    binding.editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT);
                else
                    binding.editTextPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                break;
            case R.id.button_login:
                Snackbar.make(this ,v, "Fazendo login...", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.forgot_password:
                Snackbar.make(v, "Esqueci a senha...", Snackbar.LENGTH_LONG).show();
                break;
            case R.id.text_view_sign_up:
                Snackbar.make(v, "Criar usuário...", Snackbar.LENGTH_LONG).show();

        }
    }
}
package com.example.matala2.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.matala2.R;
import com.example.matala2.fragment.LoginFragment;
import com.example.matala2.fragment.ProductFragment;
import com.example.matala2.fragment.RegisterFragment;

public class MainActivity extends FragmentActivity
{

    private static final int FRAGMENT_LOGIN = 0;
    private static final int FRAGMENT_REGISTER = 1;
    private static final int FRAGMENT_PRODUCT = 2;

    private int currentFragment = FRAGMENT_LOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // התחלת Fragment התחלתי
        showFragment(FRAGMENT_LOGIN);
    }

    public void onLoginButtonClick(View view)
    {
        // קבלת שם משתמש וסיסמה
        TextView usernameView = findViewById(R.id.UserName);
        TextView passwordView = findViewById(R.id.password);
        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();

        // בדיקת נתונים
        if (validateLogin(username, password))
        {
            // הצגת Fragment מוצרים
            showFragment(FRAGMENT_PRODUCT);
        }
    }

    public void onRegisterButtonClick(View view)
    {
        showFragment(FRAGMENT_REGISTER);
    }

    private void showFragment(int fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment)
        {
            case FRAGMENT_LOGIN:
                transaction.replace(R.id.fragmentContainerView, new LoginFragment());
                break;
            case FRAGMENT_REGISTER:
                transaction.replace(R.id.fragmentContainerView, new RegisterFragment());
                break;
            case FRAGMENT_PRODUCT:
                transaction.replace(R.id.fragmentContainerView, new ProductFragment());
                break;
        }

        currentFragment = fragment;
        transaction.commit();
    }

    private boolean validateLogin(String username, String password)
    {
        if (TextUtils.isEmpty(username))
        {
            Toast.makeText(this, "enter name!", Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "enter password!", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (password.length() < 6)
        {
            Toast.makeText(this, "password too short, minimum 6 charts!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;
    }}

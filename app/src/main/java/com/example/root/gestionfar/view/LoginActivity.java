package com.example.root.gestionfar.view;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.root.gestionfar.R;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;

    @BindView(R.id.login)
    EditText login;


    @BindView(R.id.pass)
    EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.button)

    public void onButtonClicked() {

           Intent CallMainActivity = new Intent (getApplicationContext(), MenuActivity.class);
         CallMainActivity.putExtra("login", "ilias");
         CallMainActivity.putExtra("pass", "12345");
         ILIASactivity(CallMainActivity);




    }


    public void ILIASactivity(Intent i) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(i);

    }

}

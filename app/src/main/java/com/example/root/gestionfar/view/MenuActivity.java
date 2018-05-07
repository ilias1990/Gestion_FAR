package com.example.root.gestionfar.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.EditText;

import com.example.root.gestionfar.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {
    @BindView(R.id.loc)
    ImageView loc;

    @BindView(R.id.st)
    ImageView st;

    @BindView(R.id.ch)
    ImageView ch;

    @BindView(R.id.gt)
    ImageView gt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.loc)
    public void onLcClicked() {
    Intent CalllocActivity = new Intent (getApplicationContext(), LocalisationActivity.class);

    ILIASactivity(CalllocActivity);




}


    public void ILIASactivity(Intent i) {
        Intent intent = new Intent(this, LocalisationActivity.class);
        startActivity(i);

    }


    @OnClick(R.id.st)
    public void onSTClicked() {
        Intent CallstActivity = new Intent (getApplicationContext(), StatistiqueActivity.class);

        ILIASSactivity(CallstActivity);




    }


    public void ILIASSactivity(Intent i) {
        Intent intent = new Intent(this, StatistiqueActivity.class);
        startActivity(i);

    }
    @OnClick(R.id.ch)
    public void onchClicked() {
        Intent CallchActivity = new Intent (getApplicationContext(), ChatActivity.class);

        kheiraactivity(CallchActivity);




    }


    public void kheiraactivity(Intent i) {
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(i);

    }
    @OnClick(R.id.gt)
    public void ongtClicked() {
        Intent CallgtActivity = new Intent (getApplicationContext(), GTActivity.class);

        kheiractivity(CallgtActivity);




    }


    public void kheiractivity(Intent i) {
        Intent intent = new Intent(this, GTActivity.class);
        startActivity(i);

    }

}

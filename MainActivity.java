package com.example.android.musicboxproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick ({R.id.IrockMusic, R.id.IpopMusic, R.id.ImetalMusic, R.id.IhouseMusic})
    public void setViewOnClickEvent(View view){
        switch(view.getId())
        {
            case R.id.IrockMusic:
                startActivity(new Intent(MainActivity.this, RockMusicActivity.class));
                break;
            case R.id.IhouseMusic:
                startActivity(new Intent(MainActivity.this, HouseMusicActivity.class));
                break;
            case R.id.ImetalMusic:
                startActivity(new Intent(MainActivity.this, MetalMusicActivity.class));
                break;
            case R.id.IpopMusic:
                startActivity(new Intent(MainActivity.this, PopMusicActivity.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}

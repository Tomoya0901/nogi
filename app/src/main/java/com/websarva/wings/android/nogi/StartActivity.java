package com.websarva.wings.android.nogi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //textviewを点滅させる
        AlphaAnimation aanim1 = new AlphaAnimation(1, 0.2f);
        aanim1.setDuration( 800 );
        aanim1.setRepeatCount( Animation.INFINITE );
        aanim1.setRepeatMode( Animation.REVERSE );
        ((TextView)findViewById(R.id.tvTap)).startAnimation(aanim1);


        ImageView ivIcon = findViewById(R.id.ibIcon);
        ivIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}

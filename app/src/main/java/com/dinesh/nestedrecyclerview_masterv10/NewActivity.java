package com.dinesh.nestedrecyclerview_masterv10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class NewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);


        String intentImgUrl = getIntent().getStringExtra("ImgUrl");
        String intentTitle = getIntent().getStringExtra("Title");

        Glide.with(this)
                .load(intentImgUrl)
                .into(imageView);

        textView.setText(intentTitle);


    }
}

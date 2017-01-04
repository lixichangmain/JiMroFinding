package com.jimro.findingperson;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;

import application.JiMroAPP;
import contants.Contants;
import util.FrescoUtil;

public class LoginActivity extends Activity implements View.OnClickListener {
    private ImageView backImage;
    private TextView textRight;
    private SimpleDraweeView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        backImage = (ImageView) findViewById(R.id.image_back);
        textRight = (TextView) findViewById(R.id.text_right);
        icon = (SimpleDraweeView) findViewById(R.id.icon);

        FrescoUtil.loadImage(Uri.parse(Contants.DEFAULT_ICON_URI),null,icon);
        textRight.setText(R.string.title_text_register);
        backImage.setOnClickListener(this);
        textRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_back:
                finish();
                break;
            case R.id.text_right:
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}

package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.camera2basic.R.layout.activity_camera);
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(com.example.android.camera2basic.R.id.container, com.example.android.camera2basic.Camera2BasicFragment.newInstance())
                    .commit();
        }
    }

}

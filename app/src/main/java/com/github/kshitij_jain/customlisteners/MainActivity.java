package com.github.kshitij_jain.customlisteners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CustomObject mCustomObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomObject = new CustomObject();
        mCustomObject.setOnCustomListener(new OnCustomListener() {
            @Override
            public void onCustom(String string) {
                Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();
            }
        });
    }
}

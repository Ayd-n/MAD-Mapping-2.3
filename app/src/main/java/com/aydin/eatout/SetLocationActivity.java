package com.aydin.eatout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;


import android.content.Intent;

public class SetLocationActivity extends AppCompatActivity implements OnClickListener {
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);

        Button setlocation = (Button) findViewById(R.id.btnSetLoc);
        setlocation.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        EditText setlattext = (EditText)findViewById(R.id.sl1);
        EditText setlontext = (EditText)findViewById(R.id.sl2);
        double latitude = Double.parseDouble(setlattext.getText().toString());
        double longitude = Double.parseDouble(setlontext.getText().toString());

        Intent intent = new Intent();
        Bundle bundle = new Bundle();

        Log.d("mapping", "latitude=" + latitude);
        Log.d("mapping", "longitude=" + longitude);

        bundle.putDouble("com.example.setlat", latitude);
        bundle.putDouble("com.example.setlon", longitude);
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();
    }
}
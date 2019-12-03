package com.example.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button call =(Button)findViewById(R.id.button_call);
        Button map =(Button)findViewById(R.id.button_map);
        Button page =(Button)findViewById(R.id.button_page);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_c = new Intent(Intent.ACTION_DIAL);
                startActivity(intent_c);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("geo:38.899533,-77.036476");
                Intent intent_m = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent_m);
            }
        });
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.google.com");
                Intent intent_p = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent_p);
            }
        });
    }
}

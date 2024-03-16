package com.example.hhmmchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private FirebaseAuth fAuth;
    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView kitap11 = findViewById(R.id.kitap11);
        ImageView kitap12 = findViewById(R.id.kitap12);
        ImageView kitap21 = findViewById(R.id.kitap21);
        ImageView kitap22 = findViewById(R.id.kitap22);

        kitap11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
                intent.putExtra("subject","DEDEKTİF KURUKAFA: LANETLİ KRALLIK");
                startActivity(intent);
            }
        });

        kitap12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
                intent.putExtra("subject","NARNİA GÜNLÜKLERİ: SON SAVAŞ");
                startActivity(intent);
            }
        });

        kitap21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
                intent.putExtra("subject","PERCY JACKSON VE OLİMPOSLULAR");
                startActivity(intent);
            }
        });

        kitap22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
                intent.putExtra("subject","ZALİM PRENS");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.exit)
        {
            fAuth.signOut();
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
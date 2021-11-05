package com.example.aplicativo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pagina3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);
        Button btnLong1 = (Button) findViewById(R.id.btnLong1);
        btnLong1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong2 = (Button) findViewById(R.id.btnLong2);
        btnLong2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong3 = (Button) findViewById(R.id.btnLong3);
        btnLong3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong4 = (Button) findViewById(R.id.btnLong4);
        btnLong4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong5 = (Button) findViewById(R.id.btnLong5);
        btnLong5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong6 = (Button) findViewById(R.id.btnLong6);
        btnLong6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong7 = (Button) findViewById(R.id.btnLong7);
        btnLong7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        Button btnLong8 = (Button) findViewById(R.id.btnLong8);
        btnLong8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(pagina3.this, "Você deu um click longo!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.menuPag1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.menuPag2:
                Intent intent2 = new Intent(this, pagina2.class);
                startActivity(intent2);
                break;
            case R.id.menuPag3:
                Toast.makeText(this, "Você já está na página 3", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}
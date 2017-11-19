package com.aynurbalikci.NewsApplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] categories =
            {"Ekonomi", "Spor","Siyaset","Tatil","İş Yaşam","Astroloji","Sağlık","Dünya","Gündem","Kültür-Sanat","Sinema","Teknoloji","Otomobil","Magazin","Kadın"};

    ListView listemiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportActionBar().setTitle("ISMEK HABER");

        listemiz =(ListView)findViewById(R.id.listViewIsmekHaber);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, categories);

        listemiz.setAdapter(adapter);
        listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = listemiz.getAdapter().getItem(position).toString();

                Intent intent = new Intent(MainActivity.this,NewsActivity.class);
                intent.putExtra("category",value);
                startActivity(intent);
            }
        });

    }
}

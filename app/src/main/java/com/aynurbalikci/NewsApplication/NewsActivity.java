package com.aynurbalikci.NewsApplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    ArrayList<News> dataset;
    NewsAdapter adapter;
    RecyclerView rvNews;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        String category= getIntent().getExtras().getString("category");
        getSupportActionBar().setTitle(category);


        rvNews = (RecyclerView) findViewById(R.id.rvNews);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvNews.setLayoutManager(linearLayoutManager);
        rvNews.setHasFixedSize(true);
        dataset = new ArrayList<>();
        adapter = new NewsAdapter(dataset, getApplicationContext());
        rvNews.setAdapter(adapter);


        category= category.toLowerCase();
        category=ConvertTrtoEn(category);

        if(!(category.equals("ekonomi")||category.equals("spor")||category.equals("magazin")))
        {
            category="kategori/"+category;
        }



    }

      public String ConvertTrtoEn(String data){

          for (char  c : data.toCharArray())
          {
              switch (c)
              {
                  case 'ş':
                  case 'Ş':
                      data = data.replace(c, 's');
                      break;
                  case 'ç':
                  case 'Ç':
                      data = data.replace(c, 'c');
                      break;
                  case 'ı':
                  case 'İ':
                      data = data.replace(c, 'i');
                      break;
                  case 'ğ':
                  case 'Ğ':
                      data = data.replace(c, 'g');
                      break;
                  case 'ü':
                  case 'Ü':
                      data = data.replace(c, 'u');
                      break;
                  case 'ö':
                  case 'Ö':
                      data = data.replace(c, 'o');
                      break;
                  case ' ':
                      data = data.replace(c, '-');
                      break;
              }
          }
          return data;


    }
}

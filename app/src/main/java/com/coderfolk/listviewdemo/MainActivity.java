package com.coderfolk.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {

    ListView mylist;
    String text[] = new String[]{"Hello",
            "This",
            "is",
            "Custom",
            "ListView",
            "This",
            "is",
            "Custom",
            "ListView",
            "This",
            "is",
            "Custom",
            "ListView",
            "This"};
    int image[] = new int[]{R.drawable.about,
            R.drawable.boost,
            R.drawable.send,
            R.drawable.settings,
            R.drawable.share,
            R.drawable.boost,
            R.drawable.send,
            R.drawable.settings,
            R.drawable.share,
            R.drawable.share,
            R.drawable.boost,
            R.drawable.send,
            R.drawable.settings,
            R.drawable.share};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (ListView) findViewById(R.id.mylist);
        MyCustomListAdapter myadapter = new MyCustomListAdapter(getApplicationContext(),image, text);
        mylist.setAdapter(myadapter);

    }
}

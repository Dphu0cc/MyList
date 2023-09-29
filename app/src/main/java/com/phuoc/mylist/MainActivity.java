package com.phuoc.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lv_item);

        List<String> list = new ArrayList<>();
        Lv_Adapter adapter = new Lv_Adapter(this, R.id.lv_item, list);
        list.add("Nguyễn Đức Phước");
        list.add("Nguyễn Văn Hoàng");
        lv.setAdapter(adapter);
    }
}
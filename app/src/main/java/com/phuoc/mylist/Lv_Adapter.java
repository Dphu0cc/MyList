package com.phuoc.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Lv_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> data;

    public Lv_Adapter(Context context, int layout, List<String> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.layout_listview, viewGroup, false);

        TextView tv = view.findViewById(R.id.tview);
//        tv = view.findViewById(android.R.id.text1);
        // Đặt dữ liệu cho TextView
        tv.setText(data.get(i));

        return view;
    }
}

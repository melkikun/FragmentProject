package com.example.it01.fragmentproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.it01.fragmentproject.R;

/**
 * Created by IT01 on 3/11/2017.
 */

public class ListAdapter extends BaseAdapter{
    private String [] nama;
    Context context;

    public ListAdapter(String[] nama, Context context) {
        this.nama = nama;
        this.context = context;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = view;
        TextView textView;
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view == null){
            view1 = layoutInflater.inflate(R.layout.list_adapter, null);
            textView = (TextView) view1.findViewById(R.id.text1);
            textView.setText(nama[i]);
        }
        return view1;
    }
}

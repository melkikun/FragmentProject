package com.example.it01.fragmentproject.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.it01.fragmentproject.R;
import com.example.it01.fragmentproject.adapter.ListAdapter;

public class FragmentKedua extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_kedua, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String [] nama = {"1", "2", "3"};
        ListAdapter listAdapter = new ListAdapter(nama, getActivity());
        ListView listView = (ListView) view.findViewById(R.id.list_view1);
        listView.setAdapter(listAdapter);
    }
}

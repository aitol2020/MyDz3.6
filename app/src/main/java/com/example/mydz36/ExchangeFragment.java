package com.example.mydz36;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ExchangeFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<Label> list;

    ExchangeFragAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exchange, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new ExchangeFragAdapter();
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();
        for (int i = 0; i < 30 ; i++) {
        list.add(new Label("test"));


        adapter.addText(list);

    }

}}
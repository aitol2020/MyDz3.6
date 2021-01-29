package com.example.mydz36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExchangeFragAdapter extends RecyclerView.Adapter<ExchangeFragAdapter.MainViewHolder> {


    ArrayList<Label> list;

    public ExchangeFragAdapter() {
        ArrayList<Label> list = new ArrayList<>();
        this.list = list;
    }

    public void addText(ArrayList<Label> label) {
        list = label;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ExchangeFragAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.label_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView label;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            label = itemView.findViewById(R.id.Label1);
        }

        public void onBind(Label label) {
            label.setText(label.label);


        }
    }

}
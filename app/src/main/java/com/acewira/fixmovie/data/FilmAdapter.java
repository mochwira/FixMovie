package com.acewira.fixmovie.data;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.acewira.fixmovie.R;
import com.acewira.fixmovie.database.ViewHolder;
import com.acewira.fixmovie.detail.ItemResult;

import java.util.ArrayList;
import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<ItemResult> list = new ArrayList<>();

    public FilmAdapter() {
    }

    public void clearAll() {
        list.clear();
        notifyDataSetChanged();
    }

    public void replaceAll(List<ItemResult> items) {
        list.clear();
        list = items;
        notifyDataSetChanged();
    }

    public void updateData(List<ItemResult> items) {
        list.addAll(items);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.activity_detail_item, parent, false
                )
        );
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}

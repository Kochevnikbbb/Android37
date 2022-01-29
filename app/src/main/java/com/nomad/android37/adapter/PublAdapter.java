package com.nomad.android37.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nomad.android37.databinding.ItemPhotoBinding;
import com.nomad.android37.model.Publ;

import java.util.ArrayList;

public class PublAdapter extends RecyclerView.Adapter<PublAdapter.CountViewHolder> {

    ArrayList<Publ> publs;

    public PublAdapter(ArrayList<Publ> publs) {
        this.publs = publs;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPhotoBinding binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(publs.get(position));
    }

    @Override
    public int getItemCount() {
        return publs.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {

        private ItemPhotoBinding binding;
        public CountViewHolder(@NonNull ItemPhotoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Publ publ) {
            binding.imagePubl.setImageResource(publ.getImage());
        }
    }
}

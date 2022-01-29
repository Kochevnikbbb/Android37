package com.nomad.android37.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nomad.android37.Onclick;
import com.nomad.android37.databinding.ItemInstaBinding;
import com.nomad.android37.databinding.ItemLikeBinding;
import com.nomad.android37.model.InstaModel;
import com.nomad.android37.model.Likee;

import java.util.ArrayList;

public class HeartAdapter extends RecyclerView.Adapter<HeartAdapter.CounttViewHolder> {
    ArrayList<Likee> likee;
    private ItemLikeBinding binding;

    public HeartAdapter(ArrayList<Likee> likee) {
        this.likee = likee;
    }

    @NonNull
    @Override
    public CounttViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemLikeBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent,false);
        return new CounttViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CounttViewHolder holder, int position) {
    holder.bind(likee.get(position));
    }

    @Override
    public int getItemCount() {
        return likee.size();
    }


    static class CounttViewHolder extends RecyclerView.ViewHolder{
        ItemLikeBinding binding;

        public CounttViewHolder(@NonNull ItemLikeBinding itemView) {
            super(itemView.getRoot());
             binding = itemView;
        }

        public void bind(Likee likee) {
            binding.imagePerson.setImageResource(likee.getImagePerson());
            binding.imagePhoto.setImageResource(likee.getImagePhoto());
            binding.tvNamePerson.setText(likee.getText());
            binding.tvHour.setText(likee.getTextHour());
        }
    }
}

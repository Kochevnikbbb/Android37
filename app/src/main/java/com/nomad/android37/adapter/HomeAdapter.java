package com.nomad.android37.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nomad.android37.model.InstaModel;
import com.nomad.android37.Onclick;
import com.nomad.android37.databinding.ItemInstaBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.CountViewHolder> {
    private Onclick onclick;
    ArrayList<InstaModel> publ;

    public HomeAdapter(Onclick onclick, ArrayList<InstaModel> publ) {
        this.onclick = onclick;
        this.publ = publ;
    }

    public HomeAdapter(ArrayList<InstaModel> publ) {
        this.publ = publ;
    }


    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemInstaBinding binding = ItemInstaBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);

        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(publ.get(position));
        holder.binding.getRoot().setOnClickListener(view -> {
        onclick.onClick(publ.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return publ.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {
        private ItemInstaBinding binding;

        public CountViewHolder(@NonNull ItemInstaBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(InstaModel instaModel) {
            binding.imageInsta.setImageResource(instaModel.getImage());
            binding.tvName.setText(instaModel.getText());
            binding.tvData.setText(instaModel.getData());
        }
    }
}

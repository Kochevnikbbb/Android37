package com.nomad.android37.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android37.R;
import com.nomad.android37.adapter.PublAdapter;
import com.nomad.android37.databinding.FragmentPhoto2Binding;
import com.nomad.android37.model.Publ;

import java.util.ArrayList;

public class Photo2Fragment extends Fragment {
    private PublAdapter publAdapter;
    private ArrayList<Publ> publs;
    private FragmentPhoto2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPhoto2Binding.inflate(LayoutInflater.from(requireContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        publAdapter = new PublAdapter(publs);
        binding.recyclePhoto2.setAdapter(publAdapter);
    }

    private void loadData() {
        publs = new ArrayList<>();
        publs.add(new Publ(R.drawable.p3));
        publs.add(new Publ(R.drawable.p2));
        publs.add(new Publ(R.drawable.p1));
        publs.add(new Publ(R.drawable.p6));
        publs.add(new Publ(R.drawable.p5));
        publs.add(new Publ(R.drawable.p4));
        publs.add(new Publ(R.drawable.p7));
        publs.add(new Publ(R.drawable.p8));
    }
}
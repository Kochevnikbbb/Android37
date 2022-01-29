package com.nomad.android37.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android37.adapter.HomeAdapter;
import com.nomad.android37.model.InstaModel;
import com.nomad.android37.R;
import com.nomad.android37.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment{

    private HomeAdapter homeAdapter;
    private ArrayList<InstaModel> models;
    private FragmentHomeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        homeAdapter = new HomeAdapter(models);
        binding.recycleHome.setAdapter(homeAdapter);
    }

    private void loadData() {
        models = new ArrayList<>();
        models.add(new InstaModel("joshua_l The game in Japan was amazing and I want to share some photos","september 19", R.drawable.insta));
        models.add(new InstaModel("joshua_l The game in Japan was amazing and I want to share some photos","september 19", R.drawable.insta));
        models.add(new InstaModel("joshua_l The game in Japan was amazing and I want to share some photos","september 19", R.drawable.insta));
    }

}
package com.nomad.android37.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nomad.android37.R;
import com.nomad.android37.adapter.HeartAdapter;
import com.nomad.android37.databinding.FragmentHeartBinding;
import com.nomad.android37.model.Likee;

import java.util.ArrayList;

public class HeartFragment extends Fragment {
    private FragmentHeartBinding binding;
    private HeartAdapter heartAdapter;
    private ArrayList<Likee> like;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHeartBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        heartAdapter = new HeartAdapter(like);
        binding.recycleHeart.setAdapter(heartAdapter);
    }

    private void loadData() {
        like = new ArrayList<>();
        like.add(new Likee(R.drawable.person, R.drawable.photo, "karennne liked your photo.", "1h"));
        like.add(new Likee(R.drawable.person, R.drawable.photo, "karennne liked your photo.", "1h"));
        like.add(new Likee(R.drawable.person, R.drawable.photo, "karennne liked your photo.", "1h"));
        like.add(new Likee(R.drawable.person, R.drawable.photo, "karennne liked your photo.", "1h"));
        like.add(new Likee(R.drawable.person, R.drawable.photo, "karennne liked your photo.", "1h"));
    }


}
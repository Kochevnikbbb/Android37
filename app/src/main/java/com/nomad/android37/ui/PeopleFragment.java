package com.nomad.android37.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.nomad.android37.R;
import com.nomad.android37.databinding.FragmentPeopleBinding;

import java.util.ArrayList;

public class PeopleFragment extends Fragment {
    private AdapterViewPager adapter;
    private ArrayList<Fragment> list = new ArrayList<>();
    private FragmentPeopleBinding binding;
    private int[] icon = {R.drawable.ic_baseline_grid_on_24, R.drawable.ic_baseline_self_improvement_24};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPeopleBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViewPager();
        initTab();
    }

    private void initViewPager() {
        adapter = new AdapterViewPager(this);
        list.add(new PhotoFragment());
        list.add(new Photo2Fragment());
        adapter.setFragments(list);
        binding.viewPager.setAdapter(adapter);
    }

    private void initTab() {
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position)
                -> tab.setIcon(icon[position])).attach();
    }

    class AdapterViewPager extends FragmentStateAdapter {

        private ArrayList<Fragment> fragments = new ArrayList<>();

        public void setFragments(ArrayList<Fragment> fragments) {
            this.fragments = fragments;
        }

        public AdapterViewPager(@NonNull Fragment fragment) {
            super(fragment);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragments.get(position);
        }

        @Override
        public int getItemCount() {
            return fragments.size();
        }
    }
}
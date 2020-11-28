package com.chad.newsappmvvm.UI.Fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.newsappmvvm.R;
import com.chad.newsappmvvm.databinding.FragmentNewsDetailsBinding;

public class NewsDetailsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentNewsDetailsBinding fragmentNewsDetailsBinding =
                DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_news_details, container, false);


        //fragmentNewsDetailsBinding.setNewsItemData();
        return fragmentNewsDetailsBinding.getRoot();
    }
}
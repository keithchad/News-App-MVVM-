package com.chad.newsappmvvm.UI.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.newsappmvvm.R;
import com.chad.newsappmvvm.UI.DiffUtilNewsItemCallback;
import com.chad.newsappmvvm.UI.NewsListAdapter;

public class NewsListFragment extends Fragment {

    private RecyclerView recyclerView;
    private NewsListAdapter newsListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_news_list, container, false);
       initialize(view);
       populateData();
       return view;
    }

    private void populateData() {
    }

    private void initialize(View view) {
        recyclerView = view.findViewById(R.id.newsListRecyclerview);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        newsListAdapter = new NewsListAdapter(new DiffUtilNewsItemCallback());
        recyclerView.setAdapter(newsListAdapter);
    }
}
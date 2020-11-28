package com.chad.newsappmvvm.UI;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.chad.newsappmvvm.data.model.News;

public class DiffUtilNewsItemCallback extends DiffUtil.ItemCallback<News> {
    @Override
    public boolean areItemsTheSame(@NonNull News oldItem, @NonNull News newItem) {
        return oldItem.getId() == newItem.getId();
    }

    @Override
    public boolean areContentsTheSame(@NonNull News oldItem, @NonNull News newItem) {
        return oldItem.getId() == newItem.getId();
    }
}

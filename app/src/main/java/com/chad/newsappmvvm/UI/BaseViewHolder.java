package com.chad.newsappmvvm.UI;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.newsappmvvm.data.model.News;
import com.chad.newsappmvvm.databinding.NewsItemImageBinding;
import com.chad.newsappmvvm.databinding.NewsItemTextBinding;

abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindData(News news);

    public abstract NewsItemTextBinding newsItemTextBinding();
    public abstract NewsItemImageBinding newsItemImageBinding();

}

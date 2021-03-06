package com.chad.newsappmvvm.UI;

import android.view.View;

import androidx.annotation.NonNull;

import com.chad.newsappmvvm.data.model.News;
import com.chad.newsappmvvm.databinding.NewsItemImageBinding;
import com.chad.newsappmvvm.databinding.NewsItemTextBinding;

public class TextViewHolder extends BaseViewHolder {

    NewsItemTextBinding newsItemTextBinding;

    public TextViewHolder(@NonNull NewsItemTextBinding newsItemTextBinding) {
        super(newsItemTextBinding.getRoot());
        this.newsItemTextBinding = newsItemTextBinding;
    }

    @Override
    public void bindData(News news) {
        newsItemTextBinding.setNewsItemText(news);
    }

    @Override
    public NewsItemTextBinding newsItemTextBinding() {
        return null;
    }

    @Override
    public NewsItemImageBinding newsItemImageBinding() {
        return null;
    }
}

package com.chad.newsappmvvm.UI;

import android.view.View;

import androidx.annotation.NonNull;

import com.chad.newsappmvvm.data.model.News;
import com.chad.newsappmvvm.databinding.NewsItemImageBinding;
import com.chad.newsappmvvm.databinding.NewsItemTextBinding;

public class ImageViewHolder extends BaseViewHolder {

    NewsItemImageBinding newsItemImageBinding;

    public ImageViewHolder(@NonNull NewsItemImageBinding newsItemImageBinding) {
        super(newsItemImageBinding.getRoot());
        this.newsItemImageBinding = newsItemImageBinding;
    }

    @Override
    public void bindData(News news) {
        newsItemImageBinding.setNewsItemImage(news);
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

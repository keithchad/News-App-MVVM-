package com.chad.newsappmvvm.UI;

import android.view.View;

import androidx.annotation.NonNull;

import com.chad.newsappmvvm.data.model.News;
import com.chad.newsappmvvm.databinding.NewsItemImageBinding;
import com.chad.newsappmvvm.databinding.NewsItemTextBinding;

public class TextViewHolder extends BaseViewHolder {

    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(News news) {

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

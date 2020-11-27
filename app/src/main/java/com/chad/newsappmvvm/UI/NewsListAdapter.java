package com.chad.newsappmvvm.UI;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.chad.newsappmvvm.R;
import com.chad.newsappmvvm.constants.Constants;
import com.chad.newsappmvvm.data.model.News;
import com.chad.newsappmvvm.databinding.NewsItemImageBinding;
import com.chad.newsappmvvm.databinding.NewsItemTextBinding;

public class NewsListAdapter extends ListAdapter<News, BaseViewHolder> {

    OnNewsItemClickEvent itemClickEvent;

    public interface OnNewsItemClickEvent {
        void onItemTextClick();
        void onItemImageClick();
        void onItemLongClick();
    }

    public void setOnNewsItemClickListener(OnNewsItemClickEvent listener) {
        this.itemClickEvent = listener;
    }

    protected NewsListAdapter(@NonNull DiffUtil.ItemCallback<News> diffCallback) {
        super(diffCallback);
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {
            case Constants.VIEW_TYPE_NEWS_TEXT:
                NewsItemTextBinding newsItemTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.news_item_text, parent, false);
                return new TextViewHolder(newsItemTextBinding);
            case Constants.VIEW_TYPE_NEWS_IMAGE:
                NewsItemImageBinding newsItemImageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.news_item_image, parent, false);
                return new ImageViewHolder(newsItemImageBinding);
            default:
                NewsItemTextBinding defaultNewsItemTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.news_item_text, parent, false);
                return new TextViewHolder(defaultNewsItemTextBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bindData(getItem(position));
    }
}

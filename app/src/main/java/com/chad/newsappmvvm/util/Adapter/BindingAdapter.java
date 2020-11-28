package com.chad.newsappmvvm.util.Adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.newsappmvvm.R;

public class BindingAdapter {

    @androidx.databinding.BindingAdapter("glide_url")
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    @androidx.databinding.BindingAdapter("glide_circular")
    public static void loadUserImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).circleCrop().into(imageView);
    }

    @androidx.databinding.BindingAdapter("set_background")
    public static void setBackground(ImageView imageView, String color) {

        switch (color) {
            case "RED" :
                imageView.setBackgroundColor(
                        imageView.getContext().getResources().getColor(R.color.colorRed));
                break;
            case "BLACK" :
                imageView.setBackgroundColor(
                        imageView.getContext().getResources().getColor(R.color.colorBlackBackground));
                break;
            case "YELLOW" :
                imageView.setBackgroundColor(
                        imageView.getContext().getResources().getColor(R.color.colorYellow));
                break;
            case "BLUE" :
                imageView.setBackgroundColor(
                        imageView.getContext().getResources().getColor(R.color.colorBlue));
                break;
            case "PURPLE" :
                imageView.setBackgroundColor(
                        imageView.getContext().getResources().getColor(R.color.colorPurple));
                break;
            default:
                imageView.setBackgroundColor(imageView.getContext().getResources().getColor(R.color.colorRed));
        }
    }
}

package com.chad.newsappmvvm.data.model;

import java.util.Date;

public class News {

    int id;
    String title;
    String userName;
    String newsImage;
    String userImage;
    String content;
    String backgroundColor;
    Date dateCreation;
    int viewType = 0;
    String videoUrl;
    boolean isFav = false;

    public News() {}

    public News(int id, String title, String userName, String newsImage, String userImage, String content, String backgroundColor, Date dateCreation, int viewType, String videoUrl, boolean isFav) {
        this.id = id;
        this.title = title;
        this.userName = userName;
        this.newsImage = newsImage;
        this.userImage = userImage;
        this.content = content;
        this.backgroundColor = backgroundColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
        this.videoUrl = videoUrl;
        this.isFav = isFav;
    }

    public News(int id, String title, String userName, String newsImage, String userImage, String content, String backgroundColor, Date dateCreation, int viewType) {
        this.id = id;
        this.title = title;
        this.userName = userName;
        this.newsImage = newsImage;
        this.userImage = userImage;
        this.content = content;
        this.backgroundColor = backgroundColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userName='" + userName + '\'' +
                ", newsImage='" + newsImage + '\'' +
                ", userImage='" + userImage + '\'' +
                ", content='" + content + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", dateCreation=" + dateCreation +
                ", viewType=" + viewType +
                ", videoUrl='" + videoUrl + '\'' +
                ", isFav=" + isFav +
                '}';
    }
}

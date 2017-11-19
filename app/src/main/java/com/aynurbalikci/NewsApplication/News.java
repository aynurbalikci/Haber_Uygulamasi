package com.aynurbalikci.NewsApplication;

/**
 * Created by Hafta_Sonu on 1.07.2017.
 */

public class News {
    String id;
    String category;
    String title;
    String desc;
    String image;
    String pubdate;
    String link;

    public News(String id, String category, String title, String image, String desc, String pubdate, String link) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.image = image;
        this.desc = desc;
        this.pubdate = pubdate;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

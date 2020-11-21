package com.sc.spring.entity;

import java.util.Arrays;

/**
 * 类名：Book
 * 描述：一段话描述类的信息
 * 作者：邹世龙
 * 日期：2020/11/11 23:11
 * 版本：V1.0
 */
public class Book {
    private String title;
    private String desc;
    private String by;
    private String url;
    private String[] tags;
    private float likes;

    public Book() {
    }

    public Book(String title, String desc, String by, String url, String[] tags, float likes) {
        this.title = title;
        this.desc = desc;
        this.by = by;
        this.url = url;
        this.tags = tags;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public float getLikes() {
        return likes;
    }

    public void setLikes(float likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", by='" + by + '\'' +
                ", url='" + url + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", likes=" + likes +
                '}';
    }
}

package com.example.android.tourdeantigua;

public class Custom {
    private int description;
    private int imageResourceId;
    private boolean hasImage;
    private String url;
    private String geo;

    public Custom(int description, int imageResourceId, String url, String geo) {
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.url = url;
        this.geo = geo;
        this.hasImage = true;
    }

    public int getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getUrl() {
        return url;
    }

    public String getGeo() {
        return geo;
    }

    public boolean hasImage() {
        return hasImage;
    }
}

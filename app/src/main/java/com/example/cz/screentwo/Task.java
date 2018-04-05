package com.example.cz.screentwo;

/**
 * Created by CZ on 2018/4/5.
 */

public class Task {
    private String name;
    private int imageId;

    public Task(String name, int imageId) {
        this.name = name; this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

}

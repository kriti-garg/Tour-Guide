package com.kriti.patialatourguide;

class Location {
    private final String heading;
    private int imageResId = NO_IMAGE_PROVIDED;
    private final String info;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String h, String i) {
        heading = h;
        info = i;
    }

    public Location(String h, int resId, String i) {
        heading = h;
        imageResId = resId;
        info = i;
    }

    public String getHeading() {
        return heading;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getInfo() {
        return info;
    }

    public boolean hasImage() {
        return imageResId != NO_IMAGE_PROVIDED;
    }
}

package org.example.domain;

class Page {
    private static final int MAX_PHOTOS = 4;
    private final Photo[] photos = new Photo[MAX_PHOTOS];
    private int count = 0;

    boolean addPhoto(Photo p) {
        if (count < MAX_PHOTOS) {
            photos[count++] = p;
            return true;
        }
        return false;
    }

    int getPhotoCount() { return count; }

    String getPhotoNameAt(int index) {
        if (index >= 0 && index < count) return photos[index].getName();
        return null;
    }

}

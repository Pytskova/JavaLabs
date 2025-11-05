package org.example.domain;

public class PhotoAlbum {
    private static final int MAX_PAGES = 100;
    private static final int PHOTOS_PER_PAGE = 4;

    private final String title;
    private final Page[] pages = new Page[MAX_PAGES];
    private int photosAdded = 0;

    public PhotoAlbum(String title) {
        this.title = title;

        for (int i = 0; i < MAX_PAGES; i++) {
            pages[i] = new Page();
        }
    }

    public void addPhoto(Photo photo) {
        int pageIndex = photosAdded / PHOTOS_PER_PAGE;
        if (pageIndex >= MAX_PAGES) {
            System.out.println(
                    "Альбом переполнен: достигнут лимит страниц " + MAX_PAGES +
                            (photo != null ? (". Фото \"" + photo.getName() + "\" не добавлено.") : ".")
            );
            return;
        }
        pages[pageIndex].addPhoto(photo);
        photosAdded++;
    }

    public int getTotalPhotos() { return photosAdded; }
    public String getTitle() { return title; }

    public int getPagesCount() {
        if (photosAdded == 0) return 0;
        return Math.min(MAX_PAGES, (photosAdded + PHOTOS_PER_PAGE - 1) / PHOTOS_PER_PAGE);
    }


    public void printPhotoNamesWithPages() {
        int pagesUsed = getPagesCount();
        for (int i = 0; i < pagesUsed; i++) {
            Page pg = pages[i];
            for (int j = 0; j < pg.getPhotoCount(); j++) {
                String name = pg.getPhotoNameAt(j);
                System.out.println(name + " — страница " + (i + 1));
            }
        }
    }
}

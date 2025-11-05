package org.example.app;

import org.example.domain.Photo;
import org.example.domain.PhotoAlbum;

public class AlbumApp {
    public static void main(String[] args) {
        PhotoAlbum album = new PhotoAlbum("Мой отпуск");

        Photo p1 = new Photo("Море");
        Photo p2 = new Photo("Горы");
        Photo p3 = new Photo("Закат");
        Photo p4 = new Photo("Друзья");
        Photo p5 = new Photo("Кафе");
        p5.setName("Кафе у моря");


        album.addPhoto(p1);
        album.addPhoto(p2);
        album.addPhoto(p3);
        album.addPhoto(p4);
        album.addPhoto(p5);

        System.out.println("Фотоальбом: " + album.getTitle());
        System.out.println("Страниц: " + album.getPagesCount());
        System.out.println("Фотографий всего: " + album.getTotalPhotos());

        System.out.println("\nФото и на каких они страницах:");
        album.printPhotoNamesWithPages();

    }
}

package codegym.entity;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_song")
    private String nameSong;
    private String author;
    private String category;
    private String path;

    public Song() {
    }

    public Song(int id, String nameSong, String author, String category, String path) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.category = category;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getPath() {
        return path;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

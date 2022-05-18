package codegym.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @Column(name = "song_id")
    private int id;
    @Column(name = "name_song")
    private String nameSong;
    private String author;
    private String category;

    public Song(int id, String nameSong, String author, String category) {
        this.id = id;
        this.nameSong = nameSong;
        this.author = author;
        this.category = category;
    }

    public Song() {
    }


    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package codegym.service;

import codegym.entity.Song;

import java.util.List;

public interface SongService {
    void create(Song song);
    void delete(int id);
    void update(Song song);
    List<Song> findAll();
    Song findById(int id);
}

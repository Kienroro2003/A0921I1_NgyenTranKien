package codegym.repository;

import codegym.entity.Song;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface SongRepository {
    void create(Song song);
    void delete(int id);
    void update(Song song);
    List<Song> findAll();
    Song findById(int id);
}

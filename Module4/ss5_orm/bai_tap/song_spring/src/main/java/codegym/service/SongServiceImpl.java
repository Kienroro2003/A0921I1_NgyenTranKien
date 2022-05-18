package codegym.service;

import codegym.entity.Song;
import codegym.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Autowired
    private SongRepository songRepository;

    @Override
    public void create(Song song) {
        songRepository.create(song);
    }

    @Override
    public void delete(int id) {
        songRepository.delete(id);

    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }
}

package codegym.repository;

import codegym.entity.Song;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SongRepositoryImpl implements SongRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Song song) {
        entityManager.persist(song);
    }

    @Override
    public void delete(int id) {
        Song song = findById(id);
        entityManager.remove(song);
    }

    @Override
    public void update(Song song) {
        entityManager.merge(song);
    }

    @Override
    public List<Song> findAll() {
        return entityManager.createQuery("select s from Song s").getResultList();
    }

    @Override
    public Song findById(int id) {
        return entityManager.find(Song.class,id);
    }
}

package codegym.repository;

import codegym.model.Letter;

import java.util.List;

public interface ILetterRepository {
    Letter findById(int id);
    List<Letter> findAll();
    void update(Letter letter);
}

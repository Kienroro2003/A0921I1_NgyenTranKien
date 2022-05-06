package codegym.service;

import codegym.model.Letter;

import java.util.List;

public interface ILetterService {
    Letter findById(int id);
    List<Letter> findAll();
    void update(Letter letter);
}

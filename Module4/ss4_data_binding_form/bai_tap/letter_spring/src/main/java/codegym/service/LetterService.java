package codegym.service;

import codegym.model.Letter;
import codegym.repository.ILetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterService implements ILetterService {
    @Autowired
    private ILetterRepository letterRepository;

    @Override
    public Letter findById(int id) {
        return letterRepository.findById(id);
    }

    @Override
    public List<Letter> findAll() {
        return letterRepository.findAll();
    }

    @Override
    public void update(Letter letter) {
        letterRepository.update(letter);
    }
}

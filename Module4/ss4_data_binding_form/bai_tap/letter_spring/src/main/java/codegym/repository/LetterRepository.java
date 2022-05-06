package codegym.repository;

import codegym.model.Letter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class LetterRepository implements ILetterRepository {
    private static Map<Integer, Letter> letters = new HashMap<>();

    static {
        letters.put(1, new Letter(1, "English", 25, false, "Thor: King, Asgard"));
    }

    @Override
    public Letter findById(int id) {
        return letters.get(id);
    }

    @Override
    public List<Letter> findAll() {
        return new ArrayList<>(letters.values());
    }

    @Override
    public void update(Letter letter) {
        letters.put(letter.getId(), letter);
    }
}

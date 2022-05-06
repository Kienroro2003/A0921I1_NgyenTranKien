package codegym.formatter;

import codegym.model.Letter;
import codegym.service.ILetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class LetterFormatter implements Formatter<Letter> {
    @Autowired
    private ILetterService  letterService;
    @Override
    public Letter parse(String text, Locale locale) throws ParseException {
        return letterService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Letter object, Locale locale) {
        return object.toString();
    }
}

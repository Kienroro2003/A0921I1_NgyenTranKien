package codegym.formatter;

import codegym.entity.Song;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class SongFormatter implements Formatter<Song> {
    @Override
    public Song parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Song object, Locale locale) {
        return null;
    }
}

package codegym.formatter;

import codegym.entity.Song;
import codegym.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class SongFormatter implements Formatter<Song> {
    @Autowired
    private SongService songService;
    @Override
    public Song parse(String text, Locale locale) throws ParseException {
        return songService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Song object, Locale locale) {
        return object.toString();
    }
}

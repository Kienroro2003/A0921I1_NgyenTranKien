package codegym.formatter;

import codegym.entity.Declaration;
import codegym.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class DeclarationFormatter implements Formatter<Declaration> {
    @Autowired
    private DeclarationService declarationService;
    @Override
    public Declaration parse(String text, Locale locale) throws ParseException {
        return declarationService.findByName(text);
    }

    @Override
    public String print(Declaration object, Locale locale) {
        return object.toString();
    }
}

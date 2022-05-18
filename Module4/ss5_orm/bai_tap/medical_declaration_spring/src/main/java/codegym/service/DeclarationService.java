package codegym.service;

import codegym.entity.Declaration;

import java.util.List;

public interface DeclarationService {
    List<Declaration> findAll();
    void create(Declaration declaration);
    Declaration findByName(String name);
    void update(Declaration declaration);
}

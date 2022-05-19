package codegym.service;

import codegym.entity.Declaration;
import codegym.repository.DeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationServiceImpl implements DeclarationService{
    @Autowired
    private DeclarationRepository declarationRepository;
    @Override
    public List<Declaration> findAll() {
        return declarationRepository.findAll();
    }

    @Override
    public void create(Declaration declaration) {
        declarationRepository.create(declaration);
    }

    @Override
    public Declaration findByName(String name) {
        return declarationRepository.findByName(name);
    }

    @Override
    public void update(Declaration declaration) {
        declarationRepository.update(declaration);
    }
}

package codegym.repository;

import codegym.entity.Declaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DeclarationRepositoryImpl implements DeclarationRepository{
    private static Map<String,Declaration> declarationMap = new HashMap<>();



    static {
        declarationMap.put("kien1",new Declaration("kien1","2003-01-01","Male","Quảng Nam","123","Ô tô","2022-05-18","2022-05-20","hello"));
        declarationMap.put("kien2",new Declaration("kien2","2003-01-01","Male","Quảng Nam","123","Ô tô","2022-05-18","2022-05-20","hello"));
        declarationMap.put("kien3",new Declaration("kien3","2003-01-01","Male","Quảng Nam","123","Ô tô","2022-05-18","2022-05-20","hello"));
        declarationMap.put("kien4",new Declaration("kien4","2003-01-01","Male","Quảng Nam","123","Ô tô","2022-05-18","2022-05-20","hello"));
    }

    @Override
    public List<Declaration> findAll() {
        return new ArrayList<>(declarationMap.values());
    }

    @Override
    public void create(Declaration declaration) {
        declarationMap.put(declaration.getFullName(),declaration);
    }

    @Override
    public Declaration findByName(String name) {
        return declarationMap.get(name);
    }

    @Override
    public void update(Declaration declaration) {
        declarationMap.put(declaration.getFullName(),declaration);
    }
}

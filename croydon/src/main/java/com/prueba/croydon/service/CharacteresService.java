package com.prueba.croydon.service;

import com.prueba.croydon.model.CharacteresModel;
import com.prueba.croydon.repository.CharacteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharacteresService {

    @Autowired
    private CharacteresRepository repository;

    public CharacteresModel saveCharacter(CharacteresModel characteres){
        return repository.save(characteres);
    }

    public Optional<CharacteresModel> findById(Integer id){
        return  repository.findById(id);
    }

    public void deleteCharacter(CharacteresModel id){
        repository.delete(id);
    }

    public List<CharacteresModel> getAll(){
        return repository.findAll();
    }
}

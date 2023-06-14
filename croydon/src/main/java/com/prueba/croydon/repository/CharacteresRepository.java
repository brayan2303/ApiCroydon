package com.prueba.croydon.repository;

import com.prueba.croydon.model.CharacteresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacteresRepository extends JpaRepository<CharacteresModel, Integer> {
}

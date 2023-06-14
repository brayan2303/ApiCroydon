package com.prueba.croydon.service.impl;

import com.prueba.croydon.entity.CharacteresDto;
import com.prueba.croydon.model.CharacteresModel;
import com.prueba.croydon.model.ResponseModel;
import com.prueba.croydon.service.CharacteresService;
import com.prueba.croydon.util.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacteresServiceImpl {

    @Autowired
    private CharacteresService service;

    public ResponseModel save(CharacteresDto dto){
        CharacteresModel response = null;
        CharacteresModel request = null;
        if(dto != null && !dto.toString().isEmpty()){
            request = this.character(dto);
            response = service.saveCharacter(request);
            return new ResponseModel(getClass().getSimpleName(), "OK", response, 201);
        }else {
            return new ResponseModel(getClass().getSimpleName(), Consts.ERROR_PERSONAJE_C, null, 204);
        }
    }


    public ResponseModel edit(CharacteresDto dto){
        CharacteresModel model = new CharacteresModel();
        if(!service.findById(dto.getId()).isPresent()){
            return new ResponseModel(getClass().getSimpleName(), Consts.ERROR_PERSONAJE_E, null, 204);
        }else{
            Optional<CharacteresModel> characteresModel = service.findById(dto.getId());
            if(dto.getId() == null){
                model.setId(characteresModel.get().getId());
            }else{
                model.setId(dto.getId());
            }
            if(dto.getName() == null){
                model.setName(characteresModel.get().getName());
            }else{
                model.setName(dto.getName());
            }
            if(dto.getTvShow() == null){
                model.setTvShow(characteresModel.get().getTvShow());
            }else{
                model.setTvShow(dto.getTvShow());
            }
            if(dto.getDisneyApiId() == null){
                model.setDisneyApiId(characteresModel.get().getDisneyApiId());
            }else{
                model.setDisneyApiId(dto.getDisneyApiId());
            }
            if(dto.getUrl() == null){
                model.setUrl(characteresModel.get().getUrl());
            }else{
                model.setUrl(dto.getUrl());
            }
            service.saveCharacter(model);
        }
        return new ResponseModel(getClass().getSimpleName(), "OK", model, 201);
    }


    public ResponseModel delete(Integer id){
        CharacteresModel request = null;
        if(id != null && !id.toString().isEmpty()){
            Optional<CharacteresModel> response = service.findById(id);
            request = this.characterDelete(response);
            service.deleteCharacter(request);
            return new ResponseModel(getClass().getSimpleName(), Consts.BORRADO, null, 201);
        }else{

            return new ResponseModel(getClass().getSimpleName(), Consts.ERROR_PERSONAJE_D, null, 204);
        }
    }

    public ResponseModel getAll(){
        List<CharacteresModel> response = null;
        response = service.getAll();
        if(response !=null){
            return new ResponseModel(getClass().getSimpleName(), "OK", response, 201);
        }else{

            return new ResponseModel(getClass().getSimpleName(), Consts.ERROR_LISTAR, null, 204);
        }
    }

    public ResponseModel findById(Integer id){
        Optional<CharacteresModel> response = service.findById(id);
        if(response.isPresent()){
            return new ResponseModel(getClass().getSimpleName(), "OK", response, 201);
        }else{
            return new ResponseModel(getClass().getSimpleName(), Consts.ERROR_ID, null, 201);
        }
    }

    public  CharacteresModel character(CharacteresDto dto){
        CharacteresModel response = new CharacteresModel();
        response.setId(dto.getId());
        response.setName(dto.getName());
        response.setTvShow(dto.getTvShow());
        response.setDisneyApiId(dto.getDisneyApiId());
        response.setUrl(dto.getUrl());
        return response;
    }

    public  CharacteresModel characterDelete(Optional<CharacteresModel> dto){
        CharacteresModel response = new CharacteresModel();
        response.setId(dto.get().getId());
        response.setName(dto.get().getName());
        response.setTvShow(dto.get().getTvShow());
        response.setDisneyApiId(dto.get().getDisneyApiId());
        response.setUrl(dto.get().getUrl());
        return response;
    }
}

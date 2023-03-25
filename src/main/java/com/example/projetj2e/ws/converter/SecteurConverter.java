package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Secteur;
import com.example.projetj2e.ws.dto.SecteurDto;
import org.springframework.stereotype.Component;

@Component
public class SecteurConverter  extends  AbstractConverter<Secteur, SecteurDto>{

    @Override
    public SecteurDto toDto(Secteur item) {
        SecteurDto secteurDto=null;
        if(item!=null){
            secteurDto = new SecteurDto();
            secteurDto.setId(item.getId());
            secteurDto.setCode(item.getCode());
            secteurDto.setLibelle(item.getLibelle());
        }
        return secteurDto;
    }

    @Override
    public Secteur toItem(SecteurDto dto) {
        Secteur secteur=null;
        if(dto!=null){
            secteur=new Secteur();
            secteur.setId(dto.getId());
            secteur.setCode(dto.getCode());
            secteur.setLibelle(dto.getLibelle());

        }
        return secteur;
    }
}

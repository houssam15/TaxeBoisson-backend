package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.bean.CategorieRedevable;
import com.example.projetj2e.ws.dto.CategorieDeLocalDto;
import com.example.projetj2e.ws.dto.CategorieRedevableDto;
import org.springframework.stereotype.Component;

@Component
public class CategorieRedevableConverter  extends AbstractConverter<CategorieRedevable, CategorieRedevableDto>{

    @Override
    public CategorieRedevableDto toDto(CategorieRedevable item) {
        CategorieRedevableDto dto = null;
        if(item!=null){
            dto = new CategorieRedevableDto();
            dto.setId(item.getId());
            dto.setCode(item.getCode());
            dto.setLibelle(item.getLibelle());

        }
        return dto;
    }

    @Override
    public CategorieRedevable toItem(CategorieRedevableDto dto) {
        CategorieRedevable item =null;
        if(dto!=null){
            item = new CategorieRedevable();
            item.setId(dto.getId());
            item.setCode(dto.getCode());
            item.setLibelle(dto.getLibelle());

        }

        return item;
    }
}

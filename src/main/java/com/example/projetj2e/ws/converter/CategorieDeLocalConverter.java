package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.ws.dto.CategorieDeLocalDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class CategorieDeLocalConverter extends AbstractConverter<CategorieDeLocal, CategorieDeLocalDto>{
    @Override
    public CategorieDeLocalDto toDto(CategorieDeLocal item) {
        CategorieDeLocalDto dto=null;
        if(item!=null){
            dto = new CategorieDeLocalDto();
            dto.setId(item.getId());
            dto.setCode(item.getCode());
            dto.setLibelle(item.getLibelle());

        }
        return dto;
    }

    @Override
    public CategorieDeLocal toItem(CategorieDeLocalDto dto) {
        CategorieDeLocal item=null;
        if (dto != null) {
            item = new CategorieDeLocal();
            item.setId(dto.getId());
            item.setCode(dto.getCode());
            item.setLibelle(dto.getLibelle());
        }
       return item;
        }


}

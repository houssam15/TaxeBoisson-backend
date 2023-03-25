package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.ws.dto.LocalDto;
import com.example.projetj2e.ws.dto.RedevableDto;
import org.springframework.stereotype.Component;

@Component
public class LocalConverter extends AbstractConverter<Local, LocalDto>{
    @Override
    public LocalDto toDto(Local item) {
        LocalDto  dto=null;
        if (item != null){
            dto= new LocalDto();
            dto.setId(item.getId());
            dto.setRedevable(item.getRedevable());
            dto.setCategorieDeLocal(item.getCategorieDeLocal());
            dto.setRue(item.getRue());
            dto.setReference(item.getReference());
            dto.setDateAjoutDeLocal(item.getDateAjoutDeLocal());
            dto.setDernierDatePayAnnuel(item.getDernierDatePayAnnuel());
            dto.setDernierDatePayTrimestriel(item.getDernierDatePayTrimestriel());
        }
        return  dto;
    }

    @Override
    public Local toItem(LocalDto localDto) {
        Local item = null;
        if (localDto != null){
            item= new Local();
            item.setId(localDto.getId());
            item.setRedevable(localDto.getRedevable());
            item.setCategorieDeLocal(localDto.getCategorieDeLocal());
            item.setRue(localDto.getRue());
            item.setReference(localDto.getReference());
            item.setDateAjoutDeLocal(localDto.getDateAjoutDeLocal());
            item.setDernierDatePayTrimestriel(localDto.getDernierDatePayTrimestriel());
            item.setDernierDatePayAnnuel(localDto.getDernierDatePayAnnuel());
        }
        return  item;
    }
}

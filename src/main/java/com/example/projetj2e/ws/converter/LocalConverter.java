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
        //RedevableDto dto = null;
        if (item != null){
            dto= new LocalDto();
            dto.setId(item.getId());
            dto.setReference(item.getReference());
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
            item.setReference(localDto.getReference());
            item.setDernierDatePayTrimestriel(localDto.getDernierDatePayTrimestriel());
            item.setDernierDatePayAnnuel(localDto.getDernierDatePayAnnuel());
        }
        return  item;
    }
}

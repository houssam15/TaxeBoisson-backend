package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.TauxTaxeAnnuel;
import com.example.projetj2e.ws.dto.TauxTaxeAnnuelDto;
import org.springframework.stereotype.Component;

@Component
public class TauxTaxeAnnuelConverter extends AbstractConverter<TauxTaxeAnnuel,TauxTaxeAnnuelDto>{

    @Override
    public TauxTaxeAnnuelDto toDto(TauxTaxeAnnuel item) {
        TauxTaxeAnnuelDto dto= null;
        if (item!=null){
            dto=new TauxTaxeAnnuelDto();
            dto.setId(item.getId());
            dto.setReference(item.getReference());
            dto.setPremierMoisRetard(item.getPourcentagePremierMoisRetard());
            dto.setAutreMoisRetard(item.getPourcentageAutreMoisRetard());
            dto.setPremierMoisRetard(item.getPremierMoisRetard());
            dto.setAutreMoisRetard(item.getAutreMoisRetard());
            dto.setDateAppMax(item.getDateAppMax());
            dto.setDateAppMin(item.getDateAppMin());
            dto.setCategorieDeLocal(item.getCategorieDeLocal());
        }
        return dto;
    }

    @Override
    public TauxTaxeAnnuel toItem(TauxTaxeAnnuelDto dto) {
        TauxTaxeAnnuel item = null;
        if (dto != null) {
            item = new TauxTaxeAnnuel();
            item.setId(dto.getId());
            item.setReference(dto.getReference());
            item.setPremierMoisRetard(dto.getPremierMoisRetard());
            item.setAutreMoisRetard(dto.getAutreMoisRetard());
            item.setPremierMoisRetard(dto.getPremierMoisRetard());
            item.setAutreMoisRetard(dto.getAutreMoisRetard());
            item.setDateAppMax(dto.getDateAppMax());
            item.setDateAppMin(dto.getDateAppMin());
            item.setCategorieDeLocal(dto.getCategorieDeLocal());
        }
        return item;
    }
}
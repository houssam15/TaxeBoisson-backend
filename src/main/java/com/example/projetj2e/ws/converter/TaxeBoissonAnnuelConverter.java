package com.example.projetj2e.ws.converter;

import com.example.projetj2e.bean.TaxeBoissonAnnuel;
import com.example.projetj2e.ws.dto.TaxeBoisssonAnnuelDto;
import org.springframework.stereotype.Component;

@Component
public class TaxeBoissonAnnuelConverter extends AbstractConverter<TaxeBoissonAnnuel,TaxeBoisssonAnnuelDto>{


    @Override
    public TaxeBoisssonAnnuelDto toDto(TaxeBoissonAnnuel item) {
        TaxeBoisssonAnnuelDto dto =null;
        if (item != null){
            dto.setId(item.getId());
            dto.setReference(item.getReference());
            dto.setLocal(item.getLocal());
            dto.setRedevable(item.getRedevable());
            dto.setTauxTaxeAnnuel(item.getTauxTaxeAnnuel());
            dto.setCategorieDeLocal(item.getCategorieDeLocal());
            dto.setMontantTotal(item.getMontantTotal());
            dto.setChifrreAffaireAnnuel(item.getChifrreAffaireAnnuel());
            dto.setMoisRetard(item.getMoisRetard());
            dto.setMontantRetardPremierMois(item.getMontantRetardPremierMois());
            dto.setMontantRetardAutreMois(item.getMontantRetardAutreMois());
        }
        return dto;
    }

    @Override
    public TaxeBoissonAnnuel toItem(TaxeBoisssonAnnuelDto dto) {
        TaxeBoissonAnnuel item =null;
        if (dto != null){
            item.setId(dto.getId());
            item.setReference(dto.getReference());
            item.setLocal(dto.getLocal());
            item.setRedevable(dto.getRedevable());
            item.setTauxTaxeAnnuel(dto.getTauxTaxeAnnuel());
            item.setCategorieDeLocal(dto.getCategorieDeLocal());
            item.setMontantTotal(dto.getMontantTotal());
            item.setChifrreAffaireAnnuel(dto.getChifrreAffaireAnnuel());
            item.setMoisRetard(dto.getMoisRetard());
            item.setMontantRetardPremierMois(dto.getMontantRetardPremierMois());
            item.setMontantRetardAutreMois(dto.getMontantRetardAutreMois());
        }
        return item;
    }
}
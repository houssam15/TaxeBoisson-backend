package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.TauxTaxeAnnuel;
import com.example.projetj2e.service.facade.TauxTaxeAnnuelService;
import com.example.projetj2e.ws.converter.TauxTaxeAnnuelConverter;
import com.example.projetj2e.ws.dto.TauxTaxeAnnuelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/TauxTaxeAnnuel")
public class TauxTaxeAnnuelRest {
    public TauxTaxeAnnuel findByReference(@PathVariable String reference) {
        return tauxTaxeAnnuelService.findByReference(reference);
    }
    @GetMapping("/code/{code}/date/{date}")
    public TauxTaxeAnnuelDto findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(@PathVariable String code,@PathVariable Date date) {
        TauxTaxeAnnuel tauxTaxeAnnuel=tauxTaxeAnnuelService.findByCategorieDeLocalCodeAndDateAppMinGreaterThanAndDateAppMaxLessThan(code, date);
        TauxTaxeAnnuelDto tauxTaxeAnnuelDto=tauxTaxeAnnuelConverter.toDto(tauxTaxeAnnuel);
        return tauxTaxeAnnuelDto;
    }
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return tauxTaxeAnnuelService.deleteByReference(reference);
    }
    @PostMapping("/")
    public int save(@RequestBody TauxTaxeAnnuelDto dto) {
        TauxTaxeAnnuel tauxTaxeAnnuel = tauxTaxeAnnuelConverter.toItem(dto);
        return tauxTaxeAnnuelService.save(tauxTaxeAnnuel);
    }
    @GetMapping("/")
    public List<TauxTaxeAnnuelDto> findAll() {
        return tauxTaxeAnnuelConverter.toDto(tauxTaxeAnnuelService.findAll());
    }

    @Autowired
    TauxTaxeAnnuelService tauxTaxeAnnuelService;
    @Autowired
    TauxTaxeAnnuelConverter tauxTaxeAnnuelConverter;
}
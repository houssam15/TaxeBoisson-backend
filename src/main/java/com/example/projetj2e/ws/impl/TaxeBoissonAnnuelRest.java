package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.TaxeBoissonAnnuel;
import com.example.projetj2e.service.facade.TaxeBoissonAnnuelService;
import com.example.projetj2e.ws.converter.TaxeBoissonAnnuelConverter;
import com.example.projetj2e.ws.dto.TaxeBoisssonAnnuelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/TaxeBoissonAnnuel")
public class TaxeBoissonAnnuelRest {
    @GetMapping("/reference/{reference}")
    public TaxeBoisssonAnnuelDto findByReference(@PathVariable String reference) {
        TaxeBoisssonAnnuelDto taxeBoisssonAnnuelDto=taxeBoissonAnnuelConverter.toDto(taxeBoissonAnnuelService.findByReference(reference));
        return taxeBoisssonAnnuelDto;
    }
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return taxeBoissonAnnuelService.deleteByReference(reference);
    }
    @GetMapping("/")
    public List<TaxeBoisssonAnnuelDto> findAll() {
        return taxeBoissonAnnuelConverter.toDto(taxeBoissonAnnuelService.findAll());
    }
    @PostMapping("/")
    public int save(@RequestBody TaxeBoisssonAnnuelDto dto) {
        TaxeBoissonAnnuel taxeBoissonAnnuel = taxeBoissonAnnuelConverter.toItem(dto);
        return taxeBoissonAnnuelService.save(taxeBoissonAnnuel);
    }

    @Autowired
    TaxeBoissonAnnuelService taxeBoissonAnnuelService;
    @Autowired
    TaxeBoissonAnnuelConverter taxeBoissonAnnuelConverter;
}
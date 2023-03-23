package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Redevable;
import com.example.projetj2e.service.facade.RedevableService;
import com.example.projetj2e.service.facade.RedevableService;
import com.example.projetj2e.ws.converter.RedevableConverter;
import com.example.projetj2e.ws.dto.RedevableDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//save work

@RestController
@RequestMapping("api/v1/redevable")

public class RedevableRest {
    @Autowired
    private RedevableService redevableService;
    @Autowired
    RedevableConverter redevableConverter;
    @GetMapping("/cin/{cin}")
    public RedevableDto findByCin(@PathVariable String cin) {
        Redevable redevable=redevableService.findByCin(cin);
        RedevableDto redevableDto= redevableConverter.toDto(redevable);
        return redevableDto;
    }
    @DeleteMapping("/cin/{cin}")
    public  int deleteByCin(@PathVariable String cin){
        return redevableService.deleteByCin(cin);
    }
    @GetMapping("/id/{id}")
    public RedevableDto getOne(@PathVariable Long id) {
        Redevable redevable = redevableService.getOne(id);
         RedevableDto redevableDto= redevableConverter.toDto(redevable);
        return redevableDto;
    }
    @PostMapping("/")
    public int save(@RequestBody RedevableDto redevableDto) {
        Redevable redevable=redevableConverter.toItem(redevableDto);
        return redevableService.save(redevable);
    }

    @GetMapping("/")
    public List<RedevableDto> findAll() {
        List<Redevable> redevables = redevableService.findAll();
        List<RedevableDto> redevableDtos = redevableConverter.toDto(redevables);
        return redevableDtos;
    }

}

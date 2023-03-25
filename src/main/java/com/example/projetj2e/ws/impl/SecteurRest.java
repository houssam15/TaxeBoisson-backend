package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Secteur;
import com.example.projetj2e.service.facade.SecteurService;
import com.example.projetj2e.ws.converter.SecteurConverter;
import com.example.projetj2e.ws.dto.SecteurDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/secteur")
public class SecteurRest {
    @Autowired
    private SecteurService secteurService;
    @Autowired
    private SecteurConverter secteurConverter;
@GetMapping("/findbycode/{code}")
    public SecteurDto findByCode(@PathVariable String code) {
    Secteur secteur = secteurService.findByCode(code);
    return secteurConverter.toDto(secteur);
    }
@DeleteMapping("/deletebycode/{code}")
    public int deleteByCode(@PathVariable String code) {
        return secteurService.deleteByCode(code);
    }
    @GetMapping("/")
    public List<SecteurDto> findAll() {
        List<Secteur> items = secteurService.findAll();
        return secteurConverter.toDto(items);
    }
    @PostMapping("/")

    public int save( @RequestBody SecteurDto dto) {
    Secteur secteur = secteurConverter.toItem(dto);
        return secteurService.save(secteur);
    }
}

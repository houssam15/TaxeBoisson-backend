package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.CategorieRedevable;
import com.example.projetj2e.service.facade.CategorieRedevableService;
import com.example.projetj2e.ws.converter.CategorieRedevableConverter;
import com.example.projetj2e.ws.dto.CategorieRedevableDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//work
@RestController
@RequestMapping("/api/v1/categorieredevable")
public class CategorieRedevableRest {
    @Autowired
    private CategorieRedevableService categorieRedevableService;
    @Autowired
    private CategorieRedevableConverter categorieRedevableConverter;

    @GetMapping("/findbycode/{code}")
    public CategorieRedevableDto findByCode(@PathVariable String code) {
    CategorieRedevable item = categorieRedevableService.findByCode(code);
    return categorieRedevableConverter.toDto(item);
    }

    @Transactional
    @DeleteMapping("/findbycode/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieRedevableService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody  CategorieRedevableDto dto) {
    CategorieRedevable entity = categorieRedevableConverter.toItem(dto);
    return categorieRedevableService.save(entity);
    }
}

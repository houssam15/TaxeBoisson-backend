package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.CategorieRedevable;
import com.example.projetj2e.service.facade.CategorieRedevableService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CategorieRedevableRest {
    @Autowired
    private CategorieRedevableService categorieRedevableService;
@GetMapping("/findbycode/{code}")
    public CategorieRedevable findByCode(@PathVariable String code) {
        return categorieRedevableService.findByCode(code);
    }

    @Transactional
    @DeleteMapping("/findbycode/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieRedevableService.deleteByCode(code);
    }
    @PostMapping("/")
    public int save(@RequestBody  CategorieRedevable entity) {
        return categorieRedevableService.save(entity);
    }
}

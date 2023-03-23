package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.service.facade.CategorieDeLocalService;

import com.example.projetj2e.ws.converter.CategorieDeLocalConverter;
import com.example.projetj2e.ws.dto.CategorieDeLocalDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//save => work
//findAll =>work

@RestController
@RequestMapping("api/v1/categoriedelocal")
public class CategorieDeLocalRest {
   @Autowired
    private CategorieDeLocalService categorieDeLocalService;
   @Autowired
   private CategorieDeLocalConverter categorieDeLocalConverter;
   @GetMapping("/findbycode/{code}")
    public CategorieDeLocalDto findByCode(@PathVariable String code) {
       CategorieDeLocal categorieDeLocal = categorieDeLocalService.findByCode(code);
       return categorieDeLocalConverter.toDto(categorieDeLocal);
    }
@DeleteMapping("/deletebycode/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return categorieDeLocalService.deleteByCode(code);
    }
@GetMapping("/")
    public List<CategorieDeLocalDto> findAll() {
    List<CategorieDeLocal> items = categorieDeLocalService.findAll();
    return categorieDeLocalConverter.toDto(items);
    }
@PostMapping("/")
    public int save(@RequestBody CategorieDeLocalDto dto) {
       CategorieDeLocal entity = categorieDeLocalConverter.toItem(dto);
       return categorieDeLocalService.save(entity);
    }
}

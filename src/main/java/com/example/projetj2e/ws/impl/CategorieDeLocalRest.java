package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.CategorieDeLocal;
import com.example.projetj2e.dao.CategorieDeLocalDao;
import com.example.projetj2e.service.facade.CategorieDeLocalService;
import com.example.projetj2e.ws.converter.CategorieDeLocalConverter;
import com.example.projetj2e.ws.dto.CategorieDeLocalDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/categoriedelocal")
public class CategorieDeLocalRest {
    @Autowired
    private CategorieDeLocalService categorieDeLocalService;
@Autowired
private CategorieDeLocalConverter categorieDeLocalConverter;
    public CategorieDeLocalDto findByCode(String code) {
        CategorieDeLocal categorieDeLocal = categorieDeLocalService.findByCode(code);
        return categorieDeLocalConverter.toDto(categorieDeLocal);
    }

    @Transactional
    public int deleteByCode(String code) {
        return categorieDeLocalService.deleteByCode(code);
    }

    public List<CategorieDeLocalDto> findAll() {
        List<CategorieDeLocal> all = categorieDeLocalService.findAll();
        return categorieDeLocalConverter.toDto(all);
    }
@PostMapping("/")
    public int save(CategorieDeLocal entity) {
        return categorieDeLocalService.save(entity);
    }
}

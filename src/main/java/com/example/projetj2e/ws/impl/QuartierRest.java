package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Quartier;
import com.example.projetj2e.service.facade.QuartierService;
import com.example.projetj2e.ws.converter.QuartierConverter;
import com.example.projetj2e.ws.dto.QuartierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/quartier")
public class QuartierRest {
    @Autowired
    private QuartierService quartierService;
    @Autowired
    private QuartierConverter quartierConverter;
@GetMapping("findbycode/{code}")
    public QuartierDto findByCode(@PathVariable String code) {
        Quartier quartier = quartierService.findByCode(code);
        return quartierConverter.toDto(quartier);
    }
@DeleteMapping("deletebycode/{code}")
    public int deleteByCode(@PathVariable String code) {
        return quartierService.deleteByCode(code);
    }
@PostMapping("/")
    public int save(@RequestBody QuartierDto dto) {
        Quartier quartier = quartierConverter.toItem(dto);
        return quartierService.save(quartier);
    }
}

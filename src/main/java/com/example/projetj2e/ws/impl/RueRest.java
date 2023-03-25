package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Rue;
import com.example.projetj2e.service.facade.RueService;
import com.example.projetj2e.ws.converter.RueConverter;
import com.example.projetj2e.ws.dto.RueDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/rue")
public class RueRest {
    @Autowired
    private RueService rueService;
    @Autowired
    private RueConverter rueConverter;
@GetMapping("/findbycode/{code}")
    public RueDto findByCode(@PathVariable  String code) {
    Rue rue = rueService.findByCode(code);
    return rueConverter.toDto(rue);
    }
@DeleteMapping("/deletebycode/{code}")
    public int deleteByQuartierCode(@PathVariable String code) {
        return rueService.deleteByQuartierCode(code);
    }
@PostMapping("/")
    public int save(@RequestBody RueDto dto) {
        Rue rue = rueConverter.toItem(dto);
        return rueService.save(rue);
    }
@GetMapping("/")
    public List<RueDto> findAll() {
    List<Rue> dtos = rueService.findAll();
    return rueConverter.toDto(dtos);
    }
}

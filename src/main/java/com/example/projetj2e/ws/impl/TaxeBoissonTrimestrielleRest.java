package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.TaxeBoissonTrimestrielle;
import com.example.projetj2e.service.facade.TaxeBoissonTrimestrielleService;
import com.example.projetj2e.ws.converter.TaxeBoissonTrimestrielleConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projetj2e.ws.dto.TaxeBoissonTrimestielleDto;


import java.util.List;

@RestController
@RequestMapping("api/v1/taxetrimestrielle")
public class TaxeBoissonTrimestrielleRest {
@Autowired
    private TaxeBoissonTrimestrielleService taxeBoissonTrimestrielleService;
@GetMapping("/findbyreference/{reference}")
    public TaxeBoissonTrimestrielle findByReference(@PathVariable String reference) {
    return taxeBoissonTrimestrielleService.findByReference(reference);

}
@DeleteMapping("/deletebyreference/{reference}")
    @Transactional
    public int deleteByReference(@PathVariable String reference) {
        return taxeBoissonTrimestrielleService.deleteByReference(reference);
    }
@GetMapping("/")
    public List<TaxeBoissonTrimestrielle> findAll() {
        return taxeBoissonTrimestrielleService.findAll();
    }
@PostMapping("/")
    public int save(@RequestBody TaxeBoissonTrimestrielle entity) {
        return taxeBoissonTrimestrielleService.save(entity);
    }
}

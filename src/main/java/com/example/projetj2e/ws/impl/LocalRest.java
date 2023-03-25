package com.example.projetj2e.ws.impl;

import com.example.projetj2e.bean.Local;
import com.example.projetj2e.service.facade.LocalService;
import com.example.projetj2e.ws.converter.LocalConverter;
import com.example.projetj2e.ws.dto.LocalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/local")
public class LocalRest {
   @Autowired
   private LocalService localService;
   @Autowired
   private LocalConverter localConverter;
     @GetMapping("/reference/{reference}")
    public LocalDto findByReference(@PathVariable String reference) {
        Local local= localService.findByReference(reference);
        LocalDto localDto= localConverter.toDto(local);
        return  localDto;
    }
     @GetMapping("/findByRedevableCin/{cin}")
    public List<LocalDto> findByRedevableCin(@PathVariable String cin) {
      List<Local> locals=   localService.findByRedevableCin(cin);
      List<LocalDto> localDtos=localConverter.toDto(locals);
      return localDtos;
    }
    @DeleteMapping("/cin/{cin}")
    public int deleteByRedevableCin(@PathVariable String cin) {
        return localService.deleteByRedevableCin(cin);
    }

    @PostMapping("/")
    public int save(@RequestBody LocalDto localDto) {
        Local local= localConverter.toItem(localDto);
        return localService.save(local);
    }
@DeleteMapping("/deletebyreference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return localService.deleteByReference(reference);
    }
@GetMapping("/")
    public List<LocalDto> findAll() {
        List<Local> locals=localService.findAll();
    return localConverter.toDto(locals);
     }
}

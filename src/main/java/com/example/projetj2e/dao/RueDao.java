package com.example.projetj2e.dao;

import com.example.projetj2e.bean.Rue;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RueDao  extends JpaRepository<Rue,Long> {

       Rue findByCode(String code);
       int deleteByQuartierCode(String code);


}

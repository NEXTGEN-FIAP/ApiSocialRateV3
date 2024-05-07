package com.example.ApiSocialRateV3.service;

import com.example.ApiSocialRateV3.controller.dto.CampanhaDTO;
import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampanhaService {
    @Autowired
    private CampanhaRepository campanhaRepository;

    public Campanha cadastrarCampanha(CampanhaDTO campanhaDTO) {
        Campanha novaCampanha = new Campanha(campanhaDTO);
        return campanhaRepository.save(novaCampanha);
    }
}

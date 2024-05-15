package com.example.ApiSocialRateV3.service;

import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.model.Empresa;
import com.example.ApiSocialRateV3.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampanhaService {
    @Autowired
    private CampanhaRepository campanhaRepository;

    public Campanha listarCampanhaPeloId(Long id){
        Optional<Campanha> optionalCampanha = campanhaRepository.findById(id);
        if (optionalCampanha.isPresent()) {
            Campanha campanha = optionalCampanha.get();

            return campanha;
        } else {
            throw new IllegalArgumentException("Nao foi possivel localiza a campanha com ID: " + id);
        }
    }
}

package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {
    @Autowired
    private CampanhaService campanhaService;

    @GetMapping("{idCampanha}")
    public ResponseEntity<Campanha> getCampanhaPeloId(@PathVariable Long idCampanha){
        return ResponseEntity.ok(campanhaService.listarCampanhaPeloId(idCampanha));
    }
}

package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.controller.dto.CampanhaDTO;
import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {
    @Autowired
    private CampanhaService campanhaService;

    @PostMapping
    public ResponseEntity<Campanha> postCampanha(@RequestBody CampanhaDTO campanhaDTO){
        return ResponseEntity.ok(campanhaService.cadastrarCampanha(campanhaDTO));
    }
}

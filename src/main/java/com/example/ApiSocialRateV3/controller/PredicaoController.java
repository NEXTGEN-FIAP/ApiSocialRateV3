package com.example.ApiSocialRateV3.controller;

import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.model.Empresa;
import com.example.ApiSocialRateV3.service.CampanhaService;
import com.example.ApiSocialRateV3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/predicao")
public class PredicaoController {
    @Autowired
    private EmpresaService empresaService;
    @Autowired
    private CampanhaService campanhaService;

    @PostMapping("/{idEmpresa}/{idCampanha}")
    public ResponseEntity<String> predicaoInfluencer(@PathVariable Long idEmpresa, @PathVariable Long idCampanha) {
        String urlApiPredicao = "http://127.0.0.1:8000/modelo-predicao";

        // Recuperar a empresa e a campanha
        Empresa empresa = empresaService.listarEmpresaPeloID(idEmpresa);
        Campanha campanha = campanhaService.listarCampanhaPeloId(idCampanha);

        // Construir o JSON a ser enviado
        Map<String, Object> requestPayload = new HashMap<>();
        requestPayload.put("nicho", empresa.getNicho());
        requestPayload.put("publicoAlvoCampanha", campanha.getPublicoAlvo());
        requestPayload.put("generoPublicoAlvoCampanha", campanha.getGeneroPublivoAlvo());
        requestPayload.put("interessesDoPublico", campanha.getInteressesDoPublico());
        requestPayload.put("canalDaCampanha", campanha.getCanalDaCampanha());
        requestPayload.put("alcanceDaCampanha", campanha.getAlcanceDaCampanha());

        // Configurar o RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(requestPayload, headers);

        // Fazer a solicitação POST
        ResponseEntity<String> response = restTemplate.exchange(
                urlApiPredicao, HttpMethod.POST, requestEntity, String.class);

        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
}

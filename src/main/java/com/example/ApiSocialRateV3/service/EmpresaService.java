package com.example.ApiSocialRateV3.service;

import com.example.ApiSocialRateV3.controller.dto.CampanhaDTO;
import com.example.ApiSocialRateV3.controller.dto.EmpresaDTO;
import com.example.ApiSocialRateV3.model.Campanha;
import com.example.ApiSocialRateV3.model.Empresa;
import com.example.ApiSocialRateV3.repository.CampanhaRepository;
import com.example.ApiSocialRateV3.repository.EmpresaRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private CampanhaRepository campanhaRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public Empresa cadastrarEmpresa(@NonNull EmpresaDTO empresaDTO){
        Empresa empresa = new Empresa(empresaDTO);
        return empresaRepository.save(empresa);
    }

    public Campanha cadastrarCampanha(@NonNull CampanhaDTO campanhaDTO, Long id) {
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(id);

        if (optionalEmpresa.isPresent()) {
            Empresa empresa = optionalEmpresa.get();

            Campanha novaCampanha = new Campanha(campanhaDTO);
            campanhaRepository.save(novaCampanha);

            empresa.adicionarCampanha(novaCampanha);

            empresaRepository.save(empresa);

            return novaCampanha;
        } else {
            throw new IllegalArgumentException("Nao foi possivel localiza a empresa com ID: " + id);
        }
    }

    public void deletarEmpresaPorId(Long id){
        empresaRepository.deleteById(id);
    }

    public List<Campanha> listarCampanhasPorIdEmpresa(Long id) {
        Optional<Empresa> optionalEmpresa = empresaRepository.findById(id);
        if (optionalEmpresa.isPresent()) {
            Empresa empresa = optionalEmpresa.get();
            List<Campanha> campanhas = empresa.getCampanhas();
            return campanhas;
        } else {
            throw new IllegalArgumentException("Nao foi possivel localiza a empresa com ID: " + id);
        }
    }
}
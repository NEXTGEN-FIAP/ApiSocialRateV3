package com.example.ApiSocialRateV3.model;

import com.example.ApiSocialRateV3.controller.dto.EmpresaDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
public class Empresa {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String nicho;
    @Nullable
    @OneToMany
    @JoinColumn(name = "empresa_id")
    private List<Campanha> campanhas;

    //Construtor DTO
    public Empresa(@NonNull EmpresaDTO empresaDTO){
        this.nome = empresaDTO.getNome();
        this.email = empresaDTO.getEmail();
        this.nicho = empresaDTO.getNicho();
    }

    //Construtor Vazio
    public Empresa(){

    }

    //Metodo para adicionar Campanhas
    public void adicionarCampanha(Campanha campanha){
        campanhas.add(campanha);
    }
}

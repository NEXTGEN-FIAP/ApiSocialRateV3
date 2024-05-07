package com.example.ApiSocialRateV3.model;

import com.example.ApiSocialRateV3.controller.dto.CampanhaDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Campanha {
    @Id
    @GeneratedValue
    private Long id;
    private String publicoAlvo;
    private String generoPublivoAlvo;
    private String interessesDoPublico;
    private String canalDaCampanha;
    private String alcanceDaCampanha;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;


    // Construtor vazio
    public Campanha() {
    }

    //ConstrutorDTO
    public Campanha(CampanhaDTO campanhaDTO){
        this.publicoAlvo = campanhaDTO.getPublicoAlvo();
        this.generoPublivoAlvo = campanhaDTO.getGeneroPublivoAlvo();
        this.interessesDoPublico = campanhaDTO.getInteressesDoPublico();
        this.canalDaCampanha = campanhaDTO.getCanalDaCampanha();
        this.alcanceDaCampanha = campanhaDTO.getAlcanceDaCampanha();
    }
}

package com.example.ApiSocialRateV3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
}

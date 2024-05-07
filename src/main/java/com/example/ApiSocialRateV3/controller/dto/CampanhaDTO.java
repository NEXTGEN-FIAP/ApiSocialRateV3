package com.example.ApiSocialRateV3.controller.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class CampanhaDTO {
    @NonNull
    private String publicoAlvo;
    @NonNull
    private String generoPublivoAlvo;
    @NonNull
    private String interessesDoPublico;
    @NonNull
    private String canalDaCampanha;
    @NonNull
    private String alcanceDaCampanha;
}

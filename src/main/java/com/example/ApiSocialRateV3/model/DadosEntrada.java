package com.example.ApiSocialRateV3.model;
import lombok.Data;
@Data
public class DadosEntrada {
    private String nicho;
    private String publicoAlvoCampanha;
    private String generoPublicoAlvoCampanha;
    private String interessesDoPublico;
    private String canalDaCampanha;
    private String alcanceDaCampanha;

    //Construtor Vazio
    public DadosEntrada() {
    }

    //Construtor Cheio
    public DadosEntrada(String nicho, String publicoAlvoCampanha, String generoAlvoCampanha, String interessesDoPublico, String canalDaCampanha, String alcanceDaCampanha) {
        this.nicho = nicho;
        this.publicoAlvoCampanha = publicoAlvoCampanha;
        this.generoPublicoAlvoCampanha = generoAlvoCampanha;
        this.interessesDoPublico = interessesDoPublico;
        this.canalDaCampanha = canalDaCampanha;
        this.alcanceDaCampanha = alcanceDaCampanha;
    }
}
# SOCIAL RATE

## INTEGRANTES DO GRUPO:

- RM99721 - Ricardo Correia Temple
- RM550268 - Thábata Orbeteli Viotto Santos 
- RM97827 - Yago Taguchi Ruksenas
- RM99530 - Mateus Viana Batista
- RM99409 - Michael José Bernardi

RESPONSABILIDADES DE CADA MEMBRO:
- Ricardo será responsável pelo desenvolvimento do projeto Java com SpringBoot e da apresentação do Pitch;
- Michael, será responsável pela criação do escopo e documentação do Projeto;
- Thabata também será responsável pela documentação do Projeto;
- Yago, será responsável pelo desenvolvimento do Protótipo front-end, assim como as telas do figma;
- Mateus, será responsável pelo Projeto de Banco de Dados;

## DIAGRAMAS DO PROJETO JAVA
### DIAGRAMA ENTIDADE RELACIONAMENTO
![image](https://github.com/NEXTGEN-FIAP/ApiSocialRateV3/assets/122487111/df41ef27-33d3-4f98-917b-e0a829abcbae)

### DIAGRAMA DE CLASSES
![image](https://github.com/NEXTGEN-FIAP/ApiSocialRateV3/assets/122487111/62d9237e-c0e8-4fd4-952b-e427dda26822)

## ARQUITETURA DO PROJETO
![image](https://github.com/RickMaverick/apiSocialRate_v2/assets/122487111/c06ea351-7e33-489c-b488-f1e2f6b495dc)

## ENDPOINTS DA API
ENDPOINTS DA CLASSE EMPRESA:
- POST http://localhost:8080/empresas
- DELETE http://localhost:8080/empresas/{id}

ENDPOINTS DA CLASSE INFLUENCER:
- POST http://localhost:8080/influencers

ENDPOINTS DA CLASSE CAMPANHA:
- POST http://localhost:8080/campanhas

## ANEXOS
ACESSO AO PITCH:
- https://www.youtube.com/watch?v=5DyYL7Z3cz0

JSONS PARA TESTE:
### Cadastrando 1 Empresa:
- {
	"nome": "Toyota",
	"email": "comercial.toyota.brasil@toyota.com.br",
	"nicho": "Automoveis"
}

### Cadastrando 1 Influencer:
- {
	"nome": "Ana Maria Braga",
	"areaAtuacao": "Apresentadora",
	"faixaEtariaPublico": "Jovens Adultos",
	"generoPublico": "Misto",
	"alcanceInfluencer": 10000000,
	"generoInfluencer": "Mulher"
}

### Cadastrando 1 Campanha:
- {
	"publicoAlvo": "Adultos",
	"generoPublivoAlvo": "Misto",
	"interessesDoPublico": "Viagens",
	"canalDaCampanha": "Televisao",
	"alcanceDaCampanha": "Nacional"
}

# financial-app
Um sistema para gerenciar despesas, receitas e investimentos.


# Usaremos:

- Java 17 e Spring Boot.
- Arquitetura em Microserviços (Backend + BFF).
- Banco de dados PostgreSQL.
- Integração com APIs externas (simulando integração com bancos).
- Maven


# Organizaremos os serviços em pastas separadas para cada microserviço:

financial-app/ </br>
├── backend/ </br>
│   ├── expense-service/ </br>
│   ├── income-service/ </br>
│   ├── investment-service/ </br>
│   ├── bank-integration-service/ </br>
├── bff/ </br>
│   ├── financial-bff/ </br>
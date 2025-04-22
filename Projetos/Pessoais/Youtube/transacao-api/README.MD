# Transação API

Uma API para gerenciar transações financeiras, permitindo adicionar, deletar e buscar estatísticas sobre as transações.

## Índice

- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints](#endpoints)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.2
- Lombok
- Swagger para documentação da API
- Gradle como gerenciador de dependências

## Instalação

Para instalar e executar o projeto, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/transacao-api.git
   cd transacao-api
   ```

2. Compile e execute a aplicação:
   ```bash
   ./gradlew bootRun
   ```

## Uso

A API está disponível em `http://localhost:8080`. Você pode usar ferramentas como Postman ou cURL para interagir com os endpoints.

## Endpoints

### Adicionar Transação

- **Método:** POST
- **URL:** `/transacoes`
- **Corpo da Requisição:**
  ```json
  {
    "valor": 100.0,
    "dataHora": "2023-10-01T10:00:00Z"
  }
  ```
- **Resposta:** 201 Created

### Deletar Transação

- **Método:** DELETE
- **URL:** `/transacoes`
- **Resposta:** 200 OK

### Buscar Estatísticas

- **Método:** GET
- **URL:** `/estatisticas`
- **Parâmetros:**
  - `intervaloBusca` (opcional, padrão: 60)
- **Resposta:**
  ```json
  {
    "count": 10,
    "sum": 1000.0,
    "avg": 100.0,
    "min": 50.0,
    "max": 200.0
  }
  ```

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. Faça um fork do repositório.
2. Crie uma nova branch (`git checkout -b feature/nome-da-feature`).
3. Faça suas alterações e commit (`git commit -m 'Adiciona nova feature'`).
4. Envie para o repositório remoto (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
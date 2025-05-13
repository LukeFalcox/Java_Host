# 💡 Desafio: Sistema de Pagamentos com Notificações e Regras de Desconto
### 🎯 Objetivo
Criar uma API em Java (Spring Boot) para processar pedidos com múltiplos métodos de pagamento, aplicar regras de desconto diferentes e enviar notificações após a confirmação.

### ✅ Requisitos Funcionais
Um pedido pode conter vários produtos.

O cliente pode pagar via:

Cartão de crédito

Boleto bancário

PIX

Cada tipo de pagamento tem uma lógica própria de processamento.

O sistema aplica regras de desconto com base em:

Valor do pedido

Cliente VIP

Promoções do dia

Após o pagamento, uma notificação é enviada por e-mail, SMS ou WhatsApp.

### 🛠️ Design Patterns sugeridos
Strategy: para as formas de pagamento.

Factory: para instanciar notificadores dinamicamente.

Observer: para o sistema de notificação assíncrona.

Decorator (opcional): para aplicar múltiplos descontos combináveis.

Singleton: para gerenciar um serviço único de log ou config.

Template Method: para estruturar o fluxo do pagamento.

### 🧱 Princípios SOLID esperados
S: Cada classe com responsabilidade única (ex: PagamentoCartao, PagamentoPix, etc.).

O: Facilmente extensível para novos meios de pagamento sem modificar os existentes.

L: Substituir abstrações sem quebrar o sistema (IPagamento, INotificador).

I: Interfaces específicas para cada tipo de ação (ex: IPagamento, IDesconto, INotificador).

D: Inversão de dependência com uso de injeção de dependência via Spring.

## 📂 Estrutura esperada

    📦 com.devfalco.pagamentosolid
    ├── controller
    │   └── PedidoController.java
    ├── model
    │   ├── Pedido.java
    │   ├── Produto.java
    ├── pagamento
    │   ├── IPagamento.java
    │   ├── PagamentoCartao.java
    │   ├── PagamentoPix.java
    │   └── PagamentoFactory.java
    ├── desconto
    │   ├── IDesconto.java
    │   ├── DescontoClienteVip.java
    │   └── DescontoValorAlto.java
    ├── notificacao
    │   ├── INotificador.java
    │   ├── EmailNotificador.java
    │   └── NotificadorObserver.java
    └── service
        └── PedidoService.java

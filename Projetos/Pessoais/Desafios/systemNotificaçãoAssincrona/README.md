# Descrição:
Crie um sistema de envio de notificações (e-mail, SMS, push) para um sistema de pedidos. Quando um pedido for criado, o sistema deve notificar os diferentes canais de forma assíncrona, utilizando threads.

## Requisitos:
Utilize o princípio Open/Closed: permita adicionar novos tipos de notificação sem alterar o código existente.

Use o Design Pattern Observer para registrar os canais de notificação.

Cada notificação deve ser enviada em uma Thread separada.

Os canais devem implementar uma interface comum.

## Extra:
Utilize Dependency Inversion para injetar os canais de notificação no sistema de pedidos.

Utilize o padrão Factory Method para instanciar dinamicamente os canais a partir de configurações.


# 🚌Validação VEM

O Validador VEM é um simulador de sistema embarcado desenvolvido em Java, inspirado no funcionamento real da validação do cartão VEM no transporte público.
## 💡 Motivação
A ideia do projeto surgiu da minha vivência diária utilizando ônibus. Ao usar o transporte público todos os dias, despertei a curiosidade em entender como funciona, por trás dos bastidores, o sistema de validação que milhões de pessoas utilizam sem perceber.
Foi literalmente “plantando a semente dentro do ônibus” que resolvi transformar essa curiosidade em prática, criando este simulador como forma de aprendizado e evolução técnica.

## ⚙️ O que o sistema faz?
O projeto simula o comportamento da catraca eletrônica:
- **Processamento de Cartões:** Utiliza arrays para simular a passagem de diversos passageiros.
- **Lógica de Cobrança:** Verifica se há saldo suficiente, desconta o valor da tarifa e libera (ou bloqueia) a catraca.
- **Feedback em Tempo Real:** Exibe no console o status de cada operação, simulando a "telinha" do validador.

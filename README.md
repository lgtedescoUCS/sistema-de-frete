# Sistema de Frete — padrão Strategy

Cálculo de frete para loja virtual, com cada modalidade de entrega encapsulada em sua própria estratégia. Adicionar uma forma de entrega nova não toca no código existente.

---

## O problema

Uma loja virtual oferece várias formas de entrega, cada uma com regra de cobrança própria:

| Modalidade | Regra |
|---|---|
| Econômica | R$ 10,00 + R$ 1,00/kg |
| Expressa | R$ 20,00 + R$ 2,50/kg |
| Retirada na loja | Grátis |
| Internacional | R$ 50,00 + R$ 5,00/kg |
| Drone | R$ 30,00, limitado a 5 kg |

A solução ingênua é uma cadeia de `if`/`switch` sobre o tipo de entrega dentro da classe `Pedido`. Cada modalidade nova exige editar essa cadeia — código testado sendo alterado por um motivo que não é dele.

---

## A solução

Uma abstração para a família de algoritmos:

```java
public interface FormaDeEntrega {
    double calcularFrete(double peso);
    String getDescricao();
}
```

Cada modalidade implementa a interface. `Pedido` compõe uma `FormaDeEntrega` e delega:

```java
public double calcularTotal() {
    return valorProdutos + formaDeEntrega.calcularFrete(peso);
}
```

`Pedido` não sabe quantas modalidades existem nem como cada uma calcula. Ele conhece apenas o contrato.

---

## Por que isso é Strategy

O padrão define uma família de algoritmos intercambiáveis, encapsula cada um e os torna substituíveis em tempo de execução. Aqui, o algoritmo é o cálculo de frete e a estratégia é escolhida na construção do pedido.

**O teste real do padrão** foi acrescentar a entrega por drone depois que o sistema já estava implementado e testado: uma classe nova, uma linha na `Main`, **nenhuma alteração em `Pedido` ou nas outras modalidades**. É Open/Closed na prática.

O drone também é o caso interessante do conjunto: ele carrega uma restrição de peso máximo, ou seja, uma estratégia que pode recusar o pedido em vez de apenas calcular um número.

---

## Estrutura

```
FormaDeEntrega (interface)
   ├── EntregaEconomica
   ├── EntregaExpressa
   ├── RetiradaNaLoja
   ├── EntregaInternacional
   └── EntregaPorDrone

Pedido  ──compõe──►  FormaDeEntrega
   valorProdutos, peso (encapsulados)
   calcularTotal(), relatorio()
```

---

## Como executar

```bash
javac -d bin src/*.java
java -cp bin Main
```

A `Main` instancia pedidos de todas as modalidades, armazena em uma `List<Pedido>` e imprime o relatório de cada um — valor dos produtos, forma de entrega, frete e total.

---

Trabalho de implementação — Projeto e Arquitetura de Software, Universidade de Caxias do Sul (UCS).

---

> ⚠️ **Confirmar antes de publicar:** ajuste o nome da classe do drone e o comando de execução ao seu código real.

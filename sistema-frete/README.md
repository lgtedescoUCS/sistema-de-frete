# Sistema de Frete com Estratégias de Entrega

Sistema de cálculo de frete usando o padrão **Strategy** com programação para interface.

## Estrutura do projeto

```
sistema-frete/
├── .vscode/
│   ├── launch.json          # Configuração para rodar com F5
│   └── settings.json        # Configurações do projeto Java
├── src/
│   ├── FormaDeEntrega.java          (interface)
│   ├── EntregaEconomica.java
│   ├── EntregaExpressa.java
│   ├── RetiradaNaLoja.java
│   ├── EntregaInternacional.java
│   ├── Pedido.java
│   └── Main.java                    (classe principal)
└── README.md
```

## Pré-requisitos

- **JDK 17+** instalado (https://adoptium.net/)
- **VSCode** com a extensão **Extension Pack for Java** (Microsoft)

## Como executar no VSCode

1. Abra a pasta `sistema-frete` no VSCode (`File → Open Folder...`)
2. Aguarde a extensão do Java reconhecer o projeto (canto inferior direito mostra "Java: Ready")
3. Abra o arquivo `src/Main.java`
4. Clique em **Run** acima do `main` ou pressione **F5**

## Como executar pelo terminal

```bash
cd sistema-frete
javac -d bin src/*.java
java -cp bin Main
```

## Saída esperada

```
=========== Pedido 1 ===========
Valor dos produtos: R$150,00
Peso: 3.0 kg
Forma de entrega: Entrega Econômica
Frete: R$13,00
Total: R$163,00

=========== Pedido 2 ===========
Valor dos produtos: R$500,00
Peso: 5.5 kg
Forma de entrega: Entrega Expressa
Frete: R$33,75
Total: R$533,75

=========== Pedido 3 ===========
Valor dos produtos: R$80,00
Peso: 1.2 kg
Forma de entrega: Retirada na Loja
Frete: R$0,00
Total: R$80,00

=========== Pedido 4 ===========
Valor dos produtos: R$1200,00
Peso: 4.0 kg
Forma de entrega: Entrega Internacional
Frete: R$70,00
Total: R$1270,00

=========== Pedido 5 ===========
Valor dos produtos: R$250,00
Peso: 2.5 kg
Forma de entrega: Entrega Econômica
Frete: R$12,50
Total: R$262,50
```

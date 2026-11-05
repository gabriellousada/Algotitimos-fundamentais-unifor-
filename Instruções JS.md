
# Algoritmos Fundamentais

Implementação de algoritmos fundamentais em JavaScript, com programação defensiva
(validação de entradas e tratamento de exceções) e testes unitários usando [Jest](https://jestjs.io/).

## Algoritmos

| Algoritmo | Função | Arquivo | Testes |
|-----------|--------|---------|--------|
| Contagem de ocorrências | `contarOcorrencias` | `src/contagem.js` | `tests/contagem.test.js` |
| Fibonacci | `gerarFibonacci` | `src/fibonacci.js` | `tests/fibonacci.test.js` |
| MDC | `calcularMdc` | `src/mdc.js` | `tests/mdc.test.js` |
| Número primo | `ehPrimo` | `src/numeroPrimo.js` | `tests/numeroPrimo.test.js` |
| Ordenação (Bubble Sort) | `ordenarLista` | `src/ordenacao.js` | `tests/ordenacao.test.js` |
| Somatório | `somarLista` | `src/somatorio.js` | `tests/somatorio.test.js` |

## Pré-requisitos

- [Node.js](https://nodejs.org/) 18 ou superior (o npm já vem incluso)

## Como executar os testes

```bash
git clone https://github.com/SEU_USUARIO/algoritmos-fundamentais.git
cd algoritmos-fundamentais
npm install
npm test
```

## Como executar um algoritmo individualmente

Cada arquivo em `src/` possui um exemplo de uso que roda direto no Node:

```bash
node src/fibonacci.js
node src/mdc.js
```

## Estrutura do projeto

```
├── src/        # código-fonte dos algoritmos
├── tests/      # testes unitários (Jest)
├── package.json
└── README.md
```

## Boas práticas aplicadas

- Nomes de variáveis e funções significativos
- Validação de tipo e faixa dos parâmetros (`TypeError` / `RangeError`)
- Funções puras, sem efeitos colaterais (a lista original não é alterada na ordenação)
- Documentação com JSDoc
- Mínimo de 2 testes por algoritmo, cobrindo casos válidos, limites e erros

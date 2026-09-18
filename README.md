# Avaliacao Parcial - Programacao Orientada a Objetos

**Estudante:** Lucas Wanderley Gomes
**Curso:** Bacharelado em Engenharia de Software - UNIFIP
**Professor:** Rodrigo Valenca

## Tema e objetivo

Sistema de **biblioteca** em modo console. A aplicacao cadastra itens do acervo,
registra emprestimos para leitores e calcula a multa quando um item e devolvido
com atraso, aplicando uma regra diferente conforme o tipo de item.

## Principais classes e responsabilidades

| Classe | Responsabilidade |
|---|---|
| `Emprestavel` (interface) | Declara o comportamento comum `calcularMulta(int diasAtraso)` |
| `ItemAcervo` (abstrata) | Guarda o titulo, valida o dado e obriga cada subclasse a definir seu tipo |
| `Livro` | Subclasse de `ItemAcervo`; multa de R$ 1,00 por dia de atraso |
| `Revista` | Subclasse de `ItemAcervo`; multa de R$ 0,50 por dia de atraso |
| `Gibi` | Subclasse de `ItemAcervo`; multa de R$ 0,75 por dia de atraso |
| `Emprestimo` | Associa um item do acervo a um leitor e calcula a multa |
| `Biblioteca` | Mantem a lista de emprestimos e registra novos |
| `Principal` | Classe com o metodo `main`, monta o cenario e demonstra o funcionamento |

## Relacionamentos

```
        Emprestavel (interface)
              ^
              | implementa
         ItemAcervo (abstrata)
           ^     ^    ^
           |     |    |  heranca
         Livro  Gibi Revista

Biblioteca  1 ----- * Emprestimo      (composicao)
Emprestimo  * ----- 1 ItemAcervo      (associacao)
```

- **Heranca:** `Livro`, `Revista` e `gibi` estendem `ItemAcervo`.
- **Composicao:** os objetos `Emprestimo` sao criados dentro de `Biblioteca` e so existem enquanto ela existir.
- **Associacao:** cada `Emprestimo` referencia um `ItemAcervo` que existe de forma independente.

## Teste de multa

Em `Principal`, o emprestimo de "Bruno Lima" recebe `registrarAtraso(4)`
simulando uma devolucao com 4 dias de atraso. O programa imprime a multa
calculada automaticamente por `calcularMulta()`.

## Conceitos de POO aplicados

- **Encapsulamento:** atributos `private`, com construtores e getters apenas onde sao necessarios.
- **Validacao de estado:** titulo e leitor nao podem ser vazios; dias de atraso nao podem ser negativos.
- **Abstracao:** `ItemAcervo` possui um atributo, o metodo concreto `exibirDados()` e o metodo abstrato `tipo()`.
- **Heranca:** `Livro`, `Revista` e `Gibi` reaproveitam o estado e o comportamento de `ItemAcervo`.
- **Polimorfismo:** a lista `List<ItemAcervo>` armazena livros e revistas e cada um executa sua propria versao de `calcularMulta()`.
- **Interface:** `Emprestavel` define o contrato de calculo de multa comum a todos os itens.

## Como executar

```bash
javac *.java
java Principal
```

Requisito: JDK 17 ou superior.
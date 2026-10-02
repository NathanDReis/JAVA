# Curso Java Básico

Exercícios e exemplos feitos durante um curso de Java básico, organizados por aula.

> 🚧 Em andamento: 20 de 56 aulas concluídas.

## Requisitos

- JDK 25
- Eclipse IDE (opcional)

## Como executar

### Pelo Eclipse

Importe a pasta como projeto Java, abra a classe desejada e use **Run As → Java Application**.

### Pelo terminal

O projeto é um módulo Java (`curso_java_basico`). Compile tudo a partir da raiz:

```bash
javac -d bin $(find src -name "*.java")
```

E execute uma classe informando o módulo e o nome completo da classe:

```bash
java -p bin -m curso_java_basico/com.nathan.cursojava.aula17.LoopFor
```

## Conteúdo

As classes ficam em `src/com/nathan/cursojava/aulaXX/`.

| Aula | Assunto | Arquivos |
|------|---------|----------|
| — | Primeiro programa | `curso_java_basico/HelloWorld` |
| 10 | Variáveis | `Variaveis` |
| 11 | Tipos primitivos e literais | `VariaveisInteiras`, `VariaveisFlutuante`, `VariaveisChar`, `VariaveisBoolean`, `Literais`, `LiteraisHexDecBin`, `LiteraisPiadinha`, `CuriosidadeInteiros` |
| 12 | Leitura de dados do teclado (`Scanner`) | `LeituraDadosTeclado` |
| 13 | Operadores aritméticos, relacionais e lógicos | `OperadoresAritimeticos`, `OperadoresRelacionais`, `OperadoresLogicos`, `CurtoCircuito` |
| 14 | Condicionais (`if`/`else`) | `Condicionais` |
| 15 | `switch`/`case` | `SwitchCase` |
| 16 | Loop `while` | `LoopWhile` |
| 17 | Loop `for` | `LoopFor` |
| 18 | `break` e `continue` | `BreakContinue` |
| 19 | Arrays | `Arrays` |
| 20 | Matrizes | `Matriz`, `MatrizIrregular`, `MatrizTridimensional` |

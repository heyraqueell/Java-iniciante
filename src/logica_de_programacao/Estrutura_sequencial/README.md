## Scanner
É uma classe usada para ler dados de entrada, geralmente do teclado (`System.in`).

Ele permite capturar diferentes tipos de valores, como texto ( `nextLine(`) ), inteiros ( `nextInt()` ) e decimais (
`nextDouble()` ). Essa classe está no pacote `java.util`.

<aside>

>💡 O **Scanner** é uma **classe** que faz parte da **biblioteca padrão** do Java, organizada dentro do **pacote**
`java.util`.

</aside>

Como utilizar essa classe?

- 1° precisamos fazer o import do pacote java.util + a classe Scanner = `import java.util.Scanner;`
- 2° precisamos fazer a declaração da variável do tipo Scanner ou a criação do objeto =
  `Scanner sc = new Scanner (System.in)`.
    - **new** (Cria) + **Scanner** (A ferramenta) + **System.in** (Conecta ao teclado).
- 3° Fazer a leitura dos dados com o `String nome = sc.next()` .
- 4° Fechar o Scanner: `sc.close();`


#### Tabela do Scanner

| **Tipo de Dado** | **Comando de Leitura** | **O que ele captura?** |
| --- | --- | --- |
| **`String`** | `sc.next()` | Apenas a primeira palavra. |
| **`String`** | `sc.nextLine()` | A linha inteira (até o Enter). |
| **`int`** | `sc.nextInt()` | Um número inteiro (ex: 10). |
| **`double`** | `sc.nextDouble()` | Um número decimal (ex: 2.5). |
| **`float`** | `sc.nextFloat()` | Um número decimal menor (ex: 2.5f). |
| **`long`** | `sc.nextLong()` | Um número inteiro muito grande. |
| **`boolean`** | `sc.nextBoolean()` | Valor verdadeiro ou falso (`true`/`false`). |

#### Resumo:
- **Palavra:** `sc.next()`
- **Frase:** `sc.nextLine()`
- **Inteiro:** `sc.nextInt()`
- **Decimal:** `sc.nextDouble()`
- **Boolean:** `sc.nextBoolean()`

### Como ler apenas a primeira letra com o Scanner?

Para ler apenas a primeira letra utilizamos o `sc.next().chatAt(0)` e indicamos dentro d parênteses do charAt qual o índice que queremos ler. Por exemplo:

```java
System.out.print("Qual o seu gênero? ");
gen = sc.next().charAt(0); //Lê apenas o índice indicado
```

### Bug da quebra de linha pendente

Imagine que o Scanner é um cano por onde os dados passam. Quando você digita `25` e aperta **Enter**, você enviou dois dados: o número `25` e o caractere invisível `\n` (que representa o Enter).

1. **`nextInt()`**: Ele entra no cano, pega o `25` e **para logo antes** do `\n`.
2. **O Problema**: O `\n` continua lá, "entupindo" o cano.
3. **`nextLine()`**: Esse comando é diferente. Ele lê tudo até encontrar um `\n`. Como já tem um `\n` sobrando ali, ele o lê imediatamente, entende que a linha acabou e entrega uma resposta vazia para você.

Qual a solução? Fazer a limpeza do Buffer usando `Um next.line()` extra. Por exemplo:

```java
System.out.print("Digite sua idade: ");
int idade = sc.nextInt(); // Pega o número, deixa o Enter no cano

sc.nextLine(); // COMANDO MÁGICO: Ele "come" o Enter que sobrou e não guarda em nada

System.out.print("Digite seu nome completo: ");
String nome = sc.nextLine(); // Agora o cano está limpo e ele espera você digitar
```
# Expressões lógicas e comparativas

## Expressões comparativas

| Operadores | Significado |
| --- | --- |
|                                 >  | Maior que |
|                                 <  | Menor que |
|                               > = | Maior ou igual |
|                               < = | Menor ou igual  |
|                               ==  | Igual |
|                               == | Diferente |

## Operadores lógicos

| Operadores | Significado |
|------------|-------------|
| &&         | E           |
|            |             |  | Ou |
| !          | Não         |

---

## Ideia por trás do operador “E”

No Brasil, você pode obter uma carteira de motorista se:

- For aprovado no exame psicotécnico 
- E for aprovado no exame de legislação 
- E for aprovado no exame de direção.

<aside>

>💡 TODAS AS CONDIÇÕES DEVEM SER VERDADEIRAS.


### Tabela da verdade operador “E”

| A | B | A && B     |
|---|---|------------|
| F | F | Falso      |
| F | V | Falso      |
| V | F | Falso      |
| V | V | Verdadeiro |

</aside>

---

## Ideia por trás do operador “OU”

“Você pode estacionar numa vaga especial se: ”

- For idoso(a) OU pessoa com deficiência OU gestante.

<aside>

>💡PELO MENOS UMA DAS CONDIÇÕES PRECISA SER VERDADEIRA.

</aside>

### Tabela da verdade operador “OU”

| A | B | A OU B     |
|---|---|------------|
| F | F | Falso      |
| F | V | Falso      |
| V | F | Falso      |
| V | V | Verdadeiro |

---

## Ideia por trás do operador “NÃO”

“Você tem direito a receber uma bolsa de estudos se: “

- NÃO possuir uma renda maior que R$3,000.

<aside>

>💡INVERTE A CONDIÇÃO.

</aside>

- Exemplo: Suponha que X é igual a 5.

  ! ( X == 10)  - A afirmação dentro dos parênteses é falsa, X não é igual a 10. Logo, toda a condição se torna verdadeira. NÃO X == 10.

  ! ( X >= 2) - A Afirmação dentro dos parênteses é verdadeira, X é maior que 2. Logo, toda a condição se torna Falsa.


### Tabela da verdade operador “NÃO”

| A | ! A |
| --- | --- |
| F | Verdadeiro |
| V | Falso |


---

## Operadores de atribuição acumulativa

| a  +=  b; | a = a + b |
|-----------|-----------|
| a  -=  b; | a = a - b |
| a  *=  b; | a = a * b |
| a  /=  b; | a = a / b |
| a  %=  b; | a = a % b |

<aside>

>💡 Simplificação das operações. Ao invés de colocar: `conta + conta;` coloque `conta += ;`

</aside>

---

## Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

#### Sintaxe:

( condição ) ? valor_se_verdadeiro : valor_se_falso

(condicional) ? true :  false

#### Exemplos:

( 2 > 4 ) ? 50 : 80 → 80.

### Demostração

If-else

```java
double preco = 34.5;
double desconto;

if (preco < 20.0) {
	desconto = preco * 0.1;
}
else { 
	desconto = preco * 0.5;
}
```

condição ternária

```java
double preco = 34.5;

double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

```

A leitura é bem parecido com a do if-else.

Preço é menor que 20? Se sim, 10% de desconto, caso contrário, 5% de desconto. Simples.

---

## Variável SEMPRE deve ser iniciada.

| **Tipo de Variável**             | **Local (Dentro do main)**                | **Atributo (Fora do main)**          |
|----------------------------------|-------------------------------------------|--------------------------------------|
| **Precisa inicializar?**         | **Sim, obrigatoriamente.**                | Não, o Java faz por você.            |
| **O que acontece se não fizer?** | Erro de compilação (sublinhado vermelho). | Ela assume o valor zero ou nulo.     |
| **Principal motivo**             | Segurança e previsibilidade do código.    | Padronização da estrutura do objeto. |
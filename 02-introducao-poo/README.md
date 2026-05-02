# Introdução a Programação Orientada a Objetos

---

## POO ou OOP

Programação Orientada a Objetos ou Object-Oriented Programming

## Objetivo

O principal objetivo da POO é aproximar o mundo digital do mundo real. Em vez de focar apenas em funções e lógica sequencial (como na programação estruturada), a POO organiza o software em torno de **objetos**, que são instâncias de **classes**.

- **Modelagem Fiel:** Representar elementos do mundo real (ex: Cliente, Conta Bancária, Pedido) como entidades autônomas.
- **Abstração:** Focar no que um objeto faz, e não em como ele faz internamente.
- **Modularidade:** Dividir o sistema em partes menores, independentes e compreensíveis.

---

## Vantagens da POO

A adoção desse paradigma traz benefícios cruciais para o ciclo de vida do desenvolvimento de software:

| **Vantagem**                     | **Descrição**                                                                                                            |
|----------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| **Reutilização de Código**       | Através da *Herança*, você evita duplicar lógica, reaproveitando comportamentos de classes existentes.                   |
| **Manutenibilidade**             | Como o código é modular, corrigir um bug em um objeto específico não afeta (ou afeta minimamente) o restante do sistema. |
| **Segurança (Encapsulamento)**   | Protege os dados internos do objeto, permitindo acesso apenas através de métodos controlados.                            |
| **Flexibilidade (Polimorfismo)** | Permite que diferentes objetos respondam à mesma mensagem de formas específicas, facilitando a expansão do sistema.      |
| **Escalabilidade**               | Sistemas complexos tornam-se mais fáceis de gerenciar quando divididos em responsabilidades bem definidas.               |

---

## Componentes de um Objeto

### **1. Atributos (Propriedades)**

Representam as **características** ou dados que o objeto possui. É o "substantivo".

- **Definição:** Define a estrutura e o que o objeto *é*.
- **Exemplos:** `marca`, `cor`, `tamanho`, `preco`.

### **2. Métodos (Comportamentos)**

Representam as **ações** que o objeto pode executar. É o "verbo".

- **Definição:** Funções que manipulam os atributos ou interagem com outros objetos.
- **Exemplos:** `escrever()`, `pintar()`, `ligar()`, `calcularDesconto()`.

### **3. Estado**

É o **valor atual** dos atributos de um objeto em um determinado momento.

- Ex: O estado de uma lâmpada muda de *apagada* para *acesa* após o método `clicarInterruptor()`

---

### Exemplo de Algoritmo em POO

```java
Classe Caneta
	//ATRIBUTOS
	modelo: String
	cor: String
	ponta: double
	carga: int
	tampada: boolean
	
	//METODOS
	Metodo rabiscar()
	if (tampada) {
		System.out.println("ERRO");
	} else {
		System.out.println("RABISCO");
	}
	FimMetodo
	
FimClasse
```

### Instanciar

O ato de criar um objeto real a partir de uma classe (o molde).

```java
caneta1 = new Caneta();
caneta1.cor = "Azul";

caneta2 = new Caneta();
caneta2.cor = "Vermelho";
```

---

## Classe x Objeto

Classe: Define os atributos e métodos comuns que serão compartilhados por um objeto.

Objeto: É uma instância de uma classe.

- **Instância:** Refere-se pedido.

## Abstração

A **Abstração** é o pilar da POO que consiste em isolar as características essenciais de um objeto, ignorando detalhes complexos ou irrelevantes para o sistema.

Por exemplo:

Se estou criando um sistema escolar, eu preciso de matricula, cpf, nome completo, nome dos pais, mas não preciso de peso, cor dos olhos e detalhes desnecessários.
Você foca apenas no que é **essencial** para o seu contexto e ignora todo o resto. Se o sistema não precisa saber o peso do aluno para gerar um boletim, essa informação não entra na sua classe.

- Muitos programadores consideram a Abstração o primeiro pilar da POO.

---

## Membros estáticos

Também chamados de membros de classe. Em oposição a membros e instância.

- São membros que fazer sentido independentemente de objetos. Não precisam de objeto para serem chamados.
- São chamados a partir do próprio nome da classe.

#### Aplicação comuns:

- Classes utilitárias
- Declaração de constantes

Uma classe que possui somente membros estáticos, podem ser uma classe estática também. Esta classe não poderá ser instanciada.

<aside>
💡

Método NÃO estático: O comportamento dele vai variar dependendo do estado particular de cada objeto de onde ele for chamado.

</aside>

### Sintaxe

```java
double nomeVariavel = nomeClasse.nomeMetodo(arg);
```

### Importante:

- `Program` cuida apenas da interação com o usuário (teclado e tela).
- `Classe` cuida puramente da regra de negócio (matemática).
- **`static`**: O valor pertence à classe (ao molde).
- **`final`**: O valor é imutável (ninguém mexe).

---
## 📬 Contato
Sinta-se à vontade para acompanhar meu progresso ou entrar em contato:
- **LinkedIn:** [@Heyraqueell](https://www.linkedin.com/in/heyraqueell/)
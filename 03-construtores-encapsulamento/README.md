# Construtores, this, sobrecarga, encapsulamento

---

# Construtor

- É uma operação especial da classe, que executa no momento da instanciação do objeto.

### Usos comuns:

- Iniciar valores atribuídos
- Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)

Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:

```java
Product p = new Product();
```

- É possível especificar mais de um construtor na mesma classe (sobrecarga)
- O construtor deve ter obrigatoriamente o mesmo nome que a classe.

A ideia principal é a **consistência**. O construtor é uma ferramenta que protege o seu programa de ter objetos vazios ou bugados rodando na memória.

---

# Palavra “This”

### O que é?

É uma variável implícita que guarda o endereço do **objeto atual**. Ela serve para o código saber que você está mexendo em algo que pertence à **instância** e não a uma variável temporária.

### Para que serve?

**Resolver conflitos de nomes (Shadowing):**
Quando o nome do parâmetro é igual ao nome do atributo, o Java prioriza o parâmetro. O `this` é usado para "forçar" o Java a olhar para o atributo da classe.

---

# Sobrecarga

É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

**Utilidade**: Disponibilizar mais de uma versão da mesma operação, com diferença de parâmetros.

---

# 💊 Encapsulamento

Serve para "esconder" os detalhes internos de como uma classe funciona e proteger os dados contra acessos indevidos.

Analogia - **Cápsula de remédio**: você tem acesso à parte externa (a casca), mas o conteúdo químico (os dados) está protegido lá dentro.

---

# Getters e Setters

São métodos usados para acessar e modificar atributos **privados** de uma classe com segurança.

- **Get (Pegar):** Um método que apenas **retorna** o valor de um atributo. Usado para **leitura**.
- **Set (Definir):** Um método que **recebe um valor** e o atribui ao atributo. Usado para **alteração**.

---

# Modificadores de acesso

- Private: Só pode ser acessado na **própria classe**.
- (nada): Só pode ser acessado nas classes do **mesmo pacote**.
- Public: Acessado por **todas classes** (Ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está).
- Protected: Só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.

#### Regra de ouro:

- Atributos são private.
- Métodos são public.
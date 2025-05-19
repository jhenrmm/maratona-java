
---

## **Resumo de Java**

---

## **Estrutura Básica de um Arquivo Java**

A estrutura básica de um arquivo Java consiste na definição de uma classe pública com um método `main`, que é o ponto de entrada para a execução do programa.

```java
public class NomeDoArquivo {
    public static void main(String[] args) {
        // Código aqui
    }
}
```

---

## **Operadores**

Os operadores em Java são usados para realizar operações sobre variáveis e valores.

### **Operadores Aritméticos**

São usados para realizar operações matemáticas.

- Soma: `+`
    
- Subtração: `-`
    
- Multiplicação: `*`
    
- Divisão: `/`
    
- Resto da divisão: `%`
    

### **Operadores de Atribuição**

Usados para atribuir valores a variáveis.

- Atribuição simples: `=`
    

### **Operadores Lógicos**

Usados para operações booleanas (verdadeiro ou falso).

- AND: `&&`
    
- OR: `||`
    
- NOT: `!`
    

---

## **Condicionais**

Estruturas de controle que permitem a execução condicional de blocos de código.

### **if / else**

A estrutura `if` permite verificar condições e executar um bloco de código quando a condição é verdadeira, e outro bloco se for falsa.

```java
if (condicao) {
    // Código executado se a condição for verdadeira
} else if (outraCondicao) {
    // Código executado se a outra condição for verdadeira
} else {
    // Código executado se nenhuma condição for verdadeira
}
```

### **Switch**

Usado para escolher entre várias opções de uma variável.

```java
int dia = 5;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    default:
        System.out.println("Dia inválido");
}
```

---

## **Arrays**

Arrays são estruturas de dados que armazenam múltiplos valores de um mesmo tipo.

```java
int[] arr = {3, 5, 7, 1};
```

### **Arrays Multidimensionais**

São arrays dentro de arrays, permitindo representar matrizes.

```java
int[][] arr = {{3, 5, 1}, {2, 3}, {6, 8, 2, 7, 4}};
```

---

## **Modificadores de Acesso**

Controlam o nível de acesso a classes, métodos e variáveis.

|Modificador|Acesso|
|---|---|
|**default**|Somente dentro do mesmo pacote|
|**public**|Acessível de qualquer lugar|
|**private**|Somente dentro da mesma classe|
|**protected**|Acessível dentro do mesmo pacote e subclasses|

---

## **Final (Modificador)**

O modificador `final` impede que uma variável, método ou classe seja modificada.

```java
final class Constante {
    static final double PI = 3.14159;
}
```

---

## **Herança**

Permite criar uma nova classe baseada em uma classe existente.

```java
class Animal {
    String nome;
    void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latido");
    }
}
```

---

## **Classes Abstratas**

Classes abstratas não podem ser instanciadas diretamente e geralmente possuem métodos abstratos que devem ser implementados pelas subclasses.

```java
abstract class Animal {
    abstract void fazerSom();
    void dormir() {
        System.out.println("Dormindo...");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}
```

---

## **Interface**

Uma interface define um contrato que as classes implementadoras devem seguir.

```java
interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("Latido");
    }
}
```

---

## **Polimorfismo**

Permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum.

### **Sobrescrita de Métodos**

Métodos da classe pai podem ser substituídos nas classes filhas.

```java
class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}
```

### **Sobrecarga de Métodos**

Permite ter múltiplos métodos com o mesmo nome, mas com diferentes parâmetros.

```java
class Calculadora {
    int soma(int a, int b) {
        return a + b;
    }

    double soma(double a, double b) {
        return a + b;
    }
}
```

---

## **Tratamento de Exceções**

O tratamento de exceções permite lidar com erros de forma controlada.

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero");
} finally {
    System.out.println("Bloco final sempre executado");
}
```

---

## **Wrappers**

As classes wrapper permitem usar tipos primitivos como objetos.

```java
Integer numero = Integer.valueOf(10);
Double preco = Double.valueOf(5.99);
```

---

## **Strings**

Strings são objetos que representam sequências de caracteres.

```java
String texto = "Java";
String texto2 = texto.toUpperCase(); // "JAVA"
```

---

## **Date, Calendar e DateFormat**

Essas classes ajudam a manipular datas e horários.

### **Date**

```java
import java.util.Date;
Date data = new Date();
System.out.println(data);
```

### **Calendar**

```java
import java.util.Calendar;
Calendar calendario = Calendar.getInstance();
calendario.set(2025, Calendar.MARCH, 23);
System.out.println(calendario.getTime());
```

### **DateFormat**

```java
import java.text.SimpleDateFormat;
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
Date data = new Date();
System.out.println(formato.format(data));
```

---

## **Regex (Expressões Regulares)**

Expressões regulares são usadas para realizar buscas e validações de padrões em textos.

```java
import java.util.regex.*;

String texto = "Email: exemplo@email.com";
Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
Matcher matcher = pattern.matcher(texto);

if (matcher.find()) {
    System.out.println("Encontrado: " + matcher.group());
}
```

---

## **Scanner (Entrada de Dados)**

A classe `Scanner` permite a leitura de entradas do usuário.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = sc.nextLine();
System.out.println("Olá, " + nome);
```

---

## **File e Manipulação de Arquivos**

A manipulação de arquivos é fundamental para gravar e ler dados em Java.

### **File**

```java
import java.io.File;

File arquivo = new File("dados.txt");
if (arquivo.exists()) {
    System.out.println("Arquivo existe: " + arquivo.getAbsolutePath());
}
```

### **FileWriter**

```java
import java.io.FileWriter;

FileWriter writer = new FileWriter("dados.txt");
writer.write("Olá mundo!");
writer.close();
```

### **FileReader**

```java
import java.io.FileReader;

FileReader reader = new FileReader("dados.txt");
int caractere;
while ((caractere = reader.read()) != -1) {
    System.out.print((char) caractere);
}
reader.close();
```

---

## **Serialization**

A serialização permite converter objetos em uma sequência de bytes, o que possibilita seu armazenamento ou envio.

```java
import java.io.*;

class Pessoa implements Serializable {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

// Serializando
Pessoa p = new Pessoa("João", 30);
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.ser"));
oos.writeObject(p);
oos.close();

// Desserializando
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.ser"));
Pessoa p1 = (Pessoa) ois.readObject();
ois.close();
```

---

## **equals e hashcode**

O método `equals` verifica se dois objetos são iguais, enquanto `hashCode` retorna um valor hash que pode ser usado para comparar objetos.

```java
class Pessoa {
    String nome;
    int idade;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
```

---

## **List, Set, Map, Queue**

Essas são coleções que ajudam a armazenar e manipular dados.

- **List**: Uma lista ordenada, como `ArrayList`.
    
- **Set**: Uma coleção sem elementos duplicados, como `HashSet`.
    
- **Map**: Uma coleção de pares chave-valor, como `HashMap`.
    
- **Queue**: Uma fila onde os elementos são processados por ordem de chegada, como `LinkedList`.
    

---

## **Generics**

Generics permitem escrever código mais reutilizável, trabalhando com tipos de dados específicos.

```java
class Caixa<T> {
    private T item;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}
```

---

### **Lambda em Java**:

Lambdas são expressões que permitem representar funções de maneira concisa e funcional. Elas são usadas principalmente com **interfaces funcionais**, que possuem apenas um método abstrato. A sintaxe básica é `(parâmetros) -> expressão ou bloco de código`. Lambdas permitem simplificar operações como iteração e filtragem, reduzindo a verbosidade do código.

Exemplo de uso:

```java
Consumer<String> imprimir = texto -> System.out.println(texto);
imprimir.accept("Hello");
```

---

### **Streams em Java**:

Streams são uma abstração introduzida no Java 8 para manipulação de coleções de dados de maneira funcional e declarativa. Elas permitem operações como **filtragem**, **transformação** e **redução** de dados, utilizando operações intermediárias (como `filter()`, `map()`, `distinct()`) e terminais (como `forEach()`, `reduce()`, `collect()`).

Exemplo de uso:

```java
List<String> lista = Arrays.asList("Java", "Python", "C++");
lista.stream()
     .filter(s -> s.length() > 4)
     .forEach(System.out::println);  // Output: Java, Python
```

Streams também oferecem suporte a paralelismo com `parallelStream()`, o que pode melhorar o desempenho em grandes volumes de dados.

---

## **Padrões de Projeto**

### **Builder**

O padrão Builder permite criar objetos complexos passo a passo, facilitando a construção com diferentes combinações de parâmetros.

```java
class Pessoa {
    private String nome;
    private int idade;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
    }

    public static class Builder {
        private String nome;
        private int idade;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}
```

---

### **Factory**

O padrão Factory fornece uma interface para criar objetos, delegando para subclasses ou métodos específicos a decisão de qual classe instanciar.

```java
interface Animal {
    void falar();
}

class Cachorro implements Animal {
    public void falar() {
        System.out.println("Latido");
    }
}

class Gato implements Animal {
    public void falar() {
        System.out.println("Miado");
    }
}

class AnimalFactory {
    public static Animal criarAnimal(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "cachorro" -> new Cachorro();
            case "gato" -> new Gato();
            default -> throw new IllegalArgumentException("Tipo desconhecido");
        };
    }
}
```

---

### **Singleton**

O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

```java
class Conexao {
    private static Conexao instancia;

    private Conexao() {}

    public static Conexao getInstancia() {
        if (instancia == null) {
            instancia = new Conexao();
        }
        return instancia;
    }
}
```

---

## **DTO (Data Transfer Object)**

DTOs são usados para transportar dados entre camadas da aplicação, evitando expor entidades diretamente.

```java
class PessoaDTO {
    private String nome;
    private int idade;

    public PessoaDTO(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
}
```

---

## **JDBC (Java Database Connectivity)**

Permite conectar, executar comandos e manipular dados em bancos de dados relacionais.

```java
import java.sql.*;

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
PreparedStatement stmt = conn.prepareStatement("SELECT * FROM pessoa");
ResultSet rs = stmt.executeQuery();

while (rs.next()) {
    System.out.println(rs.getString("nome"));
}

rs.close();
stmt.close();
conn.close();
```

---

## **Transações**

As transações garantem que um conjunto de operações no banco de dados seja executado de forma atômica.

```java
try (Connection conn = DriverManager.getConnection(url, user, pass)) {
    conn.setAutoCommit(false);

    PreparedStatement stmt1 = conn.prepareStatement("UPDATE conta SET saldo = saldo - 100 WHERE id = 1");
    stmt1.executeUpdate();

    PreparedStatement stmt2 = conn.prepareStatement("UPDATE conta SET saldo = saldo + 100 WHERE id = 2");
    stmt2.executeUpdate();

    conn.commit(); // Confirma as alterações
} catch (SQLException e) {
    conn.rollback(); // Reverte todas as alterações
}
```

---

## **CRUD (Create, Read, Update, Delete)**

CRUD representa as quatro operações básicas em um banco de dados.

```java
// CREATE
PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa (nome, idade) VALUES (?, ?)");
stmt.setString(1, "João");
stmt.setInt(2, 30);
stmt.executeUpdate();

// READ
stmt = conn.prepareStatement("SELECT * FROM pessoa");
ResultSet rs = stmt.executeQuery();

// UPDATE
stmt = conn.prepareStatement("UPDATE pessoa SET idade = ? WHERE nome = ?");
stmt.setInt(1, 35);
stmt.setString(2, "João");
stmt.executeUpdate();

// DELETE
stmt = conn.prepareStatement("DELETE FROM pessoa WHERE nome = ?");
stmt.setString(1, "João");
stmt.executeUpdate();
```

---

## **JUnit (Testes Unitários)**

JUnit é um framework para escrever e rodar testes automatizados em Java.

```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSoma() {
        assertEquals(5, new Calculadora().soma(2, 3));
    }
}
```

---

## **Record Class (Java 14+)**

Uma `record` é uma classe imutável que já vem com `getters`, `equals`, `hashCode` e `toString` implementados automaticamente.

```java
public record Pessoa(String nome, int idade) {}
```

---

## **Pattern Matching for `instanceof` (Java 16+)**

Permite fazer o cast automático dentro do `if` quando o `instanceof` for verdadeiro.

```java
Object obj = "Olá mundo";
if (obj instanceof String s) {
    System.out.println(s.toUpperCase());
}
```

---

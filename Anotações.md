### Classes e Objetos
Na Orientação a Objetos, temos dois conceitos essenciais, que são:

- Classes;
- Objetos.

### Classes
no mundo real, podemos identificar e classificar diversos objetos que compartilham um conjunto de características em comum. Por exemplo, um livro é um conceito que pode representar vários objetos com características compartilhadas, como capa, autor, número de páginas, ISBN, entre outros; assim, diante de objetos que têm em comum esse conjunto de características, conseguimos classificá-los como livros, certo?

O que é Classe na Orientação a Objetos?
Por definição, uma classe serve como um modelo, uma “planta”, um desenho por meio do qual objetos serão criados. No Java, podemos definir uma classe como mostrado na codificação abaixo:

    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;  
    }
Em uma classe, além das características (propriedades) comuns aos objetos, temos também os comportamentos que aquele objeto pode executar. Veja um exemplo:

    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;
    
        public String exibirDados() {
            return "=== Dados da Pessoa ===" + "\n" +
                    "Nome: " + this.nome + "\n" +
                    "Email: " + this.email + "\n" +
                    "CPF: " + this.cpf;
        }
    }

Então, para a utilização de objetos precisamos definir as classes, por isso alguns defendem que poderíamos chamar de “Programação Orientada a Classes”, o que daria muito certo também!

### Objetos
Como já demos um spoiler, um objeto é criado a partir da definição de uma classe. Ele representa uma instância específica de um objeto existente em um conjunto de objetos.

### O que é Objeto na Orientação a Objetos?
Os objetos são essenciais na Programação Orientada a Objetos, pois serão eles que irão interagir e executar as funcionalidades do sistema. Então, tomando como exemplo a definição da classe Pessoa, do exemplo acima, para representar um único objeto do conjunto “pessoas” no Java, escrevemos da seguinte forma:

    //Definindo um objeto pessoa.
            Pessoa andre = new Pessoa();
            andre.nome = "André Silva";
            andre.email = "andre@email.com";
            andre.cpf = "1111111-11";
            System.out.println(andre.exibirDados());
    
             //Definindo um outro objeto pessoa.
             Pessoa helen = new Pessoa();
             helen.nome = "Helen Cardoso";
             helen.email = "helen@email.com";
             helen.cpf = "2222222-22";
             System.out.println(helen.exibirDados());

Note que no exemplo definimos dois objetos do tipo Pessoa e ambos possuem as mesmas propriedades: nome, email e cpf, mas cada um possui um conjunto de dados que os tornam diferentes.


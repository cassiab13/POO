package Exercicio1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa(30);

        pessoa1.setAge(25);
        pessoa2.setName("Maria");

        // Obtendo informações das pessoas
        System.out.println("Exercicio1.Pessoa 1: " + pessoa1.getName() + ", Idade: " + pessoa1.getAge());
        System.out.println("Exercicio1.Pessoa 2: " + pessoa2.getName() + ", Idade: " + pessoa2.getAge());
        }
    }

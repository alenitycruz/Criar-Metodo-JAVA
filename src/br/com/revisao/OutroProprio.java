package br.com.revisao;

public class OutroProprio {

    public static void nome(String primeiroNome, String sobrenome){

        String nomeCompleto = primeiroNome + sobrenome;

        System.out.println("Nome Completo: " + nomeCompleto);

    }
    public static void nasc(String dataDeNascimento){

        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
    public static void ano(int idade) {

        System.out.println("Idade: " + idade);
    }
    public static void address(String endereco) {

        System.out.println("Endereço: " + endereco);
    }
    public static void pais(String nacionalidade){

        System.out.println("Nacionalidade: " + nacionalidade);
    }
    public static void tamanho(float altura){

        System.out.println("Altura: " + altura);
    }
    public static void volume(double peso) {

        System.out.println("Peso: " + peso);
    }



}

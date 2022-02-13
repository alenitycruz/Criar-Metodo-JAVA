package br.com.revisao;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercícios da Calculadora");

        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println(" ");
        System.out.println(" ================================ ");
        System.out.println(" ");

        //Mensagem
        System.out.println("Exercícios de Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem( 1);

        System.out.println(" ");
        System.out.println(" ================================ ");
        System.out.println(" ");

        //Outro Próprio
        System.out.println("Formulário");
        OutroProprio.nome("Alessandra", "Cruz");
        OutroProprio.nasc("27/08/1987");
        OutroProprio.ano(34);
        OutroProprio.pais("Brasileira");
        OutroProprio.address("Rua do Hospício, n 111, apto 105. Bairro Boa Vista. Recife-PE");
        OutroProprio.tamanho(1.58f);
        OutroProprio.volume(69.5);

        System.out.println(" ");
        System.out.println(" ================================ ");
        System.out.println(" ");

        //Emprestimo
        System.out.println("Exercício de Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, Emprestimo.getCincoParcelas());
        Emprestimo.calcular(200, 6);
    }

}

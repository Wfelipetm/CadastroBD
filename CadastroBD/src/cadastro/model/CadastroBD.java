/*
    Autor: Wallace Tavares
 */
package cadastro.model;

import java.util.Scanner;

public class CadastroBD {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
            PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();

            boolean continuar = true;
            while (continuar) {
                InterfaceCadastro.Opcoes();

                int opcao = InterfaceCadastro.ler(scanner);

                switch (opcao) {
                    case 1 -> {
                        InterfaceCadastro.realizarInclusao(scanner, pessoaFisicaDAO, pessoaJuridicaDAO);
                    }
                    case 2 -> {
                        InterfaceCadastro.realizarAlteracao(scanner, pessoaFisicaDAO, pessoaJuridicaDAO);
                        break;
                    }
                    case 3 -> {
                        InterfaceCadastro.Exclusao(scanner, pessoaFisicaDAO, pessoaJuridicaDAO);
                        break;
                    }
                    case 4 -> {
                        InterfaceCadastro.ObterPorID(scanner, pessoaFisicaDAO, pessoaJuridicaDAO);
                        break;
                    }
                    case 5 -> {
                        InterfaceCadastro.Listagem(scanner, pessoaFisicaDAO, pessoaJuridicaDAO);
                        break;
                    }
                    case 0 ->
                        continuar = false;
                    default ->
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}

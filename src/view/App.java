package view;

import java.util.Scanner;

import data.PessoaData;
import data.StatusData;
import model.PessoaModel;
import model.StatusModel;

public class App {
    public static void main(String[] args) throws Exception {
        StatusModel objStatus = new StatusModel();
        PessoaModel objPessoa = new PessoaModel();
        StatusData DAOStatus = new StatusData();
        PessoaData DAOPessoa = new PessoaData();
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                System.out.println("---- MENU ----");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Novo Status" +
                "\n2 - Pesquisar Status"+
                "\n3 - Excluir Status"+
                "\n4 - Editar Status"+
                "\n----------------------"+
                "\n5 - Nova Pessoa" +
                "\n6 - Pesquisar Pessoa"+
                "\n7 - Excluir Pessoa"+
                "\n8 - Editar Pessoa"+
                "\n10 ------ SAIR ------");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição:");
                        objStatus.setDescricao(entrada.next());
                        if(DAOStatus.incluir(objStatus)) System.out.println("Salvo");
                        else System.out.println("Erro ao salvar.");
                        break;
                    case 5:
                        System.out.println("Digite o nome:");
                        objPessoa.setNome(entrada.next());
                        System.out.println("Digite o e-mail:");
                        objPessoa.setEmail(entrada.next());
                        System.out.println("Digite a senha:");
                        objPessoa.setSenha(entrada.next());
                        System.out.println("Digite o telefone:");
                        objPessoa.setTelefone(entrada.next());
                        System.out.println("Digite o endereço:");
                        objPessoa.setEndereco(entrada.next());
                        if(DAOPessoa.incluir(objPessoa)) System.out.println("Salvo");
                        else System.out.println("Erro ao salvar.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro:" + e.getMessage());
            }
        } while (opcao!=10);
    }
}

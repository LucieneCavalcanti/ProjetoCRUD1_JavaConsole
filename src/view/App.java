package view;

import java.util.Scanner;
import java.util.ArrayList;
import data.PessoaData;
import data.StatusData;
import model.PessoaModel;
import model.StatusModel;

public class App {
    static StatusModel objStatus = new StatusModel();
    static PessoaModel objPessoa = new PessoaModel();
    static StatusData DAOStatus;
    static PessoaData DAOPessoa;
    static int opcao = 0;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        DAOStatus = new StatusData();
        DAOPessoa = new PessoaData();
        do {
            try {
                System.out.println("---- MENU ----");
                System.out.println("\n\nEscolha uma opção:");
                System.out.println("1 - Novo Status" +
                "\n2 - Pesquisar Status"+
                "\n3 - Excluir Status"+
                "\n4 - Editar Status"+
                "\n----------------------"+
                "\n5 - Nova Pessoa" +
                "\n6 - Pesquisar Pessoa"+
                "\n7 - Excluir Pessoa"+
                "\n8 - Editar Pessoa"+
                "\n10 ------ SAIR ------\n\n");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição:");
                        objStatus.setDescricao(entrada.next());
                        if(DAOStatus.incluir(objStatus)) System.out.println("Salvo");
                        else System.out.println("Erro ao salvar.");
                        break;
                    case 2:
                        listarStatus();
                        break;
                    case 3:
                        listarStatus();
                        System.out.println("Digite um id: ");
                        int id = entrada.nextInt();
                        //mensagem
                        if(DAOStatus.excluir(id))
                            System.out.println("Apagado com sucesso!");
                        else
                            System.out.println("Erro ao excluir");
                        break;
                    case 4:
                        listarStatus();
                        System.out.println("Digite um id: ");
                        id = entrada.nextInt();
                        //mensagem
                        objStatus.setId(id);    
                        System.out.println("Digite a nova descrição:");
                        objStatus.setDescricao(entrada.next());

                        if(DAOStatus.atualizar(objStatus))
                            System.out.println("Atualizado com sucesso!");
                        else
                            System.out.println("Erro ao atualizar");
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
    public static void listarStatus() throws Exception{
        System.out.println("Digite parte da descrição:");
        String descricao = entrada.next();
        ArrayList<StatusModel> lista = DAOStatus.pesquisar(descricao);
        System.out.println("--- Lista de Status ---");
        for (StatusModel statusModel : lista) {
            System.out.println(statusModel.getId() + " - "
            +statusModel.getDescricao());                        
        }
    }
}

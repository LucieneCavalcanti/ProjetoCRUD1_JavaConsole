package view;

import java.util.Scanner;
import data.StatusData;
import model.StatusModel;

public class App {
    public static void main(String[] args) throws Exception {
        StatusModel obj = new StatusModel();
        StatusData DAO = new StatusData();
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
                "\n5 ----- SAIR ------");
                opcao = entrada.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição:");
                        obj.setDescricao(entrada.next());
                        if(DAO.incluir(obj)) System.out.println("Salvo");
                        else System.out.println("Erro ao salvar.");
                        break;
                
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro:" + e.getMessage());
            }
        } while (opcao!=5);
    }
}

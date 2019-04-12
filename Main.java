package br.com.edu.ifg.atividade1;

import br.com.edu.ifg.atividade1.cadastro.CadastrarFuncionario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Inicializando o sistema.....\n\n");
        CadastrarFuncionario service = new CadastrarFuncionario();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        whilePrograma:
        while (true) {            
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Cadastrar Funcionario ");
            System.out.println("[2] Excluir Funcionario ");
            System.out.println("[3] Listar Funcionarios ");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("\n\n");
            switch (opcao) {
                case 1:
                    service.cadastrar();
                    break;
                case 2:
                    service.excluir();
                    break;
                case 3:
                    service.listar();
                    break;
                case 4:
                    break whilePrograma;
            }
        }
        
    }
    
}

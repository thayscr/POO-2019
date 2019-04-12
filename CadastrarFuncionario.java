package br.com.edu.ifg.atividade1.cadastro;

import br.com.edu.ifg.atividade1.vo.Pessoa;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class CadastrarFuncionario{

    private List<Pessoa> listaDePessoas;

    public CadastrarFuncionario(){
        listaDePessoas = new ArrayList<>();
    }
    
    public void cadastrar(){
        System.out.println("------------Cadastrando um Novo Funcionario-----------");
        
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.print("Cadastro \n");
        
        System.out.print("Informe o Codigo: ");
        pessoa.setCodigo(scanner.nextInt());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe o Nome:");
        pessoa.setNome(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe o Idade: ");
        pessoa.setIdade(scanner.nextInt());
        
        scanner = new Scanner(System.in);
       System.out.print("Informe o Setor: ");
        pessoa.setSetor(scanner.nextLine());
        
        System.out.println("----------------------------------------------------");
        
        
       listaDePessoas.add(pessoa);
       
    }
    
    public void excluir(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("--------------Excluir Funcionario---------------");
        System.out.println("Informe o Código da pessoa para Excluir: ");
        pessoa.setCodigo(scanner.nextInt());
        listaDePessoas.remove(pessoa);
        System.out.println("-------------Excluido com Sucesso!---------------");
              
    }
    
    public void verDetalhes(int codigo){
        
    }
    
    public void listar(){
        for (Pessoa itemDaLista : listaDePessoas) {
            System.out.println("-----------Dados do Funcionario---------- ");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("Idade: "+itemDaLista.getIdade());
            System.out.println("--------------------------------------\n");
        }
             
    }
    
}

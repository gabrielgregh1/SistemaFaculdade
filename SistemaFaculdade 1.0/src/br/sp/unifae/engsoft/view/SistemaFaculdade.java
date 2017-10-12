
package br.sp.unifae.engsoft.view;

import br.sp.unifae.engsoft.model.Aluno;
import br.sp.unifae.engsoft.model.Curso;
import br.sp.unifae.engsoft.model.Faculdade;
import br.sp.unifae.engsoft.model.Graduacao;
import br.sp.unifae.engsoft.model.PosGraduacao;
import br.sp.unifae.engsoft.model.Universidade;
import java.util.Scanner;


public class SistemaFaculdade {
    
    private static Faculdade faculdade = new Faculdade();
    private static Universidade universidade = new Universidade();
    private static Curso curso = new Curso();
    private static Graduacao graduacao = new Graduacao();
    private static PosGraduacao pos = new PosGraduacao();
    private static Scanner leitor = new Scanner(System.in);
    
    
    private static void menu(){
        int opcao=1;
        
        do{
            System.out.println("<1> Cadastrar Faculdade\n"+
                               "<2> Cadastrar Curso em Faculdade\n"+
                               "<3> Cadastrar Aluno Graduacao em Curso\n"+
                               "<4> Exibir Dados\n");
            int escolha =leitor.nextInt();                    
            
            switch(escolha){
                case 1:
                    cadastrarFaculdade();
                    break;
                case 2:
                    cadastrarCursoEmFaculdade();
                    break;
                case 3:
                    cadastrarAlunoGraduacaoEmCuso();
                    break;
                case 4:
                    exibirDados();
                    break;
            }
        }while(opcao!=0);
    
    }
    
    private static void cadastrarFaculdade(){
        System.out.println("Informe o nome da Faculdade: ");
        String nomeFaculdade = leitor.next();
        
        faculdade = new Faculdade(nomeFaculdade);
        boolean cadastrou = universidade.cadastrarFaculdade(faculdade);
        if(cadastrou){
            System.out.println("SUCESSO AO CADASTRAR "+nomeFaculdade+"!");
        }
        else
            System.out.println("HOUVE UM ERRO AO CADASTRAR!");
    }
    
    private static void cadastrarCursoEmFaculdade(){
        System.out.println("Informe o nome da Faculdade que deseja cadastar o curso: ");
        String nomeFaculdade =leitor.next();
        
        System.out.println("Informe o NOME do curso: ");
        String nomeCurso = leitor.next();
        
        System.out.println("Informe o numero de semestre deste curso: ");
        int nSemestres = leitor.nextInt();
        
        curso = new Curso(nomeCurso,nSemestres);
        boolean cadastrou = universidade.cadastrarCursoEmFaculdade(nomeFaculdade, curso);
        if(cadastrou)
            System.out.println("SUCESSO AO CADASTRAR");
        else
            System.out.println("HOUVE UM ERRO AO CADASTRAR");
        
    }
    
    private static void cadastrarAlunoGraduacaoEmCuso(){
        System.out.println("Informe o nome do Aluno: ");
        String nome = leitor.next();
        
        System.out.println("Informe o ra do Aluno: ");
        String ra = leitor.next();
        
        System.out.println("Informe a série do Aluno: ");
        int serie = leitor.nextInt();
        
        System.out.println("Em qual FACULDADE deseja cadastrar o aluno? ");
        String nomeFaculdade = leitor.next();
        
        System.out.println("Em qual CURSO deseja cadastrar o aluno? ");
        String nomeCurso = leitor.next();
        
        graduacao = new Graduacao(nome,ra,serie);
        boolean cadastrou = universidade.cadastarAlunoEmFaculdade(graduacao, nomeFaculdade, nomeCurso);
        
        if(cadastrou)
            System.out.println("SUCESSO AO CADASTRAR");
        else
            System.out.println("HOUVE UM ERRO AO CADASTRAR");
    }
    
    public static void exibirDados(){
        
        System.out.println("--------------- FICHA INFORMATIVA ---------------");
        System.out.println("UNIVERSIDADE AMISTER");
        System.out.println(universidade.toString());
        
    }
    
    
    public static void main(String[] args) {
        
        menu();
        
        
        
    }
    
}

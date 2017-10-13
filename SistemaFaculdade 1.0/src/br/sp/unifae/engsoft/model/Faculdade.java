package br.sp.unifae.engsoft.model;

public class Faculdade {
    private String nome;
    private Curso[] cursos = new Curso[10];
    private int qtdCursos=0;

    public Faculdade(){}
    public Faculdade(String nome) {this.nome = nome;}
    
    public boolean cadastrarCurso(Curso novoCurso){
        if(qtdCursos<cursos.length){
            cursos[qtdCursos++]=novoCurso;
            return true;
        }
        return false;
    }
    
    public boolean cadastrarAlunoGraduacaoEmCurso(Aluno novoAluno,String cursoEscolhido){
       for(int i = 0; i <qtdCursos ; i++){
           if(cursos[i].getNome().equalsIgnoreCase(cursoEscolhido)){
              if(cursos[i].cadastrarAluno(novoAluno))
                  return true;
           }
       }
        return false;
    }

    public int getQtdCursos() {
        return qtdCursos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
       StringBuilder info = new StringBuilder();
       String resultadoFaculdade = "\n"+nome+"\n";
       String resultadoCurso="";
       
       for(int i = 0 ; i<qtdCursos ; i++){
           resultadoCurso=""+info.append("\t").append(cursos[i].toString()).append("\n");
           
       }
       
       return resultadoFaculdade+resultadoCurso;
    }
    
    
}

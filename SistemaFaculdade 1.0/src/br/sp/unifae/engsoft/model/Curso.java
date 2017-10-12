package br.sp.unifae.engsoft.model;


public class Curso {
    private String nome;
    private int semestres;
    private int qtdAlunos=0;
    private Aluno[] alunos = new Aluno[10];
    
    
    public Curso() {
    }

    public Curso(String nome, int semestres) {
        this.nome = nome;
        this.semestres = semestres;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    
    public String getNome() {
        return nome;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }
    
    public boolean cadastrarAluno(Aluno alunoNovo){
        if(qtdAlunos < alunos.length){
              alunos[qtdAlunos++]=alunoNovo;
              return true;    
           }
        return false;
    }   

    @Override
    public String toString() {
       StringBuilder info = new StringBuilder();
       String resultadoCurso = nome +"                       "+semestres+"\n";
       String resultadoAluno="";
       
       for(int i = 0 ; i < qtdAlunos ; i++){
           
           resultadoAluno=""+info.append(alunos[i].toString()).append("\n");
       }
       
       return resultadoCurso+resultadoAluno;
    }
 
    
}

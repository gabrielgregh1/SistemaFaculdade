

package br.sp.unifae.engsoft.model;



public abstract class Aluno {
    private  String nome;
    private String ra;
    
    public Aluno(){}
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
    
    

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRA: " + ra;
    }
    
    
    
}

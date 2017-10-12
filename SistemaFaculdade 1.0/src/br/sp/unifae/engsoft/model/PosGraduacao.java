
package br.sp.unifae.engsoft.model;


public class PosGraduacao extends Aluno{
    private String areaDeAplicacao;

    public PosGraduacao(String nome, String ra, String areaDeAplicacao) {
        super(nome, ra);
        this.areaDeAplicacao=areaDeAplicacao;
    }
    public PosGraduacao(){}

    @Override
    public String toString() {
        String resultado=super.toString();
                
        return resultado+="Area de Aplicacao: " + areaDeAplicacao;
    }
    
    

    
}


package br.sp.unifae.engsoft.model;


public class Graduacao extends Aluno{
    private int serie;

 
    public Graduacao(String nome, String ra,int serie) {
        super(nome, ra);
        this.serie=serie;   
    }
    public Graduacao(){}

    public int getSerie() {
        return serie;
    }
    
    @Override
    public String toString(){
        String resultado = super.toString();
        return resultado+="\n\t\tSerie: "+serie;
    }
    
    
    
}


package br.sp.unifae.engsoft.model;



public class Universidade {
    private Faculdade[] faculdades = new Faculdade[10];
    private int qtdFaculdades=0;

    public Universidade(){}
    
    
    
    public boolean cadastrarFaculdade(Faculdade novaFaculdade){
        if(qtdFaculdades < faculdades.length){
            faculdades[qtdFaculdades++]=novaFaculdade;
            return true;
        }
        return false;
    }
    
    public boolean cadastrarCursoEmFaculdade(String nomeFaculdade,Curso novoCurso){
        for(int i = 0 ; i < qtdFaculdades ; i++){
            if(faculdades[i].getNome().equalsIgnoreCase(nomeFaculdade)){
                faculdades[i].cadastrarCurso(novoCurso);
                return true;  
            }       
        }
        return false;    
    }

    public boolean cadastarAlunoEmFaculdade(Graduacao novoGraduacao,String nomeFaculdade,String nomeCurso){
        for(int i = 0 ; i < qtdFaculdades ; i++){
            if(faculdades[i].getNome().equalsIgnoreCase(nomeFaculdade)){
                if(faculdades[i].cadastrarAlunoGraduacaoEmCurso(novoGraduacao, nomeCurso))
                return true;
            }
        }
        return false;    
        
    }
    
    @Override
    public String toString(){
        StringBuilder info = new StringBuilder();
        String resultado=null;
        
        for(int i = 0 ; i < qtdFaculdades ; i++){        
            resultado = ""+info.append(faculdades[i].toString()).append("\n");

        }
        return resultado;
    }
    
    
}

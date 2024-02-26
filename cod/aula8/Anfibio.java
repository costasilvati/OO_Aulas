package aula13;

public class Anfibio extends Animal{
    
    
    public Anfibio(String nome, int patas, double velocidade){
        super(nome, patas, velocidade);
    }
    
    @Override
    public void mover(){
        System.out.println("Anfíbio _    _    _    _>\n");
        super.setLocalizacao(1);
    }
}

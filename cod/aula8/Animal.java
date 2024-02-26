package aula13;

public class Animal {
    private String nome;
    private int patas;
    private double velocidade;
    int localizacao = 0;
    
    public Animal (){} //Construtor vazio
    
    //Construtor cheio
    public Animal (String nome, int patas, double velocidade){
        this.nome = nome;
        this.patas = patas;
        this.velocidade = velocidade;
    }
    
    public void mover(){
        System.out.println("Animal --------->");
        this.localizacao++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao += localizacao;
    }
    
    
    
    
}

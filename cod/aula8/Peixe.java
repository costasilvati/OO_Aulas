package aula13;

public class Peixe extends Animal{
    /* 0 - doce, 1 - salgada */
    private int agua;
    
    public Peixe(String nome, int patas, 
            double velocidade, int agua){ //localizacao
        
        super(nome, patas, velocidade);
        this.agua = agua;
    }
    
    @Override
    public void mover(){
        System.out.println(
          "Peixe .    ..    ..    ...>\n"
        + "      '..'  '..'  '..'");
       this.localizacao++;
    } //... getAgua() e setAgua()

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
    
}

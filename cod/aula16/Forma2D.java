// Cria uma classe abstrata.
public abstract class Forma2D {
    private double largura;
    private double altura;
    private String nome;

    //Construtor vazio  
    Forma2D() {
        largura = altura = 0.0;
        nome = "nada";
    }
    // Construtor parametrizado. 
    Forma2D(double w, double h, String n) {
        largura = w;
        altura = h;
        nome = n;
    }
    
    // Agora, area( ) eh abstrato. 
    public abstract double area();
    
    // Constroi objeto com largura e altura iguais. 
    Forma2D(double x, String n) {
        largura = altura = x;
        nome = n;
    }
    // Metodos Get e Set para largura e altura. 
    double getLargura() { return largura; } 
    double getAltura() { return altura; } 
    String getNome() {return nome;}
    void setLargura(double w) { largura = w; }
    void setAltura(double h) {altura = h;}
    void setNome(String n){nome = n;}
    
    void showDim() {
        System.out.println("Largura e altura:"
          + largura + " e " + altura);
    }
    
    // Constroi um objeto a partir de outro. 
    Forma2D(Forma2D ob) {
        largura = ob.largura;
        altura = ob.altura;
        nome = ob.nome;
    }
    	
}

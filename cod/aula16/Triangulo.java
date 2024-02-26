// Subclasse de Forma2D para triangulos. 
class Triangulo extends Forma2D {
    private String style;
    
    // Construtor padrao 
    Triangulo() {
        super(); 
        style = "nada"; 
    } 
    // Construtor para Triangulo. 
    Triangulo(String s, double w, double h) {
        super(w, h, "triangulo");
        style = s; 
    } 
    
    public double area() { 
        return getLargura() * getAltura() / 2;
    } 
    
    // Construtor com um argumento. 
    Triangulo(double x) { 
        super(x, "triangulo");
        // chama construtor da superclasse 
        style = "pontilhado"; 
    } 
    
    // Constroi um objeto a partir de outro. 
    Triangulo(Triangulo ob) { 
        super(ob);
        // passa objeto para construtor de Forma2D 
        style = ob.style; 
    } 
    
    void showStyle() { 
        System.out.println("Triangulo " + style);
    } 
}
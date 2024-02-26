
public class TestaForma {
  public static void main(String[] args) {
      
      Retangulo ret = new Retangulo(5.0, 8.0) ;
      
      Triangulo tri = new Triangulo(); //Usando construtor vazio
      tri.setAltura(15.0);
      tri.setLargura(7.0);
      
      System.out.println("A área do retangulo é "+ ret.area());
      
      double areaTri = tri.area();
      System.out.println("A área do triângulo é "+ String.format("%.2f",areaTri));
  }
}









//        for (int i = 0; i < formas.length; i++) {
//            String msg = 
//              "Digite estilo, largura e altura da forma, serparados por virgula\n"
//            + "Exemplo: pontilhado,12,12";
//            String dados[] = JOptionPane.showInputDialog(msg).split(",");
//            formas[i] = new Triangulo(
//              dados[0], 
//              Double.parseDouble(dados[1]),
//              Double.parseDouble(dados[2])
//            );
//        }


package aula13;

/**
 *
 * @author juliana
 */
public class Aula13 {
  public static void main(String[] args) {  
    // Objetos que herdam Animal  
    Peixe peixe = new Peixe("Lambari", 0, 0.2, 0);
    Anfibio anfibio = new Anfibio("Sapo Cururu", 4, 0.8);
    Peixe peixe2 = new Peixe("Tilápia", 0,0.3, 0);
      
    Animal animais[] = {peixe,anfibio, peixe2};
       
    for (int i = 0; i < animais.length; i++) {
        System.out.println("Nome: " + animais[i].getNome());
        animais[i].mover();
    }
  }
}

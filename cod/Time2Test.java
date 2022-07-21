
import javax.swing.JOptionPane;

public class Time2Test {
    public static void main(String[] args) {
        String hora = JOptionPane.showInputDialog("Digite a horario 1");
        String hora2 = JOptionPane.showInputDialog("Digite o horario 2");
        
        String[] timeString1 = hora.split(":");
        
        Time2 newTime = new Time2(
          Integer.parseInt(timeString1[0]),
          Integer.parseInt(timeString1[1]),
          Integer.parseInt(timeString1[2]));
        //Testando outros construtores
        
        String[] timeString2 = hora2.split(":");
        Time2 newTime2 = new Time2(
          Integer.parseInt(timeString2[0]),
          Integer.parseInt(timeString2[1]),
          Integer.parseInt(timeString2[2]));
    }
}

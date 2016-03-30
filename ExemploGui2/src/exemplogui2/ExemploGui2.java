package exemplogui2;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class ExemploGui2 {
    public static void main(String[] args) {
       JFrame marco = new JFrame("Primeiro programa GUI");
       marco.setSize(600, 800);//Tamaño de la ventana
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al pulsar la x de la ventana que se deje de ejecutar el programa
       marco.setVisible(true);//Visualizar la ventana
       JDialog venta = new JDialog(marco);//Ventana secundaria
       venta.setBounds(100, 200, 200, 200);
       venta.setVisible(true);
       venta.setBackground(Color.yellow);
       
    }
    
}

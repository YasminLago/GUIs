package exemplogui1;

import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class ExemploGui1 {
    public static void main(String[] args) {
       JFrame marco = new JFrame("Primeiro programa GUI");
       marco.setSize(600, 800);//Tamaño de la ventana
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Al pulsar la x de la ventana deja de ejecutarse el programa
       marco.setVisible(true);//Visualizar la ventana
    }
    
}

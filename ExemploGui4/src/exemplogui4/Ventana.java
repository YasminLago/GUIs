package exemplogui4;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Ventana {
    
    public void crearVenta(){
        JFrame marco = new JFrame("Ventana con compoñentes");//Crease o marco 
            marco.setSize(800, 800);//Dase tamaño o marco
        JPanel panel = new JPanel();//Crease un panel para añadir compoñentes
            panel.setSize(700, 700);
            panel.setBackground(Color.GREEN);
        JButton boton = new JButton("Preme");//Crease un boton
            boton.setBounds(200,50, 50, 50);//Tamaño do boton
            boton.setBackground(Color.YELLOW);
            boton.setMnemonic('a');//Activase o boton coa letra a
            boton.setToolTipText("Boton");//Ao pasar o rato por enrriba do boton aparece un texto
        JLabel etiqueta = new JLabel("Isto e unha etiqueta");//Crease unha etiqueta
        JTextField casilla = new JTextField(30);//Crease unha casilla
            casilla.setBounds(100, 100, 100, 100);
        JPasswordField contrasinal = new JPasswordField(10);//Os caracteres que se introducen ocultanse
            contrasinal.setBounds(200, 200,200 ,200);
        //Añadimos os distintos compoñentes o panel
            panel.add(boton);
            panel.add(etiqueta);
            panel.add(casilla);
            panel.add(contrasinal);
        //Añadimos o panel o marco
            marco.add(panel);
            marco.setLocationRelativeTo(null);//Centra a ventana
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
        
    }
}

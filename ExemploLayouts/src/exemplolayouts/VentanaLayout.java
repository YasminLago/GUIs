package exemplolayouts;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class VentanaLayout {
    public void crearVenta(){
        JFrame marco = new JFrame("Ventana con compoñentes");//Crease o marco 
            marco.setSize(800, 800);//Dase tamaño o marco
        JPanel panel = new JPanel();//Crease un panel para añadir compoñentes
        JButton boton1 = new JButton("Boton1");
            boton1.setBackground(Color.YELLOW);
            boton1.setSize(50, 50);
        JButton boton2 = new JButton("Boton2");
            boton2.setBackground(Color.RED);
            boton2.setSize(50, 50);
        JButton boton3 = new JButton("Boton3");
            boton3.setBackground(Color.BLACK);
            boton3.setSize(50, 50);
        JButton boton4 = new JButton("Boton4");
            boton4.setBackground(Color.BLUE);
            boton4.setSize(50, 50);
        JButton boton5 = new JButton("Boton5");
            boton5.setBackground(Color.CYAN);
            boton5.setSize(50, 50);
        FlowLayout dis = new FlowLayout(20,30,50);
            panel.setLayout(dis);
            panel.add(boton1);
            panel.add(boton2);
            panel.add(boton3);
            panel.add(boton4);
            panel.add(boton5);
            
            marco.add(panel);
            marco.setLocationRelativeTo(null);//Centra a ventana
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
    }
}

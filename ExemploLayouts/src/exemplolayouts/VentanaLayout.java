package exemplolayouts;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class VentanaLayout {
    public void crearVenta(){
        JFrame marco = new JFrame("Ventana con compoñentes"); 
            marco.setSize(800, 800);
        JPanel panel = new JPanel();
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
        JButton boton6 = new JButton("Boton6");
            boton6.setBackground(Color.GREEN);
            boton6.setSize(50, 50);
            
        //FlowLayout dis = new FlowLayout(FlowLayout.RIGHT,2,16);
            //panel.setLayout(dis);
            
        //panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        /*panel.setLayout(new BorderLayout());
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.WEST);
        panel.add(boton3,BorderLayout.SOUTH);
        panel.add(boton4,BorderLayout.CENTER);
        panel.add(boton5,BorderLayout.EAST);*/
        
        panel.setLayout(new GridLayout(2,3));
        
            panel.add(boton1);
            panel.add(boton2);
            panel.add(boton3);
            panel.add(boton4);
            panel.add(boton5);
            panel.add(boton6);
            
            marco.add(panel);
            marco.pack();
            marco.setLocationRelativeTo(null);
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
    }
}

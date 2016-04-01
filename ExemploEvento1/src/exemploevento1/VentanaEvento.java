package exemploevento1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ylagorebollar
 */
public class VentanaEvento implements ActionListener{
    JFrame marco; 
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    
    public void crearVentana(){
        marco = new JFrame("***Evento 1***");
            marco.setSize(500,500);
        panel = new JPanel();
        boton = new JButton("Preme");
            boton.setBackground(Color.CYAN);
        etiqueta = new JLabel();
        
        //Monitorizacion do boton
        boton.addActionListener(this);
        
        panel.add(boton);
        panel.add(etiqueta);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Premes o boton");
    }
}

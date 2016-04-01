package exemploevento2;

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
    JButton botonPremer, botonLimpar;
    JLabel etiqueta;
    
    public void crearVentana(){
        marco = new JFrame("***Evento 2***");
            marco.setSize(500,500);
        panel = new JPanel();
            panel.setBackground(Color.MAGENTA);
        botonPremer = new JButton("Preme");
            botonPremer.setBackground(Color.CYAN);
        botonLimpar = new JButton("Limpar");
            botonLimpar.setBackground(Color.DARK_GRAY);
        etiqueta = new JLabel();
        
        //Monitorizacion do boton
        botonPremer.addActionListener(this);
        botonLimpar.addActionListener(this);
        
        panel.add(etiqueta);
        panel.add(botonPremer);
        panel.add(botonLimpar);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
            if (obx == botonPremer)
                etiqueta.setText("Premes o boton");
            else
                etiqueta.setText("");
            
        //Para saber de que clase e o obxeto obx :
            //if(obx instanceof JX)
        
    }
}

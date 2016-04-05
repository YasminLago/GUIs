package exemploeventoclaseanonima;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class VentanaClaseAnonima{
    JFrame marco; 
    JPanel panel;
    JButton botonPremer;
    static JLabel  etiqueta;
    
    public void amosar(){
        marco = new JFrame("Evento venta externa");
            marco.setSize(500,500);
        panel = new JPanel();
            panel.setBackground(Color.GREEN);
        botonPremer = new JButton("Preme");
            botonPremer.setBackground(Color.ORANGE);
        etiqueta = new JLabel();
        
        //Layouts
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        //Engade elementos
        panel.add(botonPremer);
        panel.add(etiqueta);
        
        marco.add(panel);
        
        //Asociamos Listener
        botonPremer.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            etiqueta.setText("Dende unha clase anonima");
        }});
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

package exemploeventoclaseinterna;

import java.awt.event.*;

/**
 *
 * @author ylagorebollar
 */
public class ClaseInterna implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
       VentanaClaseInterna.etiqueta.setText("Prememos o boton");
    }
}

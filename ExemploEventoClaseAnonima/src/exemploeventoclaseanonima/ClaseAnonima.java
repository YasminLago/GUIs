package exemploeventoclaseanonima;

import java.awt.event.*;

/**
 *
 * @author ylagorebollar
 */
public class ClaseAnonima implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
       VentanaClaseAnonima.etiqueta.setText("Prememos o boton");
    }
}

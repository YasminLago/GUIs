package exemploevento3;

import java.awt.event.*;

/**
 *
 * @author ylagorebollar
 */
public class ClaseExterna implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Ventana.etiqueta.setText("Prememos o boton");
    }
}

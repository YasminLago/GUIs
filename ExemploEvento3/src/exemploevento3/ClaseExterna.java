package exemploevento3;

import java.awt.event.*;

/**
 *
 * @author ylagorebollar
 */
public class ClaseExterna implements ActionListener{
    Ventana obx = new Ventana();

    @Override
    public void actionPerformed(ActionEvent e) {
       obx.etiqueta.setText("******");
    }
}

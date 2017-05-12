package com.uninorte.sistemas53;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by pilo_injema on 10/05/2017.
 */
public class Boton implements Border {

    int Radio;

    Boton(int Radio) {
        this.Radio = Radio;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int i, int i1, int i2, int i3) {
        g.drawRoundRect(i, i1, i2 - 1, i3 - 1, Radio, Radio);
    }

    @Override
    public Insets getBorderInsets(Component component) {
        return new Insets(this.Radio + 1, this.Radio + 1, this.Radio + 2, this.Radio);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}

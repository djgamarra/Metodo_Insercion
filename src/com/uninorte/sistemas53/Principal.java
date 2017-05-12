package com.uninorte.sistemas53;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pilo_injema on 9/05/2017.
 */
public class Principal extends JFrame implements ActionListener {

    int contd = 0, ituno[] = new int[50], itdos[] = new int[50], ittres[] = new int[50], itcuatro[] = new int[50], itcinco[] = new int[50], itseis[] = new int[50], iti[] = new int[50], itj[] = new int[50], itvar[] = new int[50];
    JButton ok, siguiente, anterior;
    JPanel def, espejo, otros;
    JLabel bienv, gene, rellu, relld;
    JTextField u, d, t, c, ci, s, eu, ed, et, ec, eci, es, textvar, textj, texti;
    Color light, dark, turquesa, cereza, esmeralda, celeste, fucsia;

    public Principal() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Metodo de inserción");
        this.setResizable(false);
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 1, 3, 3));

        relld = new JLabel();
        rellu = new JLabel();

        def = new JPanel();
        espejo = new JPanel();
        otros = new JPanel();
        anterior = new JButton("Anterior");
        ok = new JButton("Aceptar");
        siguiente = new JButton("Siguiente");
        bienv = new JLabel("Rellene al arreglo");
        gene = new JLabel("Arreglo generado");
        u = new JTextField("");
        d = new JTextField("");
        t = new JTextField("");
        c = new JTextField("");
        ci = new JTextField("");
        s = new JTextField("");
        eu = new JTextField("");
        ed = new JTextField("");
        et = new JTextField("");
        ec = new JTextField("");
        eci = new JTextField("");
        es = new JTextField("");
        textvar = new JTextField(" VAR:");
        textj = new JTextField(" j:");
        texti = new JTextField(" i:");

        this.ok.setFocusPainted(false);
        this.ok.setContentAreaFilled(false);

        this.eu.setEditable(false);
        this.ed.setEditable(false);
        this.et.setEditable(false);
        this.ec.setEditable(false);
        this.eci.setEditable(false);
        this.es.setEditable(false);
        this.texti.setEditable(false);
        this.textj.setEditable(false);
        this.textvar.setEditable(false);

        light = new Color(236, 240, 241);
        dark = new Color(44, 62, 80);
        turquesa = new Color(22, 160, 133);
        cereza = new Color(231, 76, 60);
        esmeralda = new Color(46, 204, 113);
        celeste = new Color(128, 222, 234);
        fucsia = new Color(45, 204, 155);

        this.getContentPane().setBackground(turquesa);
        this.def.setBackground(turquesa);
        this.espejo.setBackground(turquesa);
        this.otros.setBackground(turquesa);

        this.bienv.setHorizontalAlignment((int) Principal.CENTER_ALIGNMENT);
        this.gene.setHorizontalAlignment((int) Principal.CENTER_ALIGNMENT);

        this.textvar.setBackground(light);
        this.texti.setBackground(light);
        this.textj.setBackground(light);
        this.textvar.setForeground(dark);
        this.texti.setForeground(dark);
        this.textj.setForeground(dark);
        this.textvar.setBorder(new LineBorder(dark));
        this.texti.setBorder(new LineBorder(dark));
        this.textj.setBorder(new LineBorder(dark));

        this.u.setBackground(esmeralda);
        this.d.setBackground(esmeralda);
        this.t.setBackground(esmeralda);
        this.c.setBackground(esmeralda);
        this.ci.setBackground(esmeralda);
        this.s.setBackground(esmeralda);
        this.u.setForeground(dark);
        this.d.setForeground(dark);
        this.t.setForeground(dark);
        this.c.setForeground(dark);
        this.ci.setForeground(dark);
        this.s.setForeground(dark);
        this.u.setBorder(new LineBorder(dark));
        this.d.setBorder(new LineBorder(dark));
        this.t.setBorder(new LineBorder(dark));
        this.c.setBorder(new LineBorder(dark));
        this.ci.setBorder(new LineBorder(dark));
        this.s.setBorder(new LineBorder(dark));

        this.eu.setBackground(cereza);
        this.ed.setBackground(cereza);
        this.et.setBackground(cereza);
        this.ec.setBackground(cereza);
        this.eci.setBackground(cereza);
        this.es.setBackground(cereza);
        this.eu.setForeground(dark);
        this.ed.setForeground(dark);
        this.et.setForeground(dark);
        this.ec.setForeground(dark);
        this.eci.setForeground(dark);
        this.es.setForeground(dark);
        this.eu.setBorder(new LineBorder(dark));
        this.ed.setBorder(new LineBorder(dark));
        this.et.setBorder(new LineBorder(dark));
        this.ec.setBorder(new LineBorder(dark));
        this.eci.setBorder(new LineBorder(dark));
        this.es.setBorder(new LineBorder(dark));

        this.ok.setBackground(esmeralda);
        this.ok.setForeground(dark);
        this.siguiente.setBackground(cereza);
        this.siguiente.setForeground(dark);
        this.anterior.setBackground(light);
        this.anterior.setForeground(dark);
        this.anterior.setBorder(new LineBorder(dark));

        this.bienv.setFont(u.getFont().deriveFont(20f));
        this.gene.setFont(u.getFont().deriveFont(20f));
        this.u.setFont(u.getFont().deriveFont(20f));
        this.d.setFont(u.getFont().deriveFont(20f));
        this.t.setFont(u.getFont().deriveFont(20f));
        this.c.setFont(u.getFont().deriveFont(20f));
        this.ci.setFont(u.getFont().deriveFont(20f));
        this.s.setFont(u.getFont().deriveFont(20f));
        this.eu.setFont(u.getFont().deriveFont(20f));
        this.ed.setFont(u.getFont().deriveFont(20f));
        this.et.setFont(u.getFont().deriveFont(20f));
        this.ec.setFont(u.getFont().deriveFont(20f));
        this.eci.setFont(u.getFont().deriveFont(20f));
        this.es.setFont(u.getFont().deriveFont(20f));
        this.anterior.setFont(u.getFont().deriveFont(20f));
        this.siguiente.setFont(u.getFont().deriveFont(20f));
        this.ok.setFont(u.getFont().deriveFont(20f));
        this.textvar.setFont(u.getFont().deriveFont(20f));
        this.textj.setFont(u.getFont().deriveFont(20f));
        this.texti.setFont(u.getFont().deriveFont(20f));

        this.def.setLayout(new GridLayout(1, 7, 5, 5));
        this.espejo.setLayout(new GridLayout(1, 7, 5, 5));
        this.otros.setLayout(new GridLayout(1, 6, 5, 5));

        this.ok.setBorder(new Boton(10));
        this.siguiente.setBorder(new Boton(20));


        this.def.add(u);
        this.def.add(d);
        this.def.add(t);
        this.def.add(c);
        this.def.add(ci);
        this.def.add(s);
        this.def.add(ok);

        this.espejo.add(eu);
        this.espejo.add(ed);
        this.espejo.add(et);
        this.espejo.add(ec);
        this.espejo.add(eci);
        this.espejo.add(es);
        this.espejo.add(siguiente);

        this.otros.add(rellu);
        this.otros.add(textvar);
        this.otros.add(texti);
        this.otros.add(textj);
        this.otros.add(anterior);
        this.otros.add(relld);

        this.add(bienv);
        this.add(def);
        this.add(gene);
        this.add(espejo);
        this.add(otros);

        this.ok.addActionListener(this);
        this.siguiente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ac) {

        int sw, cont = 0;


        if (ac.getSource().equals(ok)) {
            cont = 0;
            contd = 0;
            try {
                int v[] = new int[6];
                sw = Integer.parseInt(u.getText());
                v[0] = sw;
                sw = Integer.parseInt(d.getText());
                v[1] = sw;
                sw = Integer.parseInt(t.getText());
                v[2] = sw;
                sw = Integer.parseInt(c.getText());
                v[3] = sw;
                sw = Integer.parseInt(ci.getText());
                v[4] = sw;
                sw = Integer.parseInt(s.getText());
                v[5] = sw;
                for (int i = 1; i < 6; i++) {
                    int VAR = v[i];
                    int j = 0;
                    ituno[cont] = v[0];
                    itdos[cont] = v[1];
                    ittres[cont] = v[2];
                    itcuatro[cont] = v[3];
                    itcinco[cont] = v[4];
                    itseis[cont] = v[5];
                    iti[cont] = i;
                    itj[cont] = j;
                    itvar[cont] = VAR;
                    cont = cont + 1;
                    for (j = i - 1; j >= 0 && v[j] > VAR; j--) {
                        v[j + 1] = v[j];
                        ituno[cont] = v[0];
                        itdos[cont] = v[1];
                        ittres[cont] = v[2];
                        itcuatro[cont] = v[3];
                        itcinco[cont] = v[4];
                        itseis[cont] = v[5];
                        iti[cont] = i;
                        itj[cont] = j;
                        itvar[cont] = VAR;
                        cont = cont + 1;
                    }
                    v[j + 1] = VAR;
                    ituno[cont] = v[0];
                    itdos[cont] = v[1];
                    ittres[cont] = v[2];
                    itcuatro[cont] = v[3];
                    itcinco[cont] = v[4];
                    itseis[cont] = v[5];
                    iti[cont] = i;
                    itj[cont] = j;
                    itvar[cont] = VAR;
                    cont = cont + 1;
                }
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Solo se aceptan digitos de tipo Entero en el array", "Error de digitacion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            eu.setText(" " + u.getText());
            ed.setText(" " + d.getText());
            et.setText(" " + t.getText());
            ec.setText(" " + c.getText());
            eci.setText(" " + ci.getText());
            es.setText(" " + s.getText());
        }
        if (ac.getSource().equals(siguiente)) {
            try {
                String swd;
                swd = String.valueOf(ituno[contd]);
                eu.setText(" " + swd);
                swd = String.valueOf(itdos[contd]);
                ed.setText(" " + swd);
                swd = String.valueOf(ittres[contd]);
                et.setText(" " + swd);
                swd = String.valueOf(itcuatro[contd]);
                ec.setText(" " + swd);
                swd = String.valueOf(itcinco[contd]);
                eci.setText(" " + swd);
                swd = String.valueOf(itseis[contd]);
                es.setText(" " + swd);
                swd = String.valueOf(iti[contd]);
                texti.setText(" i: " + swd);
                swd = String.valueOf(itj[contd]);
                textj.setText(" j: " + swd);
                swd = String.valueOf(itvar[contd]);
                textvar.setText(" VAR: " + swd);
                contd = contd + 1;
            } catch (Exception exc) {
                contd--;
                JOptionPane.showConfirmDialog(null, "Fin de las iteraciones", "FIN", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (ac.getSource().equals(anterior)) {
            try {
                String swd;
                swd = String.valueOf(ituno[contd]);
                eu.setText(" " + swd);
                swd = String.valueOf(itdos[contd]);
                ed.setText(" " + swd);
                swd = String.valueOf(ittres[contd]);
                et.setText(" " + swd);
                swd = String.valueOf(itcuatro[contd]);
                ec.setText(" " + swd);
                swd = String.valueOf(itcinco[contd]);
                eci.setText(" " + swd);
                swd = String.valueOf(itseis[contd]);
                es.setText(" " + swd);
                swd = String.valueOf(iti[contd]);
                texti.setText(" i: " + swd);
                swd = String.valueOf(itj[contd]);
                textj.setText(" j: " + swd);
                swd = String.valueOf(itvar[contd]);
                textvar.setText(" VAR: " + swd);
                contd = contd - 1;
            } catch (Exception exc) {
                contd++;
                JOptionPane.showConfirmDialog(null, "Se encuentra en la primera iteracion", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

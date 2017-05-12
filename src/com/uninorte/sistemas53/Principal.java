package com.uninorte.sistemas53;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    int contd = 0, ituno[] = new int[50], itdos[] = new int[50], ittres[] = new int[50], itcuatro[] = new int[50], itcinco[] = new int[50], itseis[] = new int[50], iti[] = new int[50], itj[] = new int[50], itvar[] = new int[50];
    RoundedCornerButton ok, siguiente, anterior;
    JPanel def, espejo, otros;
    JLabel bienv, gene, rellu, relld;
    JTextField u, d, t, c, ci, s, eu, ed, et, ec, eci, es, textvar, textj, texti;
    Color light, dark, turquesa, cereza, esmeralda, celeste, fucsia, n;

    public Principal() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Metodo de inserción");
        this.setResizable(false);
        this.setSize(800, 330);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(5, 1, 6, 6));

        relld = new JLabel();
        rellu = new JLabel();

        def = new JPanel();
        espejo = new JPanel();
        otros = new JPanel();
        anterior = new RoundedCornerButton("Anterior");
        ok = new RoundedCornerButton("Aceptar");
        siguiente = new RoundedCornerButton("Siguiente");
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

        this.eu.setEditable(false);
        this.ed.setEditable(false);
        this.et.setEditable(false);
        this.ec.setEditable(false);
        this.eci.setEditable(false);
        this.es.setEditable(false);
        this.texti.setEditable(false);
        this.textj.setEditable(false);
        this.textvar.setEditable(false);

        light = new Color(245, 245, 245);
        dark = new Color(38, 50, 56);
        turquesa = new Color(22, 160, 133);
        cereza = new Color(231, 76, 60);
        esmeralda = new Color(46, 204, 113);
        celeste = new Color(128, 222, 234);
        fucsia = new Color(239, 93, 90);
        n = new Color(26, 158, 156);

        this.getContentPane().setBackground(light);
        this.def.setBackground(light);
        this.espejo.setBackground(light);
        this.otros.setBackground(light);

        this.bienv.setHorizontalAlignment((int) Principal.CENTER_ALIGNMENT);
        this.gene.setHorizontalAlignment((int) Principal.CENTER_ALIGNMENT);

        this.textvar.setBackground(light);
        this.texti.setBackground(light);
        this.textj.setBackground(light);
        this.textvar.setForeground(dark);
        this.texti.setForeground(dark);
        this.textj.setForeground(dark);
        this.textvar.setBorder(new RoundedCornerBorder());
        this.texti.setBorder(new RoundedCornerBorder());
        this.textj.setBorder(new RoundedCornerBorder());

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

        this.u.setSelectionColor(dark);
        this.u.setSelectedTextColor(light);
        this.d.setSelectionColor(dark);
        this.d.setSelectedTextColor(light);
        this.t.setSelectionColor(dark);
        this.t.setSelectedTextColor(light);
        this.c.setSelectionColor(dark);
        this.c.setSelectedTextColor(light);
        this.ci.setSelectionColor(dark);
        this.ci.setSelectedTextColor(light);
        this.s.setSelectionColor(dark);
        this.s.setSelectedTextColor(light);
        this.eu.setSelectionColor(dark);
        this.eu.setSelectedTextColor(light);
        this.ed.setSelectionColor(dark);
        this.ed.setSelectedTextColor(light);
        this.et.setSelectionColor(dark);
        this.et.setSelectedTextColor(light);
        this.ec.setSelectionColor(dark);
        this.ec.setSelectedTextColor(light);
        this.eci.setSelectionColor(dark);
        this.eci.setSelectedTextColor(light);
        this.es.setSelectionColor(dark);
        this.es.setSelectedTextColor(light);

        this.ok.setFocusPainted(false);
        this.siguiente.setFocusPainted(false);

        this.bienv.setForeground(dark);
        this.gene.setForeground(dark);

        this.ok.setBackground(n);
        this.ok.setForeground(dark);
        this.ok.setBorder(new LineBorder(dark));
        this.siguiente.setBackground(n);
        this.siguiente.setForeground(dark);
        this.siguiente.setBorder(new LineBorder(dark));
        this.anterior.setBackground(light);
        this.anterior.setForeground(dark);
        this.anterior.setBorder(new LineBorder(dark));

        this.bienv.setFont(u.getFont().deriveFont(30f));
        this.gene.setFont(u.getFont().deriveFont(30f));
        this.u.setFont(u.getFont().deriveFont(22f));
        this.d.setFont(u.getFont().deriveFont(22f));
        this.t.setFont(u.getFont().deriveFont(22f));
        this.c.setFont(u.getFont().deriveFont(22f));
        this.ci.setFont(u.getFont().deriveFont(22f));
        this.s.setFont(u.getFont().deriveFont(22f));
        this.eu.setFont(u.getFont().deriveFont(22f));
        this.ed.setFont(u.getFont().deriveFont(22f));
        this.et.setFont(u.getFont().deriveFont(22f));
        this.ec.setFont(u.getFont().deriveFont(22f));
        this.eci.setFont(u.getFont().deriveFont(22f));
        this.es.setFont(u.getFont().deriveFont(22f));
        this.anterior.setFont(u.getFont().deriveFont(22f));
        this.siguiente.setFont(u.getFont().deriveFont(22f));
        this.ok.setFont(u.getFont().deriveFont(22f));
        this.textvar.setFont(u.getFont().deriveFont(22f));
        this.textj.setFont(u.getFont().deriveFont(22f));
        this.texti.setFont(u.getFont().deriveFont(22f));

        this.def.setLayout(new GridLayout(1, 7, 6, 6));
        this.espejo.setLayout(new GridLayout(1, 7, 6, 6));
        this.otros.setLayout(new GridLayout(1, 6, 6, 6));

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
                    this.ituno[cont] = v[0];
                    this.itdos[cont] = v[1];
                    this.ittres[cont] = v[2];
                    this.itcuatro[cont] = v[3];
                    this.itcinco[cont] = v[4];
                    this.itseis[cont] = v[5];
                    this.iti[cont] = i;
                    this.itj[cont] = j;
                    this.itvar[cont] = VAR;
                    cont = cont + 1;
                    for (j = i - 1; j >= 0 && v[j] > VAR; j--) {
                        v[j + 1] = v[j];
                        this.ituno[cont] = v[0];
                        this.itdos[cont] = v[1];
                        this.ittres[cont] = v[2];
                        this.itcuatro[cont] = v[3];
                        this.itcinco[cont] = v[4];
                        this.itseis[cont] = v[5];
                        this.iti[cont] = i;
                        this.itj[cont] = j;
                        this.itvar[cont] = VAR;
                        cont = cont + 1;
                    }
                    v[j + 1] = VAR;
                    this.ituno[cont] = v[0];
                    this.itdos[cont] = v[1];
                    this.ittres[cont] = v[2];
                    this.itcuatro[cont] = v[3];
                    this.itcinco[cont] = v[4];
                    this.itseis[cont] = v[5];
                    this.iti[cont] = i;
                    this.itj[cont] = j;
                    this.itvar[cont] = VAR;
                    cont = cont + 1;
                    this.eu.setText(" " + u.getText());
                    this.ed.setText(" " + d.getText());
                    this.et.setText(" " + t.getText());
                    this.ec.setText(" " + c.getText());
                    this.eci.setText(" " + ci.getText());
                    this.es.setText(" " + s.getText());
                }
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Solo se aceptan digitos de tipo Entero en el array", "Error de digitacion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }

        }
        if (ac.getSource().equals(siguiente)) {
            if (ituno[contd] == 0 && itdos[contd] == 0 && ittres[contd] == 0 && itcuatro[contd] == 0 && itcinco[contd] == 0 && itseis[contd] == 0) {
                JOptionPane.showConfirmDialog(null, "Arreglado completamente ordenado", "FIN", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                String swd;
                swd = String.valueOf(ituno[contd]);
                this.eu.setText(" " + swd);
                swd = String.valueOf(itdos[contd]);
                this.ed.setText(" " + swd);
                swd = String.valueOf(ittres[contd]);
                this.et.setText(" " + swd);
                swd = String.valueOf(itcuatro[contd]);
                this.ec.setText(" " + swd);
                swd = String.valueOf(itcinco[contd]);
                this.eci.setText(" " + swd);
                swd = String.valueOf(itseis[contd]);
                this.es.setText(" " + swd);
                swd = String.valueOf(iti[contd]);
                this.texti.setText(" i: " + swd);
                swd = String.valueOf(itj[contd]);
                this.textj.setText(" j: " + swd);
                swd = String.valueOf(itvar[contd]);
                this.textvar.setText(" VAR: " + swd);
                this.contd = contd + 1;
            }
        }
        if (ac.getSource().equals(anterior)) {
            this.contd = contd - 1;
            String swd;
            swd = String.valueOf(ituno[contd]);
            this.eu.setText(" " + swd);
            swd = String.valueOf(itdos[contd]);
            this.ed.setText(" " + swd);
            swd = String.valueOf(ittres[contd]);
            this.et.setText(" " + swd);
            swd = String.valueOf(itcuatro[contd]);
            this.ec.setText(" " + swd);
            swd = String.valueOf(itcinco[contd]);
            this.eci.setText(" " + swd);
            swd = String.valueOf(itseis[contd]);
            this.es.setText(" " + swd);
            swd = String.valueOf(iti[contd]);
            this.texti.setText(" i: " + swd);
            swd = String.valueOf(itj[contd]);
            this.textj.setText(" j: " + swd);
            swd = String.valueOf(itvar[contd]);
            this.textvar.setText(" VAR: " + swd);
        }
    }
}

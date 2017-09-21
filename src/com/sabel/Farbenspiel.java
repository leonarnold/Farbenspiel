package com.sabel;

import javax.swing.*;

public class Farbenspiel extends JFrame {

    private JButton jbtnGruen;
    private JButton jbtnRot;
    private JButton jbtnBlau;
    private JPanel jpPanel;

    public Farbenspiel(){
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents(){
            jbtnGruen = new JButton("Grün");
            jbtnRot = new JButton("Rot");
            jbtnBlau = new JButton("Blau");
            jpPanel = new JPanel();
            jpPanel.add(jbtnGruen);
            jpPanel.add(jbtnRot);
            jpPanel.add(jbtnBlau);
            this.add(jpPanel);
        }


}


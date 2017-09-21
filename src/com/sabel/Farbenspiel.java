package com.sabel;

import javax.swing.*;

public class Farbenspiel extends JFrame {

    private JButton jbGruen;
    private JButton jbRot;
    private JButton jbBlau;
    private JPanel jPanel;

    public Farbenspiel(){
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.initComponents();
        this.iniEvent();
        this.setVisible(true);
    }

    private void iniEvent() {
        MeinActionListener mal = new MeinActionListener(jPanel);
        jbBlau.addActionListener(mal);
        jbGruen.addActionListener(mal);
        jbRot.addActionListener(mal);
    }

    public void initComponents(){
        jbGruen = new JButton("Grün");
        jbRot = new JButton("Rot");
        jbBlau = new JButton("Blau");
        jPanel = new JPanel();
        jPanel.add(jbGruen);
        jPanel.add(jbRot);
        jPanel.add(jbBlau);
        this.add(jPanel);
    }


}


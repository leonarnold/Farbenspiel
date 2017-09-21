package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        jbBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
        jbGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.GREEN);
            }
        });
        jbRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            }
        });
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


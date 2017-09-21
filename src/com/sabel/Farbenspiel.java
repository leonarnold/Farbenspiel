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
        MeinInnererActionListener mial = new MeinInnererActionListener();
        jbBlau.addActionListener(mial);
        jbGruen.addActionListener(mial);
        jbRot.addActionListener(mial);
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

    public class MeinInnererActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            switch (e.getActionCommand()){
                case "Rot":
                    jPanel.setBackground(Color.RED);
                    break;
                case "Grün":
                    jPanel.setBackground(Color.GREEN);
                    break;
                case "Blau":
                    jPanel.setBackground(Color.BLUE);
                    break;
            }
        }
    }


}


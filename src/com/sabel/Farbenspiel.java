package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenspiel extends JFrame implements ActionListener {

    private JButton jbtnGruen;
    private JButton jbtnRot;
    private JButton jbtnBlau;
    private JPanel jpPanel;

    public Farbenspiel(){
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.initComponents();
        this.initEvents();
        this.setVisible(true);
    }

    private void initEvents() {
            jbtnGruen.addActionListener(this);
            jbtnRot.addActionListener(this);
            jbtnBlau.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command){
            case "Grün":
                System.out.println("Grün");
                jpPanel.setBackground(Color.GREEN);
                break;
            case "Rot":
                System.out.println("Rot");
                jpPanel.setBackground(Color.RED);
                break;
            case "Blau":
                System.out.println("Blau");
                jpPanel.setBackground(Color.BLUE);
                break;
        }
//        if(e.getActionCommand()=="Grün"){
//            jpPanel.setBackground(Color.GREEN);
//        }
//        if(e.getActionCommand()=="Rot"){
//            jpPanel.setBackground(Color.RED);
//        }
//        if(e.getActionCommand()=="Blau"){
//            jpPanel.setBackground(Color.BLUE);
//        }
    }
}


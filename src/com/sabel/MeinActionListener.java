package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener{

    private JPanel jPanel;

    public MeinActionListener(JPanel jPanel){
        this.jPanel = jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

        switch (e.getActionCommand()){
            case "Rot":
                jPanel.setBackground(Color.RED);
                break;
            case "Blau":
                jPanel.setBackground(Color.BLUE);
                break;
            case "Grün":
                jPanel.setBackground(Color.GREEN);
                break;
        }

    }
}

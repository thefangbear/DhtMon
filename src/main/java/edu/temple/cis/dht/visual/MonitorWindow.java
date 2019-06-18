package edu.temple.cis.dht.visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonitorWindow implements ActionListener {

    JFrame mainFrame;

    JButton startButton;
    JButton stopButton;



    MonitorWindow(String name) {
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        mainFrame = new JFrame(name);
        startButton.setActionCommand("StartButton");
        stopButton.setActionCommand("StopButton");
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        mainFrame.getContentPane().add(startButton, BorderLayout.WEST);
        mainFrame.getContentPane().add(stopButton, BorderLayout.EAST);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
    }



    public void show() {
        mainFrame.setVisible(true);
    }

    public void hide() {
        mainFrame.setVisible(false);
    }

    public static void main(String[] args) {
        MonitorWindow m = new MonitorWindow("test");
        m.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "StartButton": System.out.println("MW: StartButton pressed"); break;
            case "StopButton": System.out.println("MW: StopButton pressed"); break;
            default:
                System.out.println("MW: Unknown ActionEvent of command: " + e.getActionCommand());
            break;
        }
    }
}

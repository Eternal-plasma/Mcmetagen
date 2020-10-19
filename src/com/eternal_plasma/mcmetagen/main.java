package com.eternal_plasma.mcmetagen;

import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String[] args)
    {
        new gui();
        JFrame frame = new JFrame ("Mcmetagen");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(main.class.getResource("/icon.png")));
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new gui());
        frame.pack();
        frame.setVisible (true);
        System.out.println("Online");

    }

}

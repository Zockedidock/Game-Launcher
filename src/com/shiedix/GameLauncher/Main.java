package com.shiedix.GameLauncher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import com.shiedix.SwingChaining.Button;

public class Main extends JFrame
{
    public final int WIDTH = 1444;
    public final int HEIGHT = 800;
    Container cp;
    static JFrame frame;

    Main()
    {
        super();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        var d = Toolkit.getDefaultToolkit().getScreenSize();
        var x = (d.width - WIDTH) / 2;
        var y = (d.height - HEIGHT) / 2;
        this.setLocation(x, y);
        this.setResizable(false);
        this.setVisible(true);
        cp = getContentPane();
        cp.setLayout(null);
        container(10, 10);
        addGameButton();
    }

    private void addGameButton()
    {
        Button addB = new Button("+");
        var addW = 66;
        var addH = 66;
        addB.set.bounds(getSize().width - addW - 20, getSize().height - addH - 44, addW, addH)
            .set.background(Color.red)
            .add.actionListener(this::addButtonPressed);
        cp.add(addB);
    }

    private void container(int x, int y)
    {
        JLabel wl = new JLabel("Welcome!");
        wl.setBounds(5, 0, 167, 20);
        cp.add(wl);
    }

    public static void main(String[] args)
    {
        frame = new Main();
    }

    public void addButtonPressed(ActionEvent evt)
    {
        System.out.println("clicked");
    }
}
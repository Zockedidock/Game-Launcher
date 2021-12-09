package com.shiedix.SwingChaining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Label extends JLabel
{
    public Label(String text) {
        this.setText(text);
    }
    public Label bounds(int x, int y, int width, int height)
    {
        this.setBounds(x, y, width, height);
        return this;
    }
    public Label background(Color bg)
    {
        this.setBackground(bg);
        return this;
    }
    public Label text(String text) {
        this.setText(text);
        return this;
    }
}

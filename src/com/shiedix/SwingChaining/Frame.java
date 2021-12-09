package com.shiedix.SwingChaining;

import javax.swing.*;

public class Frame extends JFrame
{
    public Frame defaultCloseOperation(int operation)
    {
        this.setDefaultCloseOperation(operation);
        return this;
    }
    public Frame size(int width, int height)
    {
        this.setSize(width, height);
        return this;
    }
    public Frame location(int x, int y) {
        this.setLocation(x, y);
        return this;
    }
}

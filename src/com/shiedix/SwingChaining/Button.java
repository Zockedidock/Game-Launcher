package com.shiedix.SwingChaining;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Button extends JButton
{
    public Add add = new Add(this);
    public Set set = new Set(this);
    public Button(String text) {
        this.setText(text);
    }

    public class Add
    {
        Button parent;
        Add(Button parent) {
            this.parent = parent;
        }

        public Button actionListener(ActionListener l)
        {
            parent.addActionListener(l);
            return parent;
        }
    }
    public class Set
    {
        Button parent;
        Set(Button parent) {
            this.parent = parent;
        }
        public Button bounds(int x, int y, int width, int height)
        {
            parent.setBounds(x, y, width, height);
            return parent;
        }
        public Button background(Color bg)
        {
            parent.setBackground(bg);
            return parent;
        }
        public Button text(String text)
        {
            parent.setText(text);
            return parent;
        }
    }
}

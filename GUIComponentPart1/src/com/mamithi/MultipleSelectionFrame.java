package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {
    private JList colorJList, copyJList;
    private JButton copyJButton;
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow" };

    public MultipleSelectionFrame(){
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                       copyJList.setListData(colorJList.getSelectedValues());
                    }
                }
        );

        add(copyJButton);

        copyJList = new JList();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );

        add(new JScrollPane(colorJList));
    }
}
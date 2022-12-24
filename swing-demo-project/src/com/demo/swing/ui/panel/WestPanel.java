package com.demo.swing.ui.panel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class WestPanel extends JPanel {

	public WestPanel() {
		super(new FlowLayout(FlowLayout.CENTER));
		setBorder(new LineBorder(Color.BLACK));
		add(new JLabel("West Panel"));
	}

	
}

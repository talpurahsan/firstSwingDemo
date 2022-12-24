package com.demo.swing.ui.panel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CentralPanel extends JPanel {

	public CentralPanel() {
		super(new FlowLayout(FlowLayout.CENTER));
		add(new JLabel("Central Panel"));
	}

	
}

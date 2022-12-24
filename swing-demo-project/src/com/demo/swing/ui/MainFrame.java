package com.demo.swing.ui;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public MainFrame() throws HeadlessException {
		super();
		setTitle("MainFrame");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	
}

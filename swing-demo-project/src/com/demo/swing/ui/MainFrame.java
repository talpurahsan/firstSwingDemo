package com.demo.swing.ui;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import com.demo.swing.ui.panel.CentralPanel;
import com.demo.swing.ui.panel.EastPanel;
import com.demo.swing.ui.panel.NorthPanel;
import com.demo.swing.ui.panel.SouthPanel;
import com.demo.swing.ui.panel.WestPanel;

public class MainFrame extends JFrame {

	public MainFrame() throws HeadlessException {
		super();
		setTitle("MainFrame");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setPanels();
	}
	
	private void setPanels() {
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new SouthPanel(), BorderLayout.SOUTH);
		add(new EastPanel(), BorderLayout.EAST);
		add(new WestPanel(), BorderLayout.WEST);
		add(new CentralPanel(), BorderLayout.CENTER);
	}
}

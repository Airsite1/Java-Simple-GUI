
package GUI;

import java.awt.BorderLayout;
import java.io.UnsupportedEncodingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class GuI {
	public JFrame frame;
	public JPanel iPanel, rPanel, bPanel, mainPanel;
	public JTextField rTF;
	public JLabel rLabel, dLabel, dRes, cLabel, cRes, aLabel, aRes;
	public JButton runButton;

	private final int W = 500, H = 150;

	public GuI() {
		// set up frame
		frame = new JFrame("hello!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
				new ImageIcon("/Users/sanjay/Desktop/CODE/Java/HighSchool/elon_god/src/GUI.jpg").getImage(), new Point(0, 0), "Yuh Yeet"));
		// set up Panels
		iPanel = new JPanel();
		iPanel.setPreferredSize(new Dimension(W, H / 3));
		iPanel.setBackground(Color.LIGHT_GRAY);
		rPanel = new JPanel();
		rPanel.setPreferredSize(new Dimension(W, H / 3));
		rPanel.setBackground(Color.LIGHT_GRAY);
		bPanel = new JPanel();
		bPanel.setPreferredSize(new Dimension(W, H / 3));
		bPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(W, H));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		// set up labels
		rLabel = new JLabel("Radius: ");
		dLabel = new JLabel("Diameter: ");
		cLabel = new JLabel("Circumference: ");
		aLabel = new JLabel("Area: ");
		dRes = new JLabel("___");
		cRes = new JLabel("___");
		aRes = new JLabel("___");
		// sets up da text field
		rTF = new JTextField(5);
		// set up da button
		runButton = new JButton("Run");
		runButton.addActionListener(new runListener());
		// add to da panels
		iPanel.add(rLabel);
		iPanel.add(rTF);
		rPanel.add(dLabel);
		rPanel.add(dRes);
		rPanel.add(cLabel);
		rPanel.add(cRes);
		rPanel.add(aLabel);
		rPanel.add(aRes);
		bPanel.add(runButton);
		mainPanel.add(iPanel);
		mainPanel.add(rPanel);
		mainPanel.add(bPanel);

		frame.getContentPane().add(mainPanel);
	}

	

	public class runListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String rad = rTF.getText();
			double r = Double.parseDouble(rad);
			Circle ball = new Circle(r);
			DecimalFormat df = new DecimalFormat("###.###");
			String d, c, a;
			d = df.format(ball.diameter);
			c = df.format(ball.circumference);
			a = df.format(ball.area);
			dRes.setText(d);
			cRes.setText(c);
			aRes.setText(a);
		}
	}
	public void display() {
		frame.pack();
		frame.setVisible(true);
	}

}

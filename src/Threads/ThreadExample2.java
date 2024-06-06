package Threads;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadExample2 extends JFrame implements ActionListener {
	
	static JTextField text;
	private JButton button;
	private JLabel lblNumber;
	static JLabel lblEmpty;
	
	public ThreadExample2()
	{
		setTitle("My Frame");
		setLocationRelativeTo(null);
		setSize(300,150);
		setVisible(true);
		setLayout(new GridLayout(2,2));
		
		text = new JTextField();
		button = new JButton("Calculate");
		lblNumber = new JLabel("Number");
		lblEmpty = new JLabel();
		
		button.addActionListener(this);
		
		Component[] comp = {lblNumber, text, lblEmpty, button};
		
		for (int i=0; i<comp.length; i++)
		{
			add(comp[i]);
		}

		
	}
	
	public static void main(String[] args) {
		
		new ThreadExample2();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		long value = Long.parseLong(text.getText());
		long sum = 0;
		
		for (long i=0; i<value; i++)
		{
			sum = sum + value;
		}
		
		lblEmpty.setText("Result: " + sum);
	}

}

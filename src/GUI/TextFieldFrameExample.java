package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrameExample extends JFrame {
	
	private JTextField txt1, txt2, txt3;
	private JPasswordField psw1;
	
	public TextFieldFrameExample()
	{
		setTitle("TextField and PasswordField Example");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,100);
		setVisible(true);
		
		txt1 = new JTextField("10"); // 10 kolon.
		add(txt1);
		
		txt2 = new JTextField("Enter text here");
		add(txt2);
		
		txt3 = new JTextField("uneditable text field", 21);
		txt3.setEditable(false);
		add(txt3);
		
		psw1 = new JPasswordField("Hidden Text");
		add(psw1);
		
		TextFieldHandler handler = new TextFieldHandler();
		txt3.addActionListener(handler);
		txt2.addActionListener(handler);
		txt1.addActionListener(handler);

	}
	
	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String string = "";
			
			if (e.getSource() == txt1)
			{
				string = String.format("txt1: %s", e.getActionCommand());
			}
			
			else if (e.getSource() == txt2)
			{
				string = String.format("txt2: %s", e.getActionCommand());
			}
			
			else if (e.getSource() == txt3)
			{
				string = String.format("txt3: %s", e.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
		
		public static void main(String[] args) {
			
			new TextFieldFrameExample();
		}
		
		
	}
	
	

}

package GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ButtonFrameExample extends JFrame implements ActionListener {

	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrameExample()
	{
		super("ButtonFrame Example");
		setLayout(new FlowLayout());
		
		plainButton = new JButton("Plain Button");
		add(plainButton);
		
		Icon photo1 = new ImageIcon(getClass().getResource("ProfilFotoğrafı1.jpg"));
		Icon photo2 = new ImageIcon(getClass().getResource("WhatsApp Image 2024-04-03 at 15.25.52.jpeg"));
		
		fancyButton = new JButton("Fancy Button", photo1);
		fancyButton.setRolloverIcon(photo2);
		add(fancyButton);
		
		fancyButton.addActionListener(this);
		plainButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, String.format("You pressed: &s", e.getActionCommand()));
	}
	
	public static void main(String[] arg)
	{
		ButtonFrameExample exp = new ButtonFrameExample();
		
		exp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exp.setSize(275,110);
		exp.setVisible(true);
	}
}

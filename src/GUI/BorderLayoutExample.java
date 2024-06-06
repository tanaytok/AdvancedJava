package GUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame implements ActionListener{
	
	private JButton[] buttons;
	private String[] ways = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
	private BorderLayout layout;
	
	public BorderLayoutExample()
	{
		setTitle("BorderLayout Example");
		setLocationRelativeTo(null);
		setSize(300,200);
		setVisible(true);
		
		layout = new BorderLayout(5,5);
		setLayout(layout);
		
		buttons = new JButton[ways.length];
		for (int i=0; i<ways.length; i++)
		{										// FOR DÖNGÜSÜ İLE BUTON ATAMA.
			buttons[i] = new JButton(ways[i]);
			buttons[i].addActionListener(this);
		}
		
		add(buttons[0],BorderLayout.NORTH);
		add(buttons[1],BorderLayout.SOUTH);
		add(buttons[2],BorderLayout.WEST);
		add(buttons[3],BorderLayout.EAST);
		add(buttons[4],BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for (JButton button : buttons)
		{
			if (e.getSource() == button)
			{
				button.setVisible(false);
			}
			else
			{
				button.setVisible(true);
			}
			layout.layoutContainer(getContentPane());
		}
	}
	
	public static void main(String[] args)
	{
		new BorderLayoutExample();
	}

}

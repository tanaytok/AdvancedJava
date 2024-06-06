package GUI;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrameExample extends JFrame implements ActionListener{

	private JButton[] buttons;
	private String[] numbers = {"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true;
	private Container container;
	private GridLayout grid1;
	private GridLayout grid2;
	
	public GridLayoutFrameExample()
	{
		super("GridLayout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
		setLayout(grid1);
		
		grid1 = new GridLayout(2,3,5,5);
		grid2 = new GridLayout(3,2);
		container = getContentPane();
		
		buttons = new JButton[numbers.length];
		
		for (int i=0; i<numbers.length; i++)
		{
			buttons[i] = new JButton(numbers[i]);
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (toggle)
		{
			container.setLayout(grid2);
		}
		else
		{
			container.setLayout(grid1);
			
			toggle = !toggle;
			container.validate();
		}
	}
	
	public static void main(String[] args)
	{
		new GridLayoutFrameExample();
	}
	
}

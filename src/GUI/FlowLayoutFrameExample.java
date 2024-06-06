package GUI;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrameExample extends JFrame implements ActionListener{
	
	private JButton leftButton;
	private JButton centerButton;
	private JButton rightButton;
	private FlowLayout layout;
	private Container container;
	
	public FlowLayoutFrameExample()
	{
		setTitle("FlowLayout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,75);
		setVisible(true);
		setLayout(layout);
		
		layout = new FlowLayout();
		container = getContentPane();
		
		leftButton = new JButton("Left");
		add(leftButton);
		leftButton.addActionListener(this);
		
		centerButton = new JButton("Center");
		add(centerButton);
		centerButton.addActionListener(this);
		
		rightButton = new JButton("Right");
		add(rightButton);
		rightButton.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (leftButton.isSelected())
		{
			layout.setAlignment(FlowLayout.LEFT);
			layout.layoutContainer(container);
		}
		else if (centerButton.isSelected())
		{
			layout.setAlignment(FlowLayout.CENTER);
			layout.layoutContainer(container);
		}
		else if (rightButton.isSelected())
		{
			layout.setAlignment(FlowLayout.RIGHT);
			layout.layoutContainer(container);
		}
	}
	
	public static void main(String[] args)
	{
		new FlowLayoutFrameExample();
	}

}

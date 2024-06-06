package GUI;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckboxFrameExample extends JFrame implements ItemListener{

	private JTextField txt1;
	private JCheckBox cbox1;
	private JCheckBox cbox2;
	
	public CheckboxFrameExample()
	{
		super("CheckboxFrame Example");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(275,100);
		setVisible(true);
		
		txt1 = new JTextField("Font style changin",20);
		txt1.setFont(new Font("Serif",Font.PLAIN,14));
		add(txt1);
		
		cbox1 = new JCheckBox("Bold");
		cbox2 = new JCheckBox("Italic");
		add(cbox1);
		add(cbox2);
		
		cbox1.addItemListener(this);
		cbox2.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		Font font = null;
		
		if (cbox1.isSelected() && cbox2.isSelected())
		{
			font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		}
		
		else if (cbox1.isSelected())
		{
			font = new Font("Serif", Font.BOLD, 14);
		}
		
		else if (cbox2.isSelected())
		{
			font = new Font("Serif", Font.ITALIC, 14);
		}
		
		else
		{
			font = new Font("Serif", Font.PLAIN, 14);
		}
		
		txt1.setFont(font);
		
	}
	
	public static void main(String[] args)
	{
		new CheckboxFrameExample();
	}
	
}

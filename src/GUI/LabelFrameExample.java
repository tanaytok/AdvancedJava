package GUI;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class LabelFrameExample extends JFrame {

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public LabelFrameExample()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label1");
		add(label1);
		
		Icon icon = new ImageIcon(getClass().getResource("WhatsApp Image 2024-04-03 at 15.25.52.jpeg"));
		label2 = new JLabel("Label with text and icon", icon, SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icon and text at bottom.");
		label3.setIcon(icon);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.CENTER);
		label3.setToolTipText("This is label3");
		add(label3);
	
	}
	
	public static void main(String[] args)
	{
		LabelFrameExample labelFrame = new LabelFrameExample();
		
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(260,180);
		labelFrame.setVisible(true);
	}
	
}

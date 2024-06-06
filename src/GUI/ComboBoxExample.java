package GUI;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxExample extends JFrame implements ItemListener{

	private JComboBox<String> ImagesJComboBox;
	private JLabel label;
	private String[] names = {"ProfilFotoğrafı1.jpg", "WhatsApp Image 2024-04-03 at 15.25.52.jpeg"};
	
	private Icon[] Icons = {
			
			new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1]))
	};
	
	public ComboBoxExample()
	{
		setTitle("ComboBox Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		setVisible(true);
		setLayout(new FlowLayout());
		
		ImagesJComboBox = new JComboBox<String>(names);
		ImagesJComboBox.setMaximumRowCount(3);
		ImagesJComboBox.addItemListener(this);
		add(ImagesJComboBox);
		
		label = new JLabel(Icons[0]);
		add(label);
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			label.setIcon(Icons[ImagesJComboBox.getSelectedIndex()]);
		}
	}
	
	public static void main(String[] args)
	{
		new ComboBoxExample();
	}
	
}

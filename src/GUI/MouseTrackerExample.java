package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerExample extends JFrame implements MouseListener{
	
	private JPanel mousePanel;
	private JLabel statusBar;
	
	public MouseTrackerExample()
	{
		super("Çılgın Mouse Haraketleri");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.white);
		add(mousePanel, BorderLayout.CENTER);
		mousePanel.addMouseListener(this);
		
		statusBar = new JLabel("Mouse outside JPanel");
		add(statusBar, BorderLayout.SOUTH);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Clicked at X: %d, Y: %d", e.getX(), e.getY()));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		statusBar.setText(String.format("Pressed at X: %d, Y: %d", e.getX(),e.getY()));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		statusBar.setText(String.format("Released at X: %d, Y: %d", e.getX(),e.getY()));
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		statusBar.setText(String.format("Mouse entered at X: %d, Y: %d", e.getX(),e.getY()));
		mousePanel.setBackground(Color.GREEN);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		statusBar.setText("Mouse outside JPanel");
		mousePanel.setBackground(Color.WHITE);
		
	}
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Dragged at X: %d, Y: %d", e.getX(),e.getY()));
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		statusBar.setText(String.format("Moved at X: %d, Y: %d", e.getX(),e.getY()));
		
	}
	
	public static void main(String[] args) {
		
		new MouseTrackerExample();
	}
	
	

}

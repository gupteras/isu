package realisu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Isu_Snake extends JPanel implements ActionListener{
	private String name = "Snake";
	private Container c;
	private JFrame menuscreen;
	private JButton startbutton, startbutton2;
	public Isu_Snake() {
		menuscreen = new JFrame("Snake Menu");
		startbutton = new JButton("1 Player");
		startbutton.setPreferredSize(new Dimension(100,100));
		startbutton.setBounds(150, 50, 100, 100);
		startbutton.addActionListener(this);
		startbutton2 = new JButton("2 Players");
		startbutton2.setPreferredSize(new Dimension(100,100));
		startbutton2.setBounds(150, 250, 100, 100);
		startbutton2.addActionListener(this);
		setVisible(true);
		menuscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = menuscreen.getContentPane();
		this.setLayout(null);
		this.add(startbutton);
		this.add(startbutton2);
		c.add(this);
		this.setPreferredSize(new Dimension(400,400));
		menuscreen.pack();
		menuscreen.setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawString(name, 190, 10);
	}
	
	public static void main(String[]args) {
		new Isu_Snake();
	}
		
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object a = ae.getSource();
		if(a == startbutton) {
			this.menuscreen.dispose();
			new GameScreen();
		}
		Object b = ae.getSource();{	
		if(b == startbutton2) {
			this.menuscreen.dispose();
			new GameScreen();
			}
		}
		
	}		
}



package conwaysgameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class LifePanel extends JPanel {
	
	public long lastClick = 0;
	
	public LifePanel(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){	
				System.out.println(e.getX());
				System.out.println(e.getY());
				int x = e.getX() / 10;
				int y = e.getY() / 10;
				Arraycontrol.currentArray[x+1][y+1] = 1;
				repaint();
				lastClick = System.currentTimeMillis();
			}
		}
		);	
	}

	protected void paintComponent(Graphics g) {
		int width = 10;
		int height = 10;
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		for (int y = 0; y < Arraycontrol.ySize; ++y) {
			for (int x = 0; x < Arraycontrol.xSize; ++x) {
				if (Arraycontrol.currentArray[x+1][y+1] == 1) {
					g.fillRect(x * width, y * height, width, height);
				}
			}
		}
		
	}
}
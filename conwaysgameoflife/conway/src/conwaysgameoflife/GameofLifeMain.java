package conwaysgameoflife;

import javax.swing.JFrame;

public class GameofLifeMain {

	
	public static void thingA() {
		Arraycontrol.currentArray[2][2] = 1;
		Arraycontrol.currentArray[2][3] = 1;
		Arraycontrol.currentArray[2][4] = 1;
	}
	public static void thingB() {
		Arraycontrol.currentArray[2][1] = 1;
		Arraycontrol.currentArray[3][2] = 1;
		Arraycontrol.currentArray[1][3] = 1;
		Arraycontrol.currentArray[2][3] = 1;
		Arraycontrol.currentArray[3][3] = 1;
	}

	
	public static void main(String[] args) {
		Arraycontrol.nextArray = Arraycontrol.newArray();
		Arraycontrol.currentArray = Arraycontrol.newArray();
		
		JFrame frame = new JFrame();
		LifePanel panel = new LifePanel();
		frame.add(panel);
		frame.setSize(640, 480);
		frame.setVisible(true);
		

		thingB();
		while(true){
			try{
				if ((System.currentTimeMillis() - panel.lastClick) > 1000) {
					Thread.sleep(250);
				} else {
					Thread.sleep(10000);
				}
			}catch(InterruptedException e){
			
			}
			
		for(int x = 0; x < Arraycontrol.xSize; x++ ){
			for(int y = 0; y < Arraycontrol.ySize; y++){
				 Arraycontrol.nextArray[x+1][y+1] = CellBehavior.liveordie(x,y);
			}
		}
		for(int y = 1; y <  Arraycontrol.ySize + 1; y++){
			for(int x = 1; x < Arraycontrol.xSize + 1; x++){
			}
		}
		panel.repaint();
		int[][] tmp = Arraycontrol.currentArray;
		Arraycontrol.currentArray = Arraycontrol.nextArray;
		Arraycontrol.nextArray = tmp;
		}
}
}
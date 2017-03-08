package conwaysgameoflife;

public class CellBehavior {
	
	// returns 0 for dead, 1 for live 
	public static int liveordie(int x, int y){
		int neighbours = 0;
		neighbours += Arraycontrol.currentArray[x][y];
		neighbours += Arraycontrol.currentArray[x+1][y];
		neighbours += Arraycontrol.currentArray[x+2][y];
		neighbours += Arraycontrol.currentArray[x][y+1];
		neighbours += Arraycontrol.currentArray[x+2][y+1];
		neighbours += Arraycontrol.currentArray[x][y+2];
		neighbours += Arraycontrol.currentArray[x+1][y+2];
		neighbours += Arraycontrol.currentArray[x+2][y+2];
		
		if (Arraycontrol.currentArray[x+1][y+1] == 1) {
			// this cell is live
			if (neighbours == 2 || neighbours == 3) {
				return 1;
			} else {
				return 0;
			}
		} else {
			// this cell is dead
			if (neighbours == 3) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

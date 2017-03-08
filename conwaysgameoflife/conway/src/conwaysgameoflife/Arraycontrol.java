package conwaysgameoflife;

public class Arraycontrol {
	
	static int xSize = 500;
	static int ySize = 500;
	
	public static int[][] newArray(){
	int[][] main = new int[xSize + 2][ySize + 2];
	try{
	for(int x = 0; x < xSize + 2; x++){
		for(int y = 0; y < ySize + 2; y++){
			main[x][y] = 0;
		}
	}
	}catch(IndexOutOfBoundsException e){
		System.out.println(e.getMessage());
	}
	return main;
	}
	public static int[][] currentArray;
	public static int[][] nextArray;
}


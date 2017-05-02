import java.util.Arrays;
import java.util.HashMap;

public class Cube {
	public static int currentLocation;
	
	public Cube(int c) {
		c = currentLocation;
	}

	public static String[][] createSide(String myColor) {
		String[][] side = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				side[i][j] = myColor;
			}
		}
		return side;
	}
	
	public static HashMap createCube(HashMap<Integer, String[][]> cube) {
		String[] colors = {"red", "green", "blue", "orange", "white", "yellow"};
		for (int i = 0; i < 6; i++) {
			cube.put(i, (createSide(colors[i])));
		}
		return cube;
	}
	
	public static void printSide(HashMap<Integer, String[][]> cube) {
		//Display values with key
		String[][] var = cube.get(currentLocation);
	    for(int r=0; r<var.length; r++) {
	        for(int c=0; c<var[r].length; c++)
	            System.out.print(var[r][c] + " ");
	        System.out.println();
	     }
	}
	
	public static void updateLocation(int side) {
		currentLocation = side - 1;
		if (side > 6) {
			System.out.println("Warning: an invalid integer has been inputted");
		}
	}
	
	public static void printCube(HashMap<Integer, String[][]> cube) { 
		 System.out.println(Arrays.asList(cube));
	}
	
	public static void shiftRow() {
		//TODO
	}
	
	public static void shiftCol() {
		//TODO
	}
	
	public static HashMap randomCube() {
		//TODO
	}
	
	public static boolean checkSolved() {
		
	}
}

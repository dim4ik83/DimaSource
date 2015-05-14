package com.sourceit.javabasic.sungurov.HT3;


public class MakeMaze {

	Cell [][] Maze = new Cell [5][5];
	
	public Cell [][] setMaze() {

		Cell Cell1 = new Cell ();
	
		for (int i=0; i<Maze.length; i++) {
		
			for (int j=0; j<Maze.length; j++) {
			
//				Maze [i][j] = Cell1.setCell();
				
				Maze [i][j] = Cell1;
	
		}
		
	}
	return null;

}
	
	public Cell [][] getMaze(){
		
		for (int i=0; i<Maze.length; i++) {
			
			for (int j=0; j<Maze.length; j++){
			
			System.out.print(Maze[i][j] + " ");

			}
			
			System.out.println();
			
		}
		return null;

	}

}
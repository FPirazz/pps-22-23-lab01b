package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Chessboard board;
	 
    public LogicsImpl(final int gridSize){
    	board = new ChessboardImpl(gridSize);
	}

	public LogicsImpl(final int gridSize, final Pair<Integer, Integer> knightPosition, Pair<Integer, Integer> pawnPosition) {
		board = new ChessboardImpl(gridSize, knightPosition, pawnPosition);
	}
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.board.getSize() || col >= this.board.getSize()) {
			throw new IndexOutOfBoundsException();
		}
		// Below a compact way to express allowed moves for the knight
		int x = row-this.board.getKnight().getX();
		int y = col-this.board.getKnight().getY();
		if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
			this.board.setKnight( new Pair<>(row,col) );
			return this.board.getPawn().equals(this.board.getKnight());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.board.getKnight().equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.board.getKnight().equals(new Pair<>(row,col));
	}


}
